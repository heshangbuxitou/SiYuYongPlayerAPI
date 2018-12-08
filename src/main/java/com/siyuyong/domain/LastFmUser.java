package com.siyuyong.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @ClassName LastFmUser
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/6 0:23
 * @Version 1.0
 */
public class LastFmUser {

    /**
     * user : {"playlists":"0","playcount":3454,"gender":"n","name":"heshangbuxitou","subscriber":"0","url":"https://www.last.fm/user/heshangbuxitou","country":"None","image":[{"size":"small","#text":""},{"size":"medium","#text":""},{"size":"large","#text":""},{"size":"extralarge","#text":""}],"registered":{"unixtime":1510733962,"#text":1510733962},"type":"user","age":"0","bootstrap":"0","realname":""}
     */

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * playlists : 0
         * playcount : 3454
         * gender : n
         * name : heshangbuxitou
         * subscriber : 0
         * url : https://www.last.fm/user/heshangbuxitou
         * country : None
         * image : [{"size":"small","#text":""},{"size":"medium","#text":""},{"size":"large","#text":""},{"size":"extralarge","#text":""}]
         * registered : {"unixtime":1510733962,"#text":1510733962}
         * type : user
         * age : 0
         * bootstrap : 0
         * realname :
         */

        private String playlists;
        private int playcount;
        private String gender;
        private String name;
        private String subscriber;
        private String url;
        private String country;
        private RegisteredBean registered;
        private String type;
        private String age;
        private String bootstrap;
        private String realname;
        private List<ImageBean> image;

        public String getPlaylists() {
            return playlists;
        }

        public void setPlaylists(String playlists) {
            this.playlists = playlists;
        }

        public int getPlaycount() {
            return playcount;
        }

        public void setPlaycount(int playcount) {
            this.playcount = playcount;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSubscriber() {
            return subscriber;
        }

        public void setSubscriber(String subscriber) {
            this.subscriber = subscriber;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public RegisteredBean getRegistered() {
            return registered;
        }

        public void setRegistered(RegisteredBean registered) {
            this.registered = registered;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getBootstrap() {
            return bootstrap;
        }

        public void setBootstrap(String bootstrap) {
            this.bootstrap = bootstrap;
        }

        public String getRealname() {
            return realname;
        }

        public void setRealname(String realname) {
            this.realname = realname;
        }

        public List<ImageBean> getImage() {
            return image;
        }

        public void setImage(List<ImageBean> image) {
            this.image = image;
        }

        public static class RegisteredBean {
            /**
             * unixtime : 1510733962
             * #text : 1510733962
             */

            private int unixtime;

//            @JsonProperty("#text")
            @JSONField(name = "#text")
            private int _$Text119;

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public int get_$Text119() {
                return _$Text119;
            }

            public void set_$Text119(int _$Text119) {
                this._$Text119 = _$Text119;
            }
        }

        public static class ImageBean {
            /**
             * size : small
             * #text :
             */

            private String size;

//            @com.google.gson.annotations.SerializedName("#text")
            @JSONField(name = "#text")
            private String _$Text293;

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String get_$Text293() {
                return _$Text293;
            }

            public void set_$Text293(String _$Text293) {
                this._$Text293 = _$Text293;
            }
        }
    }
}

