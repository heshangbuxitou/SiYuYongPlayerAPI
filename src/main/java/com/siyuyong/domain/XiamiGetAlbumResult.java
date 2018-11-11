package com.siyuyong.domain;

import java.util.List;

public class XiamiGetAlbumResult {

    /**
     * state : 0
     * message :
     * request_id : 0b84a07315416564431631914e0a87
     * data : {"album_id":483236,"artist_name":"任家萱","artist_id":99159,"album_name":"重作一个梦","song_count":3,"gmt_publish":1323964800,"album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","album_status":0,"pinyin":"zhong zuo yi ge meng ","songs":[{"song_id":1770580677,"song_name":"爱我的每个人","album_id":483236,"album_name":"重作一个梦","album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","artist_id":99159,"singers":"任家萱","mv_id":"K6YhNc","flag":65,"need_pay_flag":2,"purview_roles":[{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]},{"song_id":1770685722,"song_name":"梦","album_id":483236,"album_name":"重作一个梦","album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","artist_id":99159,"singers":"任家萱","mv_id":"K6Yhc2","flag":65,"need_pay_flag":2,"purview_roles":[{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]},{"song_id":1770685723,"song_name":"重作一个梦","album_id":483236,"album_name":"重作一个梦","album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","artist_id":99159,"singers":"任家萱","mv_id":"","flag":65,"need_pay_flag":2,"purview_roles":[{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]}]}
     */

    private int state;
    private String message;
    private String request_id;
    private DataBean data;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * album_id : 483236
         * artist_name : 任家萱
         * artist_id : 99159
         * album_name : 重作一个梦
         * song_count : 3
         * gmt_publish : 1323964800
         * album_logo : http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg
         * album_status : 0
         * pinyin : zhong zuo yi ge meng
         * songs : [{"song_id":1770580677,"song_name":"爱我的每个人","album_id":483236,"album_name":"重作一个梦","album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","artist_id":99159,"singers":"任家萱","mv_id":"K6YhNc","flag":65,"need_pay_flag":2,"purview_roles":[{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]},{"song_id":1770685722,"song_name":"梦","album_id":483236,"album_name":"重作一个梦","album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","artist_id":99159,"singers":"任家萱","mv_id":"K6Yhc2","flag":65,"need_pay_flag":2,"purview_roles":[{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]},{"song_id":1770685723,"song_name":"重作一个梦","album_id":483236,"album_name":"重作一个梦","album_logo":"http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg","artist_id":99159,"singers":"任家萱","mv_id":"","flag":65,"need_pay_flag":2,"purview_roles":[{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]}]
         */

        private int album_id;
        private String artist_name;
        private int artist_id;
        private String album_name;
        private int song_count;
        private int gmt_publish;
        private String album_logo;
        private int album_status;
        private String pinyin;
        private List<XiamiSearchResult.DataBean.SongsBean> songs;

        public int getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(int album_id) {
            this.album_id = album_id;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public int getArtist_id() {
            return artist_id;
        }

        public void setArtist_id(int artist_id) {
            this.artist_id = artist_id;
        }

        public String getAlbum_name() {
            return album_name;
        }

        public void setAlbum_name(String album_name) {
            this.album_name = album_name;
        }

        public int getSong_count() {
            return song_count;
        }

        public void setSong_count(int song_count) {
            this.song_count = song_count;
        }

        public int getGmt_publish() {
            return gmt_publish;
        }

        public void setGmt_publish(int gmt_publish) {
            this.gmt_publish = gmt_publish;
        }

        public String getAlbum_logo() {
            return album_logo;
        }

        public void setAlbum_logo(String album_logo) {
            this.album_logo = album_logo;
        }

        public int getAlbum_status() {
            return album_status;
        }

        public void setAlbum_status(int album_status) {
            this.album_status = album_status;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }

        public List<XiamiSearchResult.DataBean.SongsBean> getSongs() {
            return songs;
        }

        public void setSongs(List<XiamiSearchResult.DataBean.SongsBean> songs) {
            this.songs = songs;
        }

//        public static class SongsBean {
//            /**
//             * song_id : 1770580677
//             * song_name : 爱我的每个人
//             * album_id : 483236
//             * album_name : 重作一个梦
//             * album_logo : http://pic.xiami.net/images/album/img59/99159/4832361420790227.jpeg
//             * artist_id : 99159
//             * singers : 任家萱
//             * mv_id : K6YhNc
//             * flag : 65
//             * need_pay_flag : 2
//             * purview_roles : [{"quality":"e","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"f","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"l","operation_list":[{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]},{"quality":"h","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]},{"quality":"s","operation_list":[{"purpose":1,"upgrade_role":4},{"purpose":2,"upgrade_role":4}]}]
//             */
//
//            private int song_id;
//            private String song_name;
//            private int album_id;
//            private String album_name;
//            private String album_logo;
//            private int artist_id;
//            private String singers;
//            private String mv_id;
//            private int flag;
//            private int need_pay_flag;
//            private List<PurviewRolesBean> purview_roles;
//
//            public int getSong_id() {
//                return song_id;
//            }
//
//            public void setSong_id(int song_id) {
//                this.song_id = song_id;
//            }
//
//            public String getSong_name() {
//                return song_name;
//            }
//
//            public void setSong_name(String song_name) {
//                this.song_name = song_name;
//            }
//
//            public int getAlbum_id() {
//                return album_id;
//            }
//
//            public void setAlbum_id(int album_id) {
//                this.album_id = album_id;
//            }
//
//            public String getAlbum_name() {
//                return album_name;
//            }
//
//            public void setAlbum_name(String album_name) {
//                this.album_name = album_name;
//            }
//
//            public String getAlbum_logo() {
//                return album_logo;
//            }
//
//            public void setAlbum_logo(String album_logo) {
//                this.album_logo = album_logo;
//            }
//
//            public int getArtist_id() {
//                return artist_id;
//            }
//
//            public void setArtist_id(int artist_id) {
//                this.artist_id = artist_id;
//            }
//
//            public String getSingers() {
//                return singers;
//            }
//
//            public void setSingers(String singers) {
//                this.singers = singers;
//            }
//
//            public String getMv_id() {
//                return mv_id;
//            }
//
//            public void setMv_id(String mv_id) {
//                this.mv_id = mv_id;
//            }
//
//            public int getFlag() {
//                return flag;
//            }
//
//            public void setFlag(int flag) {
//                this.flag = flag;
//            }
//
//            public int getNeed_pay_flag() {
//                return need_pay_flag;
//            }
//
//            public void setNeed_pay_flag(int need_pay_flag) {
//                this.need_pay_flag = need_pay_flag;
//            }
//
//            public List<PurviewRolesBean> getPurview_roles() {
//                return purview_roles;
//            }
//
//            public void setPurview_roles(List<PurviewRolesBean> purview_roles) {
//                this.purview_roles = purview_roles;
//            }
//
//            public static class PurviewRolesBean {
//                /**
//                 * quality : e
//                 * operation_list : [{"purpose":1,"upgrade_role":0},{"purpose":2,"upgrade_role":4}]
//                 */
//
//                private String quality;
//                private List<OperationListBean> operation_list;
//
//                public String getQuality() {
//                    return quality;
//                }
//
//                public void setQuality(String quality) {
//                    this.quality = quality;
//                }
//
//                public List<OperationListBean> getOperation_list() {
//                    return operation_list;
//                }
//
//                public void setOperation_list(List<OperationListBean> operation_list) {
//                    this.operation_list = operation_list;
//                }
//
//                public static class OperationListBean {
//                    /**
//                     * purpose : 1
//                     * upgrade_role : 0
//                     */
//
//                    private int purpose;
//                    private int upgrade_role;
//
//                    public int getPurpose() {
//                        return purpose;
//                    }
//
//                    public void setPurpose(int purpose) {
//                        this.purpose = purpose;
//                    }
//
//                    public int getUpgrade_role() {
//                        return upgrade_role;
//                    }
//
//                    public void setUpgrade_role(int upgrade_role) {
//                        this.upgrade_role = upgrade_role;
//                    }
//                }
//            }
//        }
    }
}
