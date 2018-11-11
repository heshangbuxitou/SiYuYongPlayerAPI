package com.siyuyong.service;

import cn.hutool.core.codec.Base64;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.siyuyong.constant.Constant;
import com.siyuyong.domain.NeteaseGetAlbumResult;
import com.siyuyong.domain.NeteaseGetArtistResult;
import com.siyuyong.domain.NeteaseGetPlaylistResult;
import com.siyuyong.domain.NeteaseSearchResult;
import com.siyuyong.util.HttpRequestUtil;
import com.siyuyong.util.MapGenerateUtil;
import com.siyuyong.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.*;
import java.util.logging.Logger;

@Component
@Order(value = 1)
public class NeteaseReplayService implements ReplayService {

    private static final String modulus = "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7",
            nonce = "0CoJUm6Qyw8W8jud",
            pubKey = "010001";
    private static final String AES_CBC_PADDING = "AES/CBC/PKCS5Padding";
    private static final Charset charset = Charset.forName("UTF-8");

    public String getPort() {
        return Constant.DEFAULT_SERVER_PORT;
    }

    public String neteaseRequest(String url, Map<String, Object> data) {
        Map<String, List<String>> extraHeaders = new HashMap<>();
        extraHeaders.put("Accept", Arrays.asList("*/*"));
        extraHeaders.put("Accept-Encoding", Arrays.asList("gzip,deflate,sdch"));
        extraHeaders.put("Accept-Language", Arrays.asList("zh-CN,zh;q=0.8,gl;q=0.6,zh-TW;q=0.4"));
        extraHeaders.put("Connection", Arrays.asList("keep-alive"));
        extraHeaders.put("Content-Type", Arrays.asList("application/x-www-form-urlencoded"));
        extraHeaders.put("Host", Arrays.asList("music.163.com"));
        extraHeaders.put("Referer", Arrays.asList("http://music.163.com/search/"));
        extraHeaders.put("User-Agent", Arrays.asList("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2)" +
                " AppleWebKit/537.36 (KHTML, like Gecko) Chrome" +
                "/33.0.1750.152 Safari/537.36"));
        if (data != null) {
            return HttpRequestUtil.PostRequest(url, extraHeaders, data);
        }
        return HttpRequestUtil.GetRequest(url, extraHeaders, null);
    }

    public String neteaseRequest(String url) {
        return neteaseRequest(url, null);
    }

    private Object convertSong(NeteaseSearchResult.ResultBean.SongsBean song) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "netrack_" + song.getId());
        map.put("title", song.getName());
        map.put("artist", song.getArtists().get(0).getName());
        map.put("artist_id", "neartist_" + song.getArtists().get(0).getId());
        map.put("album", song.getAlbum().getName());
        map.put("album_id", "nealbum_" + song.getAlbum().getId());
        map.put("source", "netease");
        map.put("source_url", "http://music.163.com/#/song?id=" + song.getId());
        map.put("disabled", !nePlayable(song));

        if (song.getAlbum().getPicUrl() != null) {
            map.put("img_url", song.getAlbum().getPicUrl());
        } else {
            map.put("img_url", "");
        }
        map.put("url", HttpUtil.urlWithForm("http://" + MyUtils.getLocalhostIp() + ":" + getPort() + "/bootstrap_track",
                MapGenerateUtil.createMap(new String[]{"track_id"}, new Object[]{map.get("id")})
                , Charset.forName("utf-8"), true));
        return map;
    }

    private boolean weapiNePlayable(NeteaseGetPlaylistResult.PrivilegesBean privilegesBean) {
        return privilegesBean.getSubp() == 1;
    }

    private Object weapiConvertSong(NeteaseGetPlaylistResult.PlaylistBean.TracksBean song, NeteaseGetPlaylistResult.PrivilegesBean privilegesBean) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "netrack_" + song.getId());
        map.put("title", song.getName());
        map.put("artist", song.getAr().get(0).getName());
        map.put("artist_id", "neartist_" + song.getAr().get(0).getId());
        map.put("album", song.getAl().getName());
        map.put("album_id", "nealbum_" + song.getAl().getId());
        map.put("source", "netease");
        map.put("source_url", "http://music.163.com/#/song?id=" + song.getId());
        map.put("img_url", song.getAl().getPicUrl());
        map.put("disabled", !weapiNePlayable(privilegesBean));

        map.put("url", HttpUtil.urlWithForm("http://" + MyUtils.getLocalhostIp() + ":" + getPort() + "/bootstrap_track",
                MapGenerateUtil.createMap(new String[]{"track_id"}, new Object[]{map.get("id")})
                , Charset.forName("utf-8"), true));
        return map;
    }

    private String createSecretKey(int size) {
        final String b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int d = 0; d < size; d++) {
            int e = (int) Math.floor(Math.random() * b.length());
            sb.append(b.charAt(e));
        }
        return sb.toString();
    }

    private boolean nePlayable(NeteaseSearchResult.ResultBean.SongsBean song) {
        return song.getStatus() >= 0 && song.getFee() != 4;
    }

    public String fastExpMod(BigInteger b, BigInteger e, BigInteger m) {
        BigInteger number1 = new BigInteger(String.valueOf(1));
        BigInteger number0 = new BigInteger(String.valueOf(0));
        BigInteger result = number1;

        while (!e.equals(number0)) {
            if (e.and(number1).equals(number1)) {
                result = result.multiply(b).mod(m);
            }
            e = e.shiftRight(1);
            b = b.multiply(b).mod(m);
        }
        return result.toString(16);
    }

    public String rsaEncrypt(String text, String pubKey, String modulus) {
        text = new StringBuilder(text).reverse().toString();

        BigInteger b1 = new BigInteger(text.getBytes());
        BigInteger b2 = new BigInteger(pubKey, 16);
        BigInteger b3 = new BigInteger(modulus, 16);

        String result = fastExpMod(b1, b2, b3);
        while (result.length() < 256)
            result = "0" + result;
        return result;
    }

    public String aesEncrypt(String text, String secKey) {
        try {
            Cipher cipher = Cipher.getInstance(AES_CBC_PADDING);
            SecretKeySpec key = new SecretKeySpec(secKey.getBytes(charset), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec("0102030405060708".getBytes(charset)));
            byte[] data = cipher.doFinal(text.getBytes(charset));
            String result = Base64.encode(data);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private Map<String, Object> encryptedRequest(Map<String, Object> paramMap) {
        String text = JSON.toJSONString(paramMap);
        String secKey = createSecretKey(16);
        String encText = aesEncrypt(aesEncrypt(text, nonce), secKey);
        String encSecKey = rsaEncrypt(secKey, pubKey, modulus);

        return MapGenerateUtil.createMap(new String[]{"params", "encSecKey"},
                new Object[]{encText, encSecKey}, LinkedHashMap.class);
    }

    @Override
    public String searchTrack(String keyword) {
        String urlKeyWord = MyUtils.urlEncode(keyword);
        String url = "http://music.163.com/api/search/get";
        int stype = 1, offset = 0;
        String total = "true";
        Map<String, Object> paramMap = MapGenerateUtil.createMap(new String[]{"s", "type", "offset", "total", "limit"},
                new Object[]{urlKeyWord, stype, offset, total, 60});
        String response = neteaseRequest(url, paramMap);

        NeteaseSearchResult data = JSON.parseObject(response, NeteaseSearchResult.class);
        List<NeteaseSearchResult.ResultBean.SongsBean> songs = data.getResult().getSongs();
        List<Object> result = new ArrayList<>();
        for (NeteaseSearchResult.ResultBean.SongsBean song : songs) {
            if (song.getStatus() != -1) {
                result.add(convertSong(song));
            }
        }
        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"result"}, new Object[]{result}));
    }

    @Override
    public String getLyricById(String songId) {
        Map<String, Object> paramMap = MapGenerateUtil.createMap(new String[]{"id", "lv", "tv", "csrf_token"},
                new Object[]{songId, -1, -1, ""}, LinkedHashMap.class);
        paramMap = encryptedRequest(paramMap);
        String url = "http://music.163.com/weapi/song/lyric?csrf_token=";
        String response = neteaseRequest(url, paramMap);
        JSONObject data = JSON.parseObject(response);
        String lrc = data.containsKey("lrc") ? data.getJSONObject("lrc").getString("lyric") : "";
        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"lyric"}, new Object[]{lrc}));
    }

    @Override
    public String listPlaylist(String offset) {
        List<Object> result = new ArrayList<>();
        for (Object obj : topPlaylists(Integer.parseInt(offset))) {
            JSONObject map = (JSONObject) obj;
            String[] keyList = {"cover_img_url", "title", "play_count", "list_id", "source_url"};
            Object[] valueList = {map.getString("coverImgUrl") + "?param=140y140", map.getString("name"),
                    map.getString("playCount"), "http://music.163.com/#/playlist?id=" + map.get("id")};
            result.add(MapGenerateUtil.createMap(keyList, valueList));
        }
        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"result"}, new Object[]{result}));
    }

    //参考 https://github.com/darknessomi/musicbox
    // # 歌单（网友精选碟） hot||new http://music.163.com/#/discover/playlist/
    public JSONArray topPlaylists(int offset) {
        String category = MyUtils.urlEncode("全部");
        String total = offset != 0 ? "true" : "false";
        String action = "http://music.163.com/api/playlist/list?cat=" + category +
                "&order=hot&offset=" + offset + "&total=" + total + "&limit=" + 35;
        String reponse = neteaseRequest(action);
        return JSON.parseObject(reponse).getJSONArray("playlists");
    }

    @Override
    public Map<String, Object> getPlaylist(String listId) {
        String[] typeAndId = listId.split("_");
        switch (typeAndId[0]) {
            case "neplaylist":
                return neGetPlaylist(typeAndId[1]);
            case "nealbum":
                return getAlbum(typeAndId[1]);
            case "neartist":
                return getArtist(typeAndId[1]);
        }
        throw new RuntimeException("不存在的Playlist类型" + typeAndId[0]);
    }

    private Map<String, Object> getArtist(String artistId) {
        String url = "http://music.163.com/api/artist/" + artistId;
        String resonpse = neteaseRequest(url);
        NeteaseGetArtistResult data = JSON.parseObject(resonpse, NeteaseGetArtistResult.class);

        String[] keyList = {"cover_img_url", "title", "id", "source_url"};
        Object[] valueList = {data.getArtist().getPicUrl(), data.getArtist().getName(),
                "neartist_" + artistId, "http://music.163.com/#/artist?id=" + artistId};
        Map<String, Object> infoMap = MapGenerateUtil.createMap(keyList, valueList);

        List<NeteaseSearchResult.ResultBean.SongsBean> list = data.getHotSongs();
        List<Object> result = new ArrayList<>();
        for (NeteaseSearchResult.ResultBean.SongsBean song : list) {
            if (song.getStatus() != -1) {
                result.add(convertSong(song));
            }
        }
        return MapGenerateUtil.createMap(new String[]{"tracks", "info"}, new Object[]{result, infoMap});
    }

    private Map<String, Object> neGetPlaylist(String playlistId) {
        String url = "http://music.163.com/weapi/v3/playlist/detail";
        Map<String, Object> paramMap = MapGenerateUtil.createMap(new String[]{"id", "offset", "total", "limit", "n", "csrf_token"},
                new Object[]{playlistId, 0, true, 1000, 1000, ""}, LinkedHashMap.class);
        paramMap = encryptedRequest(paramMap);
        String resonpse = neteaseRequest(url, paramMap);
        NeteaseGetPlaylistResult data = JSON.parseObject(resonpse, NeteaseGetPlaylistResult.class);

        String[] keyList = {"cover_img_url", "title", "id", "source_url"};
        Object[] valueList = {data.getPlaylist().getCoverImgUrl(), data.getPlaylist().getName(),
                "neplaylist_" + playlistId, "http://music.163.com/#/playlist?id=" + playlistId};
        Map<String, Object> infoMap = MapGenerateUtil.createMap(keyList, valueList);
        List<NeteaseGetPlaylistResult.PlaylistBean.TracksBean> list = data.getPlaylist().getTracks();
        List<Object> result = new ArrayList<>();
        int index = 0;
        for (NeteaseGetPlaylistResult.PlaylistBean.TracksBean song : list) {
            result.add(weapiConvertSong(song, data.getPrivileges().get(index)));
            index++;
        }
        return MapGenerateUtil.createMap(new String[]{"tracks", "info"}, new Object[]{result, infoMap});
    }

    private Map<String, Object> getAlbum(String albumId) {
        String url = String.format("http://music.163.com/api/album/%s/", albumId);
        String resonpse = neteaseRequest(url);
        NeteaseGetAlbumResult data = JSON.parseObject(resonpse, NeteaseGetAlbumResult.class);

        String[] keyList = {"cover_img_url", "title", "id", "source_url"};
        Object[] valueList = {data.getAlbum().getPicUrl(), data.getAlbum().getName(),
                "nealbum_" + albumId, "http://music.163.com/#/album?id=" + albumId};
        Map<String, Object> infoMap = MapGenerateUtil.createMap(keyList, valueList);

        List<NeteaseSearchResult.ResultBean.SongsBean> list = data.getAlbum().getSongs();
        List<Object> result = new ArrayList<>();
        for (NeteaseSearchResult.ResultBean.SongsBean song : list) {
            if (song.getStatus() != -1) {
                result.add(convertSong(song));
            }
        }
        return MapGenerateUtil.createMap(new String[]{"tracks", "info"}, new Object[]{result, infoMap});
    }

    @Override
    public String getUrlById(String songId) {
        Logger.getAnonymousLogger().info(songId);
        Map<String, Object> paramMap = MapGenerateUtil.createMap(new String[]{"ids", "br", "csrf_token"},
                new Object[]{Arrays.asList(songId), 12800, ""}, LinkedHashMap.class);
        String url = "http://music.163.com/weapi/song/enhance/player/url?csrf_token=";
        paramMap = encryptedRequest(paramMap);
        String response = neteaseRequest(url, paramMap);
        JSONObject data = JSON.parseObject(response);
        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"song_url"},
                new Object[]{data.getJSONArray("data").getJSONObject(0).getString("url")}));
    }
}
