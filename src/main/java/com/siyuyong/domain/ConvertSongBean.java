package com.siyuyong.domain;

/**
 * @ClassName ConvertSongBean
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/1 18:48
 * @Version 1.0
 */
public class ConvertSongBean {
    /**
     * artist : Cassadee Pope
     * album : 11 - Single
     * source : qq
     * title : 11
     * artist_id : qqartist_004PyD941X0KKf
     * source_url : http://y.qq.com/#type=song&mid=0042JWy84XrN2x&tpl=yqq_song_detail
     * url : http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_0042JWy84XrN2x
     * img_url : http://imgcache.qq.com/music/photo/mid_album_300/GK/K/002kTTDs3qVlGK.jpg
     * album_id : qqalbum_002kTTDs3qVlGK
     * disabled : false
     * id : qqtrack_0042JWy84XrN2x
     */

    private String artist;
    private String album;
    private String source;
    private String title;
    private String artist_id;
    private String source_url;
    private String url;
    private String img_url;
    private String album_id;
    private boolean disabled;
    private String id;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(String artist_id) {
        this.artist_id = artist_id;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

