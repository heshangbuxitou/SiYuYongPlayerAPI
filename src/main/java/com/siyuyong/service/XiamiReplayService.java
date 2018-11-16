package com.siyuyong.service;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.siyuyong.constant.Constant;
import com.siyuyong.domain.XiamiGetAlbumResult;
import com.siyuyong.domain.XiamiGetArtistResult;
import com.siyuyong.domain.XiamiGetPlaylistResult;
import com.siyuyong.domain.XiamiSearchResult;
import com.siyuyong.util.HttpRequestUtil;
import com.siyuyong.util.MapGenerateUtil;
import com.siyuyong.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.*;
import java.util.logging.Logger;

@Component
@Order(value = 2)
public class XiamiReplayService implements ReplayService {
    public String getPort() {
        return Constant.DEFAULT_SERVER_PORT;
    }


    public String xiaMiRequest(String url) {
        Map<String, List<String>> extraHeaders = new HashMap<>();
        extraHeaders.put("Accept", Arrays.asList("application/json, text/plain, */*"));
        extraHeaders.put("Accept-Encoding", Arrays.asList("gzip,deflate,sdch"));
        extraHeaders.put("Accept-Language", Arrays.asList("zh-CN,zh;q=0.8,gl;q=0.6,zh-TW;q=0.4"));
        extraHeaders.put("Connection", Arrays.asList("keep-alive"));
        extraHeaders.put("Content-Type", Arrays.asList("application/x-www-form-urlencoded"));
        extraHeaders.put("Host", Arrays.asList("www.xiami.com"));
        extraHeaders.put("Referer", Arrays.asList("http://www.xiami.com/"));
        extraHeaders.put("Origin", Arrays.asList("http://www.xiami.com/"));
        extraHeaders.put("User-Agent", Arrays.asList("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2)" +
                " AppleWebKit/537.36 (KHTML, like Gecko) Chrome" +
                "/33.0.1750.152 Safari/537.36"));
        return HttpRequestUtil.GetRequest(url, extraHeaders, null);
    }

    public String caesar(String location) {
        int _local10;
        int _local2 = Integer.parseInt(location.substring(0, 1));
        String _local3 = location.substring(1, location.length());
        double _local4 = Math.floor(_local3.length() / _local2);
        int _local5 = _local3.length() % _local2;
        String[] _local6 = new String[_local2];
        int _local7 = 0;
        while (_local7 < _local5) {
            if (_local6[_local7] == null) {
                _local6[_local7] = "";
            }
            _local6[_local7] = _local3.substring((((int) _local4 + 1) * _local7),
                    (((int) _local4 + 1) * _local7) + ((int) _local4 + 1));
            _local7++;
        }
        _local7 = _local5;
        while (_local7 < _local2) {
            _local6[_local7] = _local3
                    .substring((((int) _local4 * (_local7 - _local5)) + (((int) _local4 + 1) * _local5)),
                            (((int) _local4 * (_local7 - _local5)) + (((int) _local4 + 1) * _local5)) + (int) _local4);
            _local7++;
        }
        String _local8 = "";
        _local7 = 0;
        while (_local7 < ((String) _local6[0]).length()) {
            _local10 = 0;
            while (_local10 < _local6.length) {
                if (_local7 >= _local6[_local10].length()) {
                    break;
                }
                _local8 = (_local8 + _local6[_local10].charAt(_local7));
                _local10++;
            }
            _local7++;
        }
        try {
            _local8 = URLDecoder.decode(_local8, "utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        String _local9 = "";
        _local7 = 0;
        while (_local7 < _local8.length()) {
            if (_local8.charAt(_local7) == '^') {
                _local9 = (_local9 + "0");
            } else {
                _local9 = (_local9 + _local8.charAt(_local7));
            }
            ;
            _local7++;
        }
        _local9 = _local9.replace("+", " ");
        return _local9;
    }

    public String retinaUrl(String url) {
        return url.substring(0, url.length() - 6) + url.substring(url.length() - 4);
    }

    public Object convertSong(XiamiSearchResult.DataBean.SongsBean song) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "xmtrack_" + song.getSong_id());
        map.put("title", song.getSong_name());
        map.put("artist", song.getArtist_name());
        map.put("artist_id", "xmartist_" + song.getArtist_id());
        map.put("album", song.getAlbum_name());
        map.put("album_id", "xmalbum_" + song.getAlbum_id());
        map.put("source", "xiami");
        map.put("source_url", "http://www.xiami.com/song/" + song.getSong_id());

        if (song.getLogo() != null) {
            map.put("img_url", song.getLogo());
        } else if (song.getAlbum_logo() != null) {
            map.put("img_url", song.getAlbum_logo());
        } else {
            map.put("img_url", "");
        }
        map.put("url", HttpUtil.urlWithForm("http://" + Constant.DEFAULT_SERVER_IP + ":" + getPort() + "/bootstrap_track",
                MapGenerateUtil.createMap(new String[]{"track_id"}, new Object[]{map.get("id")})
                , Charset.forName("utf-8"), true));
        return map;
    }


    @Override
    public String searchTrack(String keyword) {
        String urlKeyWord = MyUtils.urlEncode(keyword);
        String searchUrl = "http://api.xiami.com/web?v=2.0&app_key=1&key=" + keyword
                + "&page=1&limit=50&_ksTS=1459930568781_153&callback=jsonp154" +
                "&r=search/songs";
        String response = xiaMiRequest(searchUrl);
        response = response.substring("jsonp154(".length(), response.length() - 1);
        XiamiSearchResult data = JSON.parseObject(response, XiamiSearchResult.class);
        List<XiamiSearchResult.DataBean.SongsBean> songs = data.getData().getSongs();
        List<Object> result = new ArrayList<>();
        for (XiamiSearchResult.DataBean.SongsBean song : songs) {
            result.add(convertSong(song));
        }
        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"result"}, new Object[]{result}));
    }

    @Override
    public String getLyricById(String lyricUrl) {
        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"lyric"}, new Object[]{xiaMiRequest(lyricUrl)}));
    }

    @Override
    public String listPlaylist(String offset) {
        Integer sortId = Integer.parseInt(offset) / 60 + 1;
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&_ksTS=1459927525542_91" +
                "&page=" + sortId + "&limit=60&callback=jsonp92&r=collect/recommend";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp92(".length(), resonpse.length() - 1);
        JSONObject jsonObject = JSON.parseObject(resonpse);

        List<Object> result = new ArrayList<>();
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        for (Object obj : jsonArray) {
            JSONObject map = (JSONObject) obj;
            String[] keyList = {"cover_img_url", "title", "play_count", "list_id", "source_url"};
            String logoFuffix = map.getString("logo").startsWith("http://pic") ? "@!c-100-100" : "";
            Object[] valueList = {map.getString("logo") + logoFuffix, map.getString("collect_name"),
                    0, "xmplaylist_" + map.get("list_id"), "http://www.xiami.com/collect/" + map.getString("list_id")};
            result.add(MapGenerateUtil.createMap(keyList, valueList));
        }

        return JSON.toJSONString(MapGenerateUtil.createMap(new String[]{"result"}, new Object[]{result}));
    }

    @Override
    public Map<String, Object> getPlaylist(String listId) {
        String[] typeAndId = listId.split("_");
        switch (typeAndId[0]) {
            case "xmplaylist":
                return xmGetPlaylist(typeAndId[1]);
            case "xmalbum":
                return getAlbum(typeAndId[1]);
            case "xmartist":
                return getArtist(typeAndId[1]);
        }
        throw new RuntimeException("不存在的Playlist类型" + typeAndId[0]);
    }

    private Map<String, Object> getArtist(String artistId) {
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + artistId +
                "&page=1&limit=20&_ksTS=1459931285956_216&callback=jsonp217&r=artist/detail";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp217(".length(), resonpse.length() - 1);
        JSONObject data = JSON.parseObject(resonpse);
        String artistName = data.getJSONObject("data").getString("artist_name");

        String[] keyList = {"cover_img_url", "title", "id", "source_url"};
        Object[] valueList = {retinaUrl(data.getJSONObject("data").getString("logo")), artistName,
                "xmartist_" + artistId, "http://www.xiami.com/artist/" + artistId};
        Map<String, Object> infoMap = MapGenerateUtil.createMap(keyList, valueList);

        url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + artistId +
                "&page=1&limit=20&_ksTS=1459931285956_216&callback=jsonp217&r=artist/hot-songs";
        resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp217(".length(), resonpse.length() - 1);

        XiamiGetArtistResult artistData = JSON.parseObject(resonpse, XiamiGetArtistResult.class);
        List<XiamiSearchResult.DataBean.SongsBean> list = artistData.getData();
        List<Object> result = new ArrayList<>();
        for (XiamiSearchResult.DataBean.SongsBean song : list) {
            song.setArtist_name(artistName);
            result.add(convertSong(song));
        }
        return MapGenerateUtil.createMap(new String[]{"tracks", "info"}, new Object[]{result, infoMap});
    }

    private Map<String, Object> getAlbum(String albumId) {
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + albumId +
                "&page=1&limit=20&callback=jsonp217&r=album/detail";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp217(".length(), resonpse.length() - 1);
        XiamiGetAlbumResult data = JSON.parseObject(resonpse, XiamiGetAlbumResult.class);

        String[] keyList = {"cover_img_url", "title", "id", "source_url"};
        Object[] valueList = {retinaUrl(data.getData().getAlbum_logo()), data.getData().getAlbum_name(),
                "xmalbum_" + albumId, "http://www.xiami.com/album/" + albumId};
        Map<String, Object> infoMap = MapGenerateUtil.createMap(keyList, valueList);
        List<XiamiSearchResult.DataBean.SongsBean> list = data.getData().getSongs();
        List<Object> result = new ArrayList<>();
        for (XiamiSearchResult.DataBean.SongsBean song : list) {
            song.setArtist_name(data.getData().getArtist_name());
            result.add(convertSong(song));
        }
        return MapGenerateUtil.createMap(new String[]{"tracks", "info"}, new Object[]{result, infoMap});
    }

    private Map<String, Object> xmGetPlaylist(String playlistId) {
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + playlistId +
                "&callback=jsonp122&r=collect/detail";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp122(".length(), resonpse.length() - 1);
        XiamiGetPlaylistResult data = JSON.parseObject(resonpse, XiamiGetPlaylistResult.class);

        String[] keyList = {"cover_img_url", "title", "id", "source_url"};
        Object[] valueList = {data.getData().getLogo(), data.getData().getCollect_name(),
                "xmplaylist_" + playlistId, "http://www.xiami.com/collect/" + playlistId};
        Map<String, Object> infoMap = MapGenerateUtil.createMap(keyList, valueList);
        List<XiamiSearchResult.DataBean.SongsBean> list = data.getData().getSongs();
        List<Object> result = new ArrayList<>();
        for (XiamiSearchResult.DataBean.SongsBean song : list) {
            result.add(convertSong(song));
        }
        return MapGenerateUtil.createMap(new String[]{"tracks", "info"}, new Object[]{result, infoMap});
    }


    @Override
    public String getUrlById(String songId) {
        String url = "http://www.xiami.com/song/playlist/id/" + songId +
                "/object_name/default/object_id/0/cat/json";

        Map<String, List<String>> extraHeaders = new HashMap<>();
        extraHeaders.put("Referer", Arrays.asList("http://www.xiami.com/"));
        extraHeaders.put("Origin", Arrays.asList("http://www.xiami.com/"));

        String response = xiaMiRequest(url);
        JSONObject songResponse = JSON.parseObject(response).getJSONObject("data").getJSONArray("trackList").getJSONObject(0);
        String secret = songResponse.getString("location");
        return JSON.toJSONString(MapGenerateUtil.createMap(
                new String[]{"song_url", "lyric_url", "img_url"},
                new String[]{MyUtils.handleRelativeUrl(caesar(secret)),
                        MyUtils.handleRelativeUrl(songResponse.getString("lyric_url")),
                        MyUtils.handleRelativeUrl(songResponse.getString("pic"))}));
    }
}
