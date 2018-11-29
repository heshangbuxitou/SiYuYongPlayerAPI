package com.siyuyong.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @ClassName BootstrapResult
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/11/28 0:02
 * @Version 1.0
 */
public class BootstrapResult {

    /**
     * img_url : http://img.xiami.net/images/album/img89/126/5bc2b69f85845_6319589_1539487391_1.jpg
     * song_url : http://m128.xiami.net/298/1297096298/2104057599/1805931174_1539487650305.mp3?auth_key=1543892400-0-0-1e87581eeb0e476146455bfbac34520c
     * lyric_url : http://img.xiami.net/lyric/74/1805931174_1539519190_7141.lrc
     */

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String img_url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String song_url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lyric_url;

    public BootstrapResult() {
    }

    public BootstrapResult(String song_url) {
        this.song_url = song_url;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getSong_url() {
        return song_url;
    }

    public void setSong_url(String song_url) {
        this.song_url = song_url;
    }

    public String getLyric_url() {
        return lyric_url;
    }

    public void setLyric_url(String lyric_url) {
        this.lyric_url = lyric_url;
    }
}

