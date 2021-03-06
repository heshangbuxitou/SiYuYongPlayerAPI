package com.siyuyong.service;

import cn.hutool.core.lang.Dict;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.siyuyong.constant.Constant;
import com.siyuyong.domain.*;
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

/**
 * XiamiReplayService class
 *
 * @author zhu.yong
 * @date 2018/11/25
 */
@Component
@Order(value = 2)
public class XiamiReplayService implements ReplayService {
    public String getPort() {
        return Constant.DEFAULT_SERVER_PORT;
    }


    public String xiaMiRequest(String url) {
        Map<String, List<String>> extraHeaders = new HashMap<>(32);
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

    public ConvertSongBean convertSong(XiamiSearchResult.DataBean.SongsBean song) {
        ConvertSongBean songBean = new ConvertSongBean();
        songBean.setId("xmtrack_" + song.getSong_id());
        songBean.setTitle(song.getSong_name());
        songBean.setArtist(song.getArtist_name());
        songBean.setArtist_id("xmartist_" + song.getArtist_id());
        songBean.setAlbum(song.getAlbum_name());
        songBean.setAlbum_id("xmalbum_" + song.getAlbum_id());
        songBean.setSource("xiami");
        songBean.setSource_url("http://www.xiami.com/song/" + song.getSong_id());
        songBean.setUrl(HttpUtil.urlWithForm("http://" + Constant.DEFAULT_SERVER_IP + ":" + getPort() + "/bootstrap_track",
                Dict.create().set("track_id", songBean.getId())
                , Charset.forName("utf-8"), true));
        songBean.setImg_url(song.getLogo() != null ? song.getLogo() :
                song.getAlbum_logo() != null ? song.getAlbum_logo() : "");
        return songBean;
    }


    @Override
    public SearchResult searchTrack(String keyword) {
        String urlKeyWord = MyUtils.urlEncode(keyword);
        String searchUrl = "http://api.xiami.com/web?v=2.0&app_key=1&key=" + urlKeyWord
                + "&page=1&limit=50&_ksTS=1459930568781_153&callback=jsonp154" +
                "&r=search/songs";
        String response = xiaMiRequest(searchUrl);
        response = response.substring("jsonp154(".length(), response.length() - 1);
        XiamiSearchResult data = JSON.parseObject(response, XiamiSearchResult.class);
        List<XiamiSearchResult.DataBean.SongsBean> songs = data.getData().getSongs();
        SearchResult result = new SearchResult();
        for (XiamiSearchResult.DataBean.SongsBean song : songs) {
            result.getResult().add(convertSong(song));
        }
        return result;
    }

    @Override
    public LyricResult getLyricById(String lyricUrl) {
        return new LyricResult(xiaMiRequest(lyricUrl));
    }

    @Override
    public ListPlayListResult listPlaylist(String offset) {
        Integer sortId = Integer.parseInt(offset) / 60 + 1;
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&_ksTS=1459927525542_91" +
                "&page=" + sortId + "&limit=60&callback=jsonp92&r=collect/recommend";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp92(".length(), resonpse.length() - 1);
        JSONObject jsonObject = JSON.parseObject(resonpse);

        ListPlayListResult result = new ListPlayListResult();

        JSONArray jsonArray = jsonObject.getJSONArray("data");
        for (Object obj : jsonArray) {
            JSONObject map = (JSONObject) obj;
            ListPlayListResult.ResultBean resultBean = new ListPlayListResult.ResultBean();
            String logoFuffix = map.getString("logo").startsWith("http://pic") ? "@!c-100-100" : "";
            resultBean.setCover_img_url(map.getString("logo") + logoFuffix);
            resultBean.setTitle(map.getString("collect_name"));
            resultBean.setPlay_count(0);
            resultBean.setList_id("xmplaylist_" + map.get("list_id"));
            resultBean.setSource_url("http://www.xiami.com/collect/" + map.getString("list_id"));
            result.getResult().add(resultBean);
        }
        return result;
    }

    @Override
    public PlayListResult getPlaylist(String listId) {
        String[] typeAndId = listId.split("_");
        switch (typeAndId[0]) {
            case "xmplaylist":
                return xmGetPlaylist(typeAndId[1]);
            case "xmalbum":
                return getAlbum(typeAndId[1]);
            case "xmartist":
                return getArtist(typeAndId[1]);
            default:
                throw new IllegalArgumentException("不存在的Playlist类型" + typeAndId[0]);
        }
    }

    private PlayListResult getArtist(String artistId) {
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + artistId +
                "&page=1&limit=20&_ksTS=1459931285956_216&callback=jsonp217&r=artist/detail";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp217(".length(), resonpse.length() - 1);
        JSONObject data = JSON.parseObject(resonpse);
        String artistName = data.getJSONObject("data").getString("artist_name");

        url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + artistId +
                "&page=1&limit=20&_ksTS=1459931285956_216&callback=jsonp217&r=artist/hot-songs";
        resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp217(".length(), resonpse.length() - 1);
        XiamiGetArtistResult artistData = JSON.parseObject(resonpse, XiamiGetArtistResult.class);
        List<XiamiSearchResult.DataBean.SongsBean> list = artistData.getData();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(retinaUrl(data.getJSONObject("data").getString("logo")));
        infoBean.setTitle(artistName);
        infoBean.setId("xmartist_" + artistId);
        infoBean.setSource_url("http://www.xiami.com/artist/" + artistId);
        result.setInfo(infoBean);

        for (XiamiSearchResult.DataBean.SongsBean song : list) {
            song.setArtist_name(artistName);
            result.getTracks().add(convertSong(song));
        }
        return result;
    }

    private PlayListResult getAlbum(String albumId) {
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + albumId +
                "&page=1&limit=20&callback=jsonp217&r=album/detail";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp217(".length(), resonpse.length() - 1);
        XiamiGetAlbumResult data = JSON.parseObject(resonpse, XiamiGetAlbumResult.class);
        List<XiamiSearchResult.DataBean.SongsBean> list = data.getData().getSongs();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(retinaUrl(data.getData().getAlbum_logo()));
        infoBean.setTitle(data.getData().getAlbum_name());
        infoBean.setId("xmalbum_" + albumId);
        infoBean.setSource_url("http://www.xiami.com/album/" + albumId);
        result.setInfo(infoBean);

        for (XiamiSearchResult.DataBean.SongsBean song : list) {
            song.setArtist_name(data.getData().getArtist_name());
            result.getTracks().add(convertSong(song));
        }
        return result;
    }

    private PlayListResult xmGetPlaylist(String playlistId) {
        String url = "http://api.xiami.com/web?v=2.0&app_key=1&id=" + playlistId +
                "&callback=jsonp122&r=collect/detail";
        String resonpse = xiaMiRequest(url);
        resonpse = resonpse.substring("jsonp122(".length(), resonpse.length() - 1);
        XiamiGetPlaylistResult data = JSON.parseObject(resonpse, XiamiGetPlaylistResult.class);
        List<XiamiSearchResult.DataBean.SongsBean> list = data.getData().getSongs();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(data.getData().getLogo());
        infoBean.setTitle(data.getData().getCollect_name());
        infoBean.setId("xmplaylist_" + playlistId);
        infoBean.setSource_url("http://www.xiami.com/collect/" + playlistId);
        result.setInfo(infoBean);

        for (XiamiSearchResult.DataBean.SongsBean song : list) {
            result.getTracks().add(convertSong(song));
        }
        return result;
    }


    @Override
    public BootstrapResult getUrlById(String songId) {
        String url = "http://www.xiami.com/song/playlist/id/" + songId +
                "/object_name/default/object_id/0/cat/json";

        Map<String, List<String>> extraHeaders = new HashMap<>(32);
        extraHeaders.put("Referer", Arrays.asList("http://www.xiami.com/"));
        extraHeaders.put("Origin", Arrays.asList("http://www.xiami.com/"));

        String response = xiaMiRequest(url);
        JSONObject songResponse = JSON.parseObject(response).getJSONObject("data").getJSONArray("trackList").getJSONObject(0);
        String secret = songResponse.getString("location");

        BootstrapResult result = new BootstrapResult();
        result.setSong_url(MyUtils.handleRelativeUrl(caesar(secret)));
        result.setLyric_url(MyUtils.handleRelativeUrl(songResponse.getString("lyric_url")));
        result.setImg_url(MyUtils.handleRelativeUrl(songResponse.getString("pic")));
        return result;
    }
}
