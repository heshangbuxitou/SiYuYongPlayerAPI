package com.siyuyong.service;

import cn.hutool.core.lang.Dict;
import cn.hutool.http.HtmlUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.core.codec.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.siyuyong.constant.Constant;
import com.siyuyong.domain.*;
import com.siyuyong.util.HttpRequestUtil;
import com.siyuyong.util.MapGenerateUtil;
import com.siyuyong.util.MyUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.*;

@Component
@Order(value = 3)
public class QQReplayService implements ReplayService {

    public String getPort() {
        return Constant.DEFAULT_SERVER_PORT;
    }

    public String qqRequest(String url) {
        Map<String, List<String>> extraHeaders = new HashMap<>(32);
        extraHeaders.put("Accept", Arrays.asList("*/*"));
        extraHeaders.put("Accept-Encoding", Arrays.asList("gzip,deflate,sdch"));
        extraHeaders.put("Accept-Language", Arrays.asList("zh-CN,zh;q=0.8,gl;q=0.6,zh-TW;q=0.4"));
        extraHeaders.put("Connection", Arrays.asList("keep-alive"));
        extraHeaders.put("Content-Type", Arrays.asList("application/x-www-form-urlencoded"));
        extraHeaders.put("Host", Arrays.asList("i.y.qq.com"));
        extraHeaders.put("Referer", Arrays.asList("http://y.qq.com/y/static/taoge/taoge_list.html?pgv_ref=qqmusic.y.topmenu"));
        extraHeaders.put("User-Agent", Arrays.asList("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2)" +
                " AppleWebKit/537.36 (KHTML, like Gecko) Chrome" +
                "/33.0.1750.152 Safari/537.36"));
        return HttpRequestUtil.GetRequest(url, extraHeaders, null);
    }

    public String getQQToken(String id) {
        String tokenUrl = "https://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg" +
                "?g_tk=195219765&jsonpCallback=MusicJsonCallback004680169373158849" +
                "&loginUin=1297716249&hostUin=0&format=json&inCharset=utf8" +
                "&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0" +
                "&cid=205361747&callback=MusicJsonCallback004680169373158849" +
                "&uin=1297716249&songmid=" + id +
                "&filename=C400" + id + ".m4a&guid=7332953645";
        String response = qqRequest(tokenUrl);
        response = response.substring(response.indexOf("(") + 1, response.length() - 1);
        return JSON.parseObject(response).getJSONObject("data").getJSONArray("items").getJSONObject(0).getString("vkey");
    }

    public boolean qqPlayable(QQSearchResult.DataBean.SongBean.ListBean song) {
        String switchFlag = Integer.toBinaryString(song.getSwitchX());
        switchFlag = switchFlag.substring(0, switchFlag.length() - 1);
        return switchFlag.charAt(switchFlag.length() - 1) == '1';
    }

    public String getImageUrl(String qqImgId, String imgType) {
        if ("".equals(qqImgId)) {
            return "";
        }
        String category;
        switch (imgType) {
            case "artist":
                category = "mid_singer_300";
                break;
            case "album":
                category = "mid_album_300";
                break;
            default:
                return "";
        }
        String url = "http://imgcache.qq.com/music/photo/%s/%s/%s/%s.jpg";
        return String.format(url, category, qqImgId.substring(qqImgId.length() - 2),
                qqImgId.substring(qqImgId.length() - 1), qqImgId);
    }

    public ConvertSongBean convertSong(QQSearchResult.DataBean.SongBean.ListBean song) {
        ConvertSongBean songBean = new ConvertSongBean();
        songBean.setId("qqtrack_" + song.getSongmid());
        songBean.setTitle(song.getSongname());
        songBean.setArtist(song.getSinger().get(0).getName());
        songBean.setArtist_id("qqartist_" + song.getSinger().get(0).getMid());
        songBean.setAlbum(song.getAlbumname());
        songBean.setAlbum_id("qqalbum_" + song.getAlbummid());
        songBean.setImg_url(getImageUrl(song.getAlbummid(), "album"));
        songBean.setSource("qq");
        songBean.setSource_url("http://y.qq.com/#type=song&mid=" + song.getSongmid() + "&tpl=yqq_song_detail");
        songBean.setDisabled(!qqPlayable(song));
        songBean.setUrl(HttpUtil.urlWithForm("http://" + Constant.DEFAULT_SERVER_IP + ":" + getPort() + "/bootstrap_track",
                Dict.create().set("track_id", songBean.getId())
                , Charset.forName("utf-8"), true));
        return songBean;
    }

    @Override
    public SearchResult searchTrack(String keyword) {
        String urlKeyWord = MyUtils.urlEncode(keyword);
        String url = "http://i.y.qq.com/s.music/fcgi-bin/search_for_qq_cp?" +
                "g_tk=938407465&uin=0&format=jsonp&inCharset=utf-8" +
                "&outCharset=utf-8&notice=0&platform=h5&needNewCode=1" +
                "&w=%s&zhidaqu=1&catZhida=1" +
                "&t=0&flag=1&ie=utf-8&sem=1&aggr=0&perpage=20&n=20&p=1" +
                "&remoteplace=txt.mqq.all&_=1459991037831&jsonpCallback=jsonp4";
        url = String.format(url, urlKeyWord);
        String response = qqRequest(url);
        response = response.substring("jsonp4(".length(), response.length() - ")".length());

        QQSearchResult qqSearchResult = JSON.parseObject(response, QQSearchResult.class);
        List<QQSearchResult.DataBean.SongBean.ListBean> list = qqSearchResult.getData().getSong().getList();
        SearchResult result = new SearchResult();
        for (QQSearchResult.DataBean.SongBean.ListBean song : list) {
            result.getResult().add(convertSong(song));
        }
        return result;
    }

    @Override
    public LyricResult getLyricById(String songId) {
        String url = "http://i.y.qq.com/lyric/fcgi-bin/fcg_query_lyric.fcg?" +
                "songmid=%s" +
                "&loginUin=0&hostUin=0&format=jsonp&inCharset=GB2312" +
                "&outCharset=utf-8&notice=0&platform=yqq&jsonpCallback=MusicJsonCallback&needNewCode=0";
        String response = qqRequest(String.format(url, songId));
        response = response.substring("MusicJsonCallback(".length(), response.length() - 1);
        JSONObject jsonResponse = JSON.parseObject(response);
        String lyric = Base64.decodeStr(jsonResponse.getString("lyric"));
        return new LyricResult(lyric);
    }

    @Override
    public ListPlayListResult listPlaylist(String offset) {
        Integer sortId = Integer.parseInt(offset) / 30 + 1;
        String url = "http://i.y.qq.com/s.plcloud/fcgi-bin/fcg_get_diss_by_tag" +
                ".fcg?categoryId=10000000&sortId=" + sortId + "&sin=0&ein=29&" +
                "format=jsonp&g_tk=5381&loginUin=0&hostUin=0&" +
                "format=jsonp&inCharset=GB2312&outCharset=utf-8" +
                "&notice=0&platform=yqq&jsonpCallback=" +
                "MusicJsonCallback&needNewCode=0";
        String response = qqRequest(url);
        response = response.substring("MusicJsonCallback(".length(), response.length() - 1);
        JSONObject jsonObject = JSON.parseObject(response);

        ListPlayListResult result = new ListPlayListResult();
        JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("list");
        for (Object obj : jsonArray) {
            JSONObject data = (JSONObject) obj;
            ListPlayListResult.ResultBean resultBean = new ListPlayListResult.ResultBean();
            resultBean.setCover_img_url(data.getString("imgurl"));
            resultBean.setTitle(HtmlUtil.unescape((String) data.get("dissname")));
            resultBean.setPlay_count(data.getInteger("listennum"));
            resultBean.setList_id("qqplaylist_" + data.get("dissid"));
            result.getResult().add(resultBean);
        }
        return result;
    }


    @Override
    public PlayListResult getPlaylist(String listId) {
        String[] typeAndId = listId.split("_");
        switch (typeAndId[0]) {
            case "qqplaylist":
                return qqGetPlaylist(typeAndId[1]);
            case "qqalbum":
                return getAlbum(typeAndId[1]);
            case "qqartist":
                return getArtist(typeAndId[1]);
            default:
        }
        throw new RuntimeException("不存在的Playlist类型" + typeAndId[0]);
    }

    private PlayListResult qqGetPlaylist(String playlistId) {
        String url = "http://i.y.qq.com/qzone-music/fcg-bin/fcg_ucc_getcdinfo_" +
                "byids_cp.fcg?type=1&json=1&utf8=1&onlysong=0&jsonpCallback=" +
                "jsonCallback&nosign=1&disstid=%s&g_tk=5381&loginUin=0&hostUin=0" +
                "&format=jsonp&inCharset=GB2312&outCharset=utf-8&notice=0" +
                "&platform=yqq&jsonpCallback=jsonCallback&needNewCode=0";
        String response = qqRequest(String.format(url, playlistId));
        response = response.substring("jsonCallback(".length(), response.length() - 1);
        QQGetPlaylistResult data = JSON.parseObject(response, QQGetPlaylistResult.class);

        List<QQSearchResult.DataBean.SongBean.ListBean> list = data.getCdlist().get(0).getSonglist();
        PlayListResult result = new PlayListResult();

        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(data.getCdlist().get(0).getLogo());
        infoBean.setTitle(data.getCdlist().get(0).getDissname());
        infoBean.setId("qqplaylist_" + playlistId);
        infoBean.setSource_url("https://y.qq.com/n/yqq/playlist/" + playlistId + ".html");
        result.setInfo(infoBean);

        for (QQSearchResult.DataBean.SongBean.ListBean song : list) {
            result.getTracks().add(convertSong(song));
        }
        return result;
    }

    private PlayListResult getAlbum(String albumId) {

        String url = "http://i.y.qq.com/v8/fcg-bin/fcg_v8_album_info_cp.fcg" +
                "?platform=h5page&albummid=%s&g_tk=938407465" +
                "&uin=0&format=jsonp&inCharset=utf-8&outCharset=utf-8" +
                "&notice=0&platform=h5&needNewCode=1&_=1459961045571" +
                "&jsonpCallback=asonglist1459961045566";
        String response = qqRequest(String.format(url, albumId));
        response = response.substring(" asonglist1459961045566(".length(), response.length() - 1);
        QQGetAlbumResult data = JSON.parseObject(response, QQGetAlbumResult.class);
        List<QQSearchResult.DataBean.SongBean.ListBean> list = data.getData().getList();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(getImageUrl(albumId, "album"));
        infoBean.setTitle(data.getData().getName());
        infoBean.setId("qqalbum_" + albumId);
        infoBean.setSource_url("http://y.qq.com/#type=album&mid=" + albumId);
        result.setInfo(infoBean);

        for (QQSearchResult.DataBean.SongBean.ListBean song : list) {
            result.getTracks().add(convertSong(song));
        }
        return result;
    }

    private PlayListResult getArtist(String artistId) {
        String url = "http://i.y.qq.com/v8/fcg-bin/fcg_v8_singer_track_cp.fcg" +
                "?platform=h5page&order=listen&begin=0&num=50&singermid=" +
                "%s&g_tk=938407465&uin=0&format=jsonp&" +
                "inCharset=utf-8&outCharset=utf-8&notice=0&platform=" +
                "h5&needNewCode=1&from=h5&_=1459960621777&" +
                "jsonpCallback=ssonglist1459960621772";
        String response = qqRequest(String.format(url, artistId));
        response = response.substring(" ssonglist1459960621772(".length(), response.length() - 1);
        QQGetArtistResult data = JSON.parseObject(response, QQGetArtistResult.class);
        List<QQGetArtistResult.DataBean.ListBean> list = data.getData().getList();

        PlayListResult result = new PlayListResult();
        PlayListResult.InfoBean infoBean = new PlayListResult.InfoBean();
        infoBean.setCover_img_url(getImageUrl(artistId, "artist"));
        infoBean.setTitle(data.getData().getSinger_name());
        infoBean.setId("qqartist_" + artistId);
        infoBean.setSource_url("http://y.qq.com/#type=singer&mid=" + artistId);
        result.setInfo(infoBean);

        for (QQGetArtistResult.DataBean.ListBean song : list) {
            result.getTracks().add(convertSong(song.getMusicData()));
        }
        return result;
    }

    @Override
    public BootstrapResult getUrlById(String songId) {
        String token = getQQToken(songId);
        String url = "http://dl.stream.qqmusic.qq.com/C400" + songId +
                ".m4a?vkey=" + token + "&uin=1297716249&fromtag=0&guid=7332953645";
        return new BootstrapResult(url);
    }
}
