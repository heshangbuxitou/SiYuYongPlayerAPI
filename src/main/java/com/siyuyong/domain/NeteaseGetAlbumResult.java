package com.siyuyong.domain;

import java.io.Serializable;
import java.util.List;

public class NeteaseGetAlbumResult implements Serializable {

    /**
     * code : 200
     * album : {"songs":[{"starred":false,"popularity":95,"starredNum":0,"playedNum":0,"dayPlays":0,"hearTime":0,"mp3Url":"http://m2.music.126.net/hmZoNQaqzZALvVp0rE7faA==/0.mp3","rtUrls":null,"crbt":null,"rtUrl":null,"ftype":0,"rtype":0,"rurl":null,"bMusic":{"sr":44100,"volumeDelta":-1,"bitrate":128000,"playTime":146259,"dfsId":0,"name":"","id":1334849981,"size":2340197,"extension":"mp3"},"alias":[],"position":1,"duration":146259,"status":0,"audition":null,"copyFrom":"","ringtone":null,"disc":"1","no":1,"album":{"songs":[],"paid":false,"onSale":false,"tags":"","pic":18423416835270373,"blurPicUrl":"http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg","companyId":0,"alias":[],"status":3,"subType":"录音室版","description":"","company":"索尼音乐","picId":18423416835270373,"artist":{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"","id":0,"img1v1Id_str":"18686200114669622"},"artists":[{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}],"copyrightId":7001,"picUrl":"http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg","briefDesc":"","commentThreadId":"R_AL_3_35799123","publishTime":1500566400007,"name":"Despacito","id":35799123,"type":"EP/Single","size":1,"picId_str":"18423416835270373"},"artists":[{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}],"hMusic":{"sr":44100,"volumeDelta":-1,"bitrate":320000,"playTime":146259,"dfsId":0,"name":"","id":1334849979,"size":5850427,"extension":"mp3"},"mMusic":{"sr":44100,"volumeDelta":-1,"bitrate":192000,"playTime":146259,"dfsId":0,"name":"","id":1334849980,"size":3510274,"extension":"mp3"},"lMusic":{"sr":44100,"volumeDelta":-1,"bitrate":128000,"playTime":146259,"dfsId":0,"name":"","id":1334849981,"size":2340197,"extension":"mp3"},"score":95,"copyrightId":7001,"commentThreadId":"R_SO_4_492003698","fee":8,"mvid":5585042,"name":"Despacito","id":492003698}],"paid":false,"onSale":false,"tags":"","pic":18423416835270373,"blurPicUrl":"http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg","companyId":0,"alias":[],"status":3,"subType":"录音室版","description":"","company":"索尼音乐","picId":18423416835270373,"artist":{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":["Sulic & Hauser"],"musicSize":98,"trans":"","picId":134140418608734,"picUrl":"http://p2.music.126.net/0_vKSOlOA6tYFx_Wv88jag==/134140418608734.jpg","briefDesc":"","albumSize":21,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"},"artists":[{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}],"copyrightId":7001,"picUrl":"http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg","briefDesc":"","commentThreadId":"R_AL_3_35799123","publishTime":1500566400007,"name":"Despacito","id":35799123,"type":"EP/Single","size":1,"picId_str":"18423416835270373","info":{"commentThread":{"id":"R_AL_3_35799123","resourceInfo":{"id":35799123,"userId":-1,"name":"Despacito","imgUrl":null,"creator":null},"resourceType":3,"commentCount":36,"likedCount":0,"shareCount":27,"hotCount":0,"latestLikedUsers":null,"resourceOwnerId":-1,"resourceTitle":"Despacito","resourceId":35799123},"latestLikedUsers":null,"liked":false,"comments":null,"resourceType":3,"resourceId":35799123,"threadId":"R_AL_3_35799123","commentCount":36,"likedCount":0,"shareCount":27}}
     */

    private int code;
    private AlbumBeanX album;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public AlbumBeanX getAlbum() {
        return album;
    }

    public void setAlbum(AlbumBeanX album) {
        this.album = album;
    }

    public static class AlbumBeanX {
        /**
         * songs : [{"starred":false,"popularity":95,"starredNum":0,"playedNum":0,"dayPlays":0,"hearTime":0,"mp3Url":"http://m2.music.126.net/hmZoNQaqzZALvVp0rE7faA==/0.mp3","rtUrls":null,"crbt":null,"rtUrl":null,"ftype":0,"rtype":0,"rurl":null,"bMusic":{"sr":44100,"volumeDelta":-1,"bitrate":128000,"playTime":146259,"dfsId":0,"name":"","id":1334849981,"size":2340197,"extension":"mp3"},"alias":[],"position":1,"duration":146259,"status":0,"audition":null,"copyFrom":"","ringtone":null,"disc":"1","no":1,"album":{"songs":[],"paid":false,"onSale":false,"tags":"","pic":18423416835270373,"blurPicUrl":"http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg","companyId":0,"alias":[],"status":3,"subType":"录音室版","description":"","company":"索尼音乐","picId":18423416835270373,"artist":{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"","id":0,"img1v1Id_str":"18686200114669622"},"artists":[{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}],"copyrightId":7001,"picUrl":"http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg","briefDesc":"","commentThreadId":"R_AL_3_35799123","publishTime":1500566400007,"name":"Despacito","id":35799123,"type":"EP/Single","size":1,"picId_str":"18423416835270373"},"artists":[{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}],"hMusic":{"sr":44100,"volumeDelta":-1,"bitrate":320000,"playTime":146259,"dfsId":0,"name":"","id":1334849979,"size":5850427,"extension":"mp3"},"mMusic":{"sr":44100,"volumeDelta":-1,"bitrate":192000,"playTime":146259,"dfsId":0,"name":"","id":1334849980,"size":3510274,"extension":"mp3"},"lMusic":{"sr":44100,"volumeDelta":-1,"bitrate":128000,"playTime":146259,"dfsId":0,"name":"","id":1334849981,"size":2340197,"extension":"mp3"},"score":95,"copyrightId":7001,"commentThreadId":"R_SO_4_492003698","fee":8,"mvid":5585042,"name":"Despacito","id":492003698}]
         * paid : false
         * onSale : false
         * tags :
         * pic : 18423416835270373
         * blurPicUrl : http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg
         * companyId : 0
         * alias : []
         * status : 3
         * subType : 录音室版
         * description :
         * company : 索尼音乐
         * picId : 18423416835270373
         * artist : {"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":["Sulic & Hauser"],"musicSize":98,"trans":"","picId":134140418608734,"picUrl":"http://p2.music.126.net/0_vKSOlOA6tYFx_Wv88jag==/134140418608734.jpg","briefDesc":"","albumSize":21,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}
         * artists : [{"img1v1Id":18686200114669622,"topicPerson":0,"img1v1Url":"http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","alias":[],"musicSize":0,"trans":"","picId":0,"picUrl":"http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","briefDesc":"","albumSize":0,"name":"2Cellos","id":101368,"img1v1Id_str":"18686200114669622"}]
         * copyrightId : 7001
         * picUrl : http://p2.music.126.net/iO-cZoBDGJfjgdhmw-V_uw==/18423416835270373.jpg
         * briefDesc :
         * commentThreadId : R_AL_3_35799123
         * publishTime : 1500566400007
         * name : Despacito
         * id : 35799123
         * type : EP/Single
         * size : 1
         * picId_str : 18423416835270373
         * info : {"commentThread":{"id":"R_AL_3_35799123","resourceInfo":{"id":35799123,"userId":-1,"name":"Despacito","imgUrl":null,"creator":null},"resourceType":3,"commentCount":36,"likedCount":0,"shareCount":27,"hotCount":0,"latestLikedUsers":null,"resourceOwnerId":-1,"resourceTitle":"Despacito","resourceId":35799123},"latestLikedUsers":null,"liked":false,"comments":null,"resourceType":3,"resourceId":35799123,"threadId":"R_AL_3_35799123","commentCount":36,"likedCount":0,"shareCount":27}
         */

        private boolean paid;
        private boolean onSale;
        private String tags;
        private long pic;
        private String blurPicUrl;
        private int companyId;
        private int status;
        private String subType;
        private String description;
        private String company;
        private long picId;
        private ArtistBean artist;
        private int copyrightId;
        private String picUrl;
        private String briefDesc;
        private String commentThreadId;
        private long publishTime;
        private String name;
        private int id;
        private String type;
        private int size;
        private String picId_str;
        private InfoBean info;
        private List<NeteaseSearchResult.ResultBean.SongsBean> songs;
        private List<?> alias;
        private List<ArtistsBeanXX> artists;

        public boolean isPaid() {
            return paid;
        }

        public void setPaid(boolean paid) {
            this.paid = paid;
        }

        public boolean isOnSale() {
            return onSale;
        }

        public void setOnSale(boolean onSale) {
            this.onSale = onSale;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public long getPic() {
            return pic;
        }

        public void setPic(long pic) {
            this.pic = pic;
        }

        public String getBlurPicUrl() {
            return blurPicUrl;
        }

        public void setBlurPicUrl(String blurPicUrl) {
            this.blurPicUrl = blurPicUrl;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubType() {
            return subType;
        }

        public void setSubType(String subType) {
            this.subType = subType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public long getPicId() {
            return picId;
        }

        public void setPicId(long picId) {
            this.picId = picId;
        }

        public ArtistBean getArtist() {
            return artist;
        }

        public void setArtist(ArtistBean artist) {
            this.artist = artist;
        }

        public int getCopyrightId() {
            return copyrightId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getBriefDesc() {
            return briefDesc;
        }

        public void setBriefDesc(String briefDesc) {
            this.briefDesc = briefDesc;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getPicId_str() {
            return picId_str;
        }

        public void setPicId_str(String picId_str) {
            this.picId_str = picId_str;
        }

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public List<NeteaseSearchResult.ResultBean.SongsBean> getSongs() {
            return songs;
        }

        public void setSongs(List<NeteaseSearchResult.ResultBean.SongsBean> songs) {
            this.songs = songs;
        }

        public List<?> getAlias() {
            return alias;
        }

        public void setAlias(List<?> alias) {
            this.alias = alias;
        }

        public List<ArtistsBeanXX> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBeanXX> artists) {
            this.artists = artists;
        }

        public static class ArtistBean {
            /**
             * img1v1Id : 18686200114669622
             * topicPerson : 0
             * img1v1Url : http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
             * alias : ["Sulic & Hauser"]
             * musicSize : 98
             * trans :
             * picId : 134140418608734
             * picUrl : http://p2.music.126.net/0_vKSOlOA6tYFx_Wv88jag==/134140418608734.jpg
             * briefDesc :
             * albumSize : 21
             * name : 2Cellos
             * id : 101368
             * img1v1Id_str : 18686200114669622
             */

            private long img1v1Id;
            private int topicPerson;
            private String img1v1Url;
            private int musicSize;
            private String trans;
            private long picId;
            private String picUrl;
            private String briefDesc;
            private int albumSize;
            private String name;
            private int id;
            private String img1v1Id_str;
            private List<String> alias;

            public long getImg1v1Id() {
                return img1v1Id;
            }

            public void setImg1v1Id(long img1v1Id) {
                this.img1v1Id = img1v1Id;
            }

            public int getTopicPerson() {
                return topicPerson;
            }

            public void setTopicPerson(int topicPerson) {
                this.topicPerson = topicPerson;
            }

            public String getImg1v1Url() {
                return img1v1Url;
            }

            public void setImg1v1Url(String img1v1Url) {
                this.img1v1Url = img1v1Url;
            }

            public int getMusicSize() {
                return musicSize;
            }

            public void setMusicSize(int musicSize) {
                this.musicSize = musicSize;
            }

            public String getTrans() {
                return trans;
            }

            public void setTrans(String trans) {
                this.trans = trans;
            }

            public long getPicId() {
                return picId;
            }

            public void setPicId(long picId) {
                this.picId = picId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public int getAlbumSize() {
                return albumSize;
            }

            public void setAlbumSize(int albumSize) {
                this.albumSize = albumSize;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg1v1Id_str() {
                return img1v1Id_str;
            }

            public void setImg1v1Id_str(String img1v1Id_str) {
                this.img1v1Id_str = img1v1Id_str;
            }

            public List<String> getAlias() {
                return alias;
            }

            public void setAlias(List<String> alias) {
                this.alias = alias;
            }
        }

        public static class InfoBean {
            /**
             * commentThread : {"id":"R_AL_3_35799123","resourceInfo":{"id":35799123,"userId":-1,"name":"Despacito","imgUrl":null,"creator":null},"resourceType":3,"commentCount":36,"likedCount":0,"shareCount":27,"hotCount":0,"latestLikedUsers":null,"resourceOwnerId":-1,"resourceTitle":"Despacito","resourceId":35799123}
             * latestLikedUsers : null
             * liked : false
             * comments : null
             * resourceType : 3
             * resourceId : 35799123
             * threadId : R_AL_3_35799123
             * commentCount : 36
             * likedCount : 0
             * shareCount : 27
             */

            private CommentThreadBean commentThread;
            private Object latestLikedUsers;
            private boolean liked;
            private Object comments;
            private int resourceType;
            private int resourceId;
            private String threadId;
            private int commentCount;
            private int likedCount;
            private int shareCount;

            public CommentThreadBean getCommentThread() {
                return commentThread;
            }

            public void setCommentThread(CommentThreadBean commentThread) {
                this.commentThread = commentThread;
            }

            public Object getLatestLikedUsers() {
                return latestLikedUsers;
            }

            public void setLatestLikedUsers(Object latestLikedUsers) {
                this.latestLikedUsers = latestLikedUsers;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public Object getComments() {
                return comments;
            }

            public void setComments(Object comments) {
                this.comments = comments;
            }

            public int getResourceType() {
                return resourceType;
            }

            public void setResourceType(int resourceType) {
                this.resourceType = resourceType;
            }

            public int getResourceId() {
                return resourceId;
            }

            public void setResourceId(int resourceId) {
                this.resourceId = resourceId;
            }

            public String getThreadId() {
                return threadId;
            }

            public void setThreadId(String threadId) {
                this.threadId = threadId;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getLikedCount() {
                return likedCount;
            }

            public void setLikedCount(int likedCount) {
                this.likedCount = likedCount;
            }

            public int getShareCount() {
                return shareCount;
            }

            public void setShareCount(int shareCount) {
                this.shareCount = shareCount;
            }

            public static class CommentThreadBean {
                /**
                 * id : R_AL_3_35799123
                 * resourceInfo : {"id":35799123,"userId":-1,"name":"Despacito","imgUrl":null,"creator":null}
                 * resourceType : 3
                 * commentCount : 36
                 * likedCount : 0
                 * shareCount : 27
                 * hotCount : 0
                 * latestLikedUsers : null
                 * resourceOwnerId : -1
                 * resourceTitle : Despacito
                 * resourceId : 35799123
                 */

                private String id;
                private ResourceInfoBean resourceInfo;
                private int resourceType;
                private int commentCount;
                private int likedCount;
                private int shareCount;
                private int hotCount;
                private Object latestLikedUsers;
                private int resourceOwnerId;
                private String resourceTitle;
                private int resourceId;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public ResourceInfoBean getResourceInfo() {
                    return resourceInfo;
                }

                public void setResourceInfo(ResourceInfoBean resourceInfo) {
                    this.resourceInfo = resourceInfo;
                }

                public int getResourceType() {
                    return resourceType;
                }

                public void setResourceType(int resourceType) {
                    this.resourceType = resourceType;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public int getLikedCount() {
                    return likedCount;
                }

                public void setLikedCount(int likedCount) {
                    this.likedCount = likedCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getHotCount() {
                    return hotCount;
                }

                public void setHotCount(int hotCount) {
                    this.hotCount = hotCount;
                }

                public Object getLatestLikedUsers() {
                    return latestLikedUsers;
                }

                public void setLatestLikedUsers(Object latestLikedUsers) {
                    this.latestLikedUsers = latestLikedUsers;
                }

                public int getResourceOwnerId() {
                    return resourceOwnerId;
                }

                public void setResourceOwnerId(int resourceOwnerId) {
                    this.resourceOwnerId = resourceOwnerId;
                }

                public String getResourceTitle() {
                    return resourceTitle;
                }

                public void setResourceTitle(String resourceTitle) {
                    this.resourceTitle = resourceTitle;
                }

                public int getResourceId() {
                    return resourceId;
                }

                public void setResourceId(int resourceId) {
                    this.resourceId = resourceId;
                }

                public static class ResourceInfoBean {
                    /**
                     * id : 35799123
                     * userId : -1
                     * name : Despacito
                     * imgUrl : null
                     * creator : null
                     */

                    private int id;
                    private int userId;
                    private String name;
                    private Object imgUrl;
                    private Object creator;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getUserId() {
                        return userId;
                    }

                    public void setUserId(int userId) {
                        this.userId = userId;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Object getImgUrl() {
                        return imgUrl;
                    }

                    public void setImgUrl(Object imgUrl) {
                        this.imgUrl = imgUrl;
                    }

                    public Object getCreator() {
                        return creator;
                    }

                    public void setCreator(Object creator) {
                        this.creator = creator;
                    }
                }
            }
        }

        public static class ArtistsBeanXX {
            /**
             * img1v1Id : 18686200114669622
             * topicPerson : 0
             * img1v1Url : http://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
             * alias : []
             * musicSize : 0
             * trans :
             * picId : 0
             * picUrl : http://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
             * briefDesc :
             * albumSize : 0
             * name : 2Cellos
             * id : 101368
             * img1v1Id_str : 18686200114669622
             */

            private long img1v1Id;
            private int topicPerson;
            private String img1v1Url;
            private int musicSize;
            private String trans;
            private int picId;
            private String picUrl;
            private String briefDesc;
            private int albumSize;
            private String name;
            private int id;
            private String img1v1Id_str;
            private List<?> alias;

            public long getImg1v1Id() {
                return img1v1Id;
            }

            public void setImg1v1Id(long img1v1Id) {
                this.img1v1Id = img1v1Id;
            }

            public int getTopicPerson() {
                return topicPerson;
            }

            public void setTopicPerson(int topicPerson) {
                this.topicPerson = topicPerson;
            }

            public String getImg1v1Url() {
                return img1v1Url;
            }

            public void setImg1v1Url(String img1v1Url) {
                this.img1v1Url = img1v1Url;
            }

            public int getMusicSize() {
                return musicSize;
            }

            public void setMusicSize(int musicSize) {
                this.musicSize = musicSize;
            }

            public String getTrans() {
                return trans;
            }

            public void setTrans(String trans) {
                this.trans = trans;
            }

            public int getPicId() {
                return picId;
            }

            public void setPicId(int picId) {
                this.picId = picId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public int getAlbumSize() {
                return albumSize;
            }

            public void setAlbumSize(int albumSize) {
                this.albumSize = albumSize;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg1v1Id_str() {
                return img1v1Id_str;
            }

            public void setImg1v1Id_str(String img1v1Id_str) {
                this.img1v1Id_str = img1v1Id_str;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }
        }
    }
}
