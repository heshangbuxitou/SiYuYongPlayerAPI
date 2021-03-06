package com.siyuyong.service;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.lang.Dict;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.siyuyong.constant.Constant;
import com.siyuyong.domain.*;
import com.siyuyong.util.HttpRequestUtil;
import com.siyuyong.util.MyUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.annotation.Order;
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

    private static final int RSA_ENCRYPT_LENGTH = 256;

    public String getPort() {
        return Constant.DEFAULT_SERVER_PORT;
    }

    public String neteaseRequest(String url, Map<String, Object> data) {
        Map<String, List<String>> extraHeaders = new HashMap<>(32);
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

    private ConvertSongBean convertSong(NeteaseSearchResult.ResultBean.SongsBean song) {
        ConvertSongBean songBean = new ConvertSongBean();
        songBean.setId("netrack_" + song.getId());
        songBean.setTitle(song.getName());
        songBean.setArtist(song.getArtists().get(0).getName());
        songBean.setArtist_id("neartist_" + song.getArtists().get(0).getId());
        songBean.setAlbum(song.getAlbum().getName());
        songBean.setAlbum_id("nealbum_" + song.getAlbum().getId());
        songBean.setSource("netease");
        songBean.setSource_url("http://music.163.com/#/song?id=" + song.getId());
        songBean.setDisabled(!nePlayable(song));
        songBean.setImg_url(song.getAlbum().getPicUrl() != null ? song.getAlbum().getPicUrl() : "");
        songBean.setUrl(HttpUtil.urlWithForm("http://" + Constant.DEFAULT_SERVER_IP + ":" + getPort() + "/bootstrap_track",
                Dict.create().set("track_id", songBean.getId())
                , Charset.forName("utf-8"), true));
        return songBean;
    }

    private boolean weapiNePlayable(NeteaseGetPlaylistResult.PrivilegesBean privilegesBean) {
        return privilegesBean.getSubp() == 1;
    }

    private ConvertSongBean weapiConvertSong(NeteaseGetPlaylistResult.PlaylistBean.TracksBean song, NeteaseGetPlaylistResult.PrivilegesBean privilegesBean) {
        ConvertSongBean songBean = new ConvertSongBean();
        songBean.setId("netrack_" + song.getId());
        songBean.setTitle(song.getName());
        songBean.setArtist(song.getAr().get(0).getName());
        songBean.setArtist_id("neartist_" + song.getAr().get(0).getId());
        songBean.setAlbum(song.getAl().getName());
        songBean.setAlbum_id("nealbum_" + song.getAl().getId());
        songBean.setSource("netease");
        songBean.setSource_url("http://music.163.com/#/song?id=" + song.getId());
        songBean.setDisabled(!weapiNePlayable(privilegesBean));
        songBean.setImg_url(song.getAl().getPicUrl());
        songBean.setUrl(HttpUtil.urlWithForm("http://" + Constant.DEFAULT_SERVER_IP + ":" + getPort() + "/bootstrap_track",
                Dict.create().set("track_id", songBean.getId())
                , Charset.forName("utf-8"), true));
        return songBean;
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
        return StringUtils.leftPad(result, RSA_ENCRYPT_LENGTH, "0");
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

        return Dict.create().set("params", encText).set("encSecKey", encSecKey);
    }

    @Override
    public SearchResult searchTrack(String keyword) {
        String urlKeyWord = MyUtils.urlEncode(keyword);
        String url = "http://music.163.com/api/search/get";
        int stype = 1, offset = 0;
        String total = "true";
        Map<String, Object> paramMap = Dict.create().set("s", urlKeyWord).set("type", stype).set("offset", offset)
                .set("total", total).set("limit", 60);
        String response = neteaseRequest(url, paramMap);

        NeteaseSearchResult data = JSON.parseObject(response, NeteaseSearchResult.class);
        List<NeteaseSearchResult.ResultBean.SongsBean> songs = data.getResult().getSongs();
        SearchResult result = new SearchResult();
        for (NeteaseSearchResult.ResultBean.SongsBean song : songs) {
            if (song.getStatus() != -1) {
                result.getResult().add(convertSong(song));
            }
        }
        return result;
    }

    @Override
    public LyricResult getLyricById(String songId) {
        Map<String, Object> paramMap = Dict.create().set("id", songId).set("lv", -1).set("tv", -1).set("csrf_token", "");
        paramMap = encryptedRequest(paramMap);
        String url = "http://music.163.com/weapi/song/lyric?csrf_token=";
        String response = neteaseRequest(url, paramMap);
        JSONObject data = JSON.parseObject(response);
        String lrc = data.containsKey("lrc") ? data.getJSONObject("lrc").getString("lyric") : "";
        return new LyricResult(lrc);
    }

    @Override
    public ListPlayListResult listPlaylist(String offset) {
        ListPlayListResult result = new ListPlayListResult();

        for (Object obj : topPlaylists(Integer.parseInt(offset))) {
            JSONObject map = (JSONObject) obj;
            ListPlayListResult.ResultBean resultBean = new ListPlayListResult.ResultBean();
            resultBean.setCover_img_url(map.getString("coverImgUrl") + "?param=140y140");
            resultBean.setTitle(map.getString("name"));
            resultBean.setPlay_count(map.getInteger("playCount"));
            resultBean.setList_id("neplaylist_" + map.get("id"));
            resultBean.setSource_url("http://music.163.com/#/playlist?id=" + map.get("id"));
            result.getResult().add(resultBean);
        }
        return result;
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
    public PlayListResult getPlaylist(String listId) {
        String[] typeAndId = listId.split("_");
        switch (typeAndId[0]) {
            case "neplaylist":
                return neGetPlaylist(typeAndId[1]);
            case "nealbum":
                return getAlbum(typeAndId[1]);
            case "neartist":
                return getArtist(typeAndId[1]);
            default:
                throw new RuntimeException("不存在的Playlist类型" + typeAndId[0]);
        }
    }

    private PlayListResult getArtist(String artistId) {
        String url = "http://music.163.com/api/artist/" + artistId;
        String resonpse = neteaseRequest(url);
        NeteaseGetArtistResult data = JSON.parseObject(resonpse, NeteaseGetArtistResult.class);
        List<NeteaseSearchResult.ResultBean.SongsBean> list = data.getHotSongs();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(data.getArtist().getPicUrl());
        infoBean.setTitle(data.getArtist().getName());
        infoBean.setId("neartist_" + artistId);
        infoBean.setSource_url("http://music.163.com/#/artist?id=" + artistId);
        result.setInfo(infoBean);

        for (NeteaseSearchResult.ResultBean.SongsBean song : list) {
            if (song.getStatus() != -1) {
                result.getTracks().add(convertSong(song));
            }
        }
        return result;
    }

    private PlayListResult neGetPlaylist(String playlistId) {
        String url = "http://music.163.com/weapi/v3/playlist/detail";
        Map<String, Object> paramMap = Dict.create().set("id", playlistId).set("offset", 0).set("total", true)
                .set("limit", 1000).set("n", 1000).set("csrf_token", "");
        paramMap = encryptedRequest(paramMap);
        String resonpse = neteaseRequest(url, paramMap);
        NeteaseGetPlaylistResult data = JSON.parseObject(resonpse, NeteaseGetPlaylistResult.class);
        List<NeteaseGetPlaylistResult.PlaylistBean.TracksBean> list = data.getPlaylist().getTracks();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(data.getPlaylist().getCoverImgUrl());
        infoBean.setTitle(data.getPlaylist().getName());
        infoBean.setId("neplaylist_" + playlistId);
        infoBean.setSource_url("http://music.163.com/#/playlist?id=" + playlistId);
        result.setInfo(infoBean);

        int index = 0;
        for (NeteaseGetPlaylistResult.PlaylistBean.TracksBean song : list) {
            result.getTracks().add(weapiConvertSong(song, data.getPrivileges().get(index)));
            index++;
        }
        return result;
    }

    private PlayListResult getAlbum(String albumId) {
        String url = String.format("http://music.163.com/api/album/%s/", albumId);
        String resonpse = neteaseRequest(url);
        NeteaseGetAlbumResult data = JSON.parseObject(resonpse, NeteaseGetAlbumResult.class);
        List<NeteaseSearchResult.ResultBean.SongsBean> list = data.getAlbum().getSongs();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(data.getAlbum().getPicUrl());
        infoBean.setTitle(data.getAlbum().getName());
        infoBean.setId("nealbum_" + albumId);
        infoBean.setSource_url("http://music.163.com/#/album?id=" + albumId);
        result.setInfo(infoBean);

        for (NeteaseSearchResult.ResultBean.SongsBean song : list) {
            if (song.getStatus() != -1) {
                result.getTracks().add(convertSong(song));
            }
        }
        return result;
    }

    @Override
    public BootstrapResult getUrlById(String songId) {
        Logger.getAnonymousLogger().info(songId);
        Map<String, Object> paramMap = Dict.create().set("ids", Arrays.asList(songId))
                .set("br", 12800).set("csrf_token", "");
        String url = "http://music.163.com/weapi/song/enhance/player/url?csrf_token=";
        paramMap = encryptedRequest(paramMap);
        String response = neteaseRequest(url, paramMap);
        JSONObject data = JSON.parseObject(response);

        return new BootstrapResult(data.getJSONArray("data").getJSONObject(0).getString("url"));
    }
}
