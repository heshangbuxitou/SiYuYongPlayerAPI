package com.siyuyong.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PlayListResult
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/2 0:50
 * @Version 1.0
 */
public class PlayListResult {

    /**
     * is_mine : 0
     * tracks : [{"album":"陪你倒数","album_id":"qqalbum_000XJ9QF1AWOoW","artist":"张国荣","artist_id":"qqartist_0001v4XU1cZxPy","disabled":false,"id":"qqtrack_002YYb7q14xZq1","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/oW/W/000XJ9QF1AWOoW.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002YYb7q14xZq1&tpl=yqq_song_detail","title":"春夏秋冬","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002YYb7q14xZq1"},{"album":"永远是你的朋友","album_id":"qqalbum_003pUBFL10QPM0","artist":"陈慧娴","artist_id":"qqartist_000JvETZ3tOrPR","disabled":false,"id":"qqtrack_000E8jPw26JFub","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/M0/0/003pUBFL10QPM0.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=000E8jPw26JFub&tpl=yqq_song_detail","title":"千千阙歌","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_000E8jPw26JFub"},{"album":"情不禁","album_id":"qqalbum_000SfiAY3OkjWJ","artist":"张学友","artist_id":"qqartist_004Be55m1SJaLk","disabled":false,"id":"qqtrack_002ofckZ2W3h7l","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/WJ/J/000SfiAY3OkjWJ.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002ofckZ2W3h7l&tpl=yqq_song_detail","title":"每天爱你多一些","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002ofckZ2W3h7l"},{"album":"十诫","album_id":"qqalbum_000EYDPE2Ovv1O","artist":"郑秀文","artist_id":"qqartist_002yjHfE3aJX69","disabled":false,"id":"qqtrack_001feZhC1DgMJ2","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/1O/O/000EYDPE2Ovv1O.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001feZhC1DgMJ2&tpl=yqq_song_detail","title":"萨拉热窝的罗密欧与茱丽叶","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001feZhC1DgMJ2"},{"album":"It's All About Angela Pang","album_id":"qqalbum_0048zX5U3GMIgo","artist":"彭家丽","artist_id":"qqartist_003bkIiH06Us4P","disabled":false,"id":"qqtrack_000RtiMX26OTsd","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/go/o/0048zX5U3GMIgo.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=000RtiMX26OTsd&tpl=yqq_song_detail","title":"从不喜欢孤单一个","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_000RtiMX26OTsd"},{"album":"十万个为什么？","album_id":"qqalbum_002BM91811J1TM","artist":"王菲","artist_id":"qqartist_000GDDuQ3sGQiT","disabled":false,"id":"qqtrack_001J1YIq0B5xuy","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/TM/M/002BM91811J1TM.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001J1YIq0B5xuy&tpl=yqq_song_detail","title":"如风","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001J1YIq0B5xuy"},{"album":"忆莲","album_id":"qqalbum_000dc0bw0rvsUC","artist":"林忆莲","artist_id":"qqartist_002u0TJy47WWOj","disabled":false,"id":"qqtrack_0005nMxg3iEZ0c","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/UC/C/000dc0bw0rvsUC.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=0005nMxg3iEZ0c&tpl=yqq_song_detail","title":"激情","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_0005nMxg3iEZ0c"},{"album":"新的开始","album_id":"qqalbum_000ANNC70BFmjO","artist":"许冠杰","artist_id":"qqartist_0005FEv73Z2scR","disabled":false,"id":"qqtrack_000wu3GB3QgG11","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/jO/O/000ANNC70BFmjO.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=000wu3GB3QgG11&tpl=yqq_song_detail","title":"风中赶路人","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_000wu3GB3QgG11"},{"album":"答案就是你","album_id":"qqalbum_000JGIuD2BotLz","artist":"刘德华","artist_id":"qqartist_003aQYLo2x8izP","disabled":false,"id":"qqtrack_002qXtuA0vLIWr","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/Lz/z/000JGIuD2BotLz.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002qXtuA0vLIWr&tpl=yqq_song_detail","title":"暗里着迷","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002qXtuA0vLIWr"},{"album":"零时十分","album_id":"qqalbum_0018xMf91doX5f","artist":"叶倩文","artist_id":"qqartist_00128nnX2r4UFX","disabled":false,"id":"qqtrack_001V0xkY0i7xex","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/5f/f/0018xMf91doX5f.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001V0xkY0i7xex&tpl=yqq_song_detail","title":"零时十分","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001V0xkY0i7xex"},{"album":"流浪花","album_id":"qqalbum_0007Splq2wEI1k","artist":"吕方","artist_id":"qqartist_00081ZN91FD8QW","disabled":false,"id":"qqtrack_001WSpuV3GeHGh","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/1k/k/0007Splq2wEI1k.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001WSpuV3GeHGh&tpl=yqq_song_detail","title":"流浪花","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001WSpuV3GeHGh"},{"album":"我的快乐时代","album_id":"qqalbum_001sM5UF3kkknW","artist":"陈奕迅","artist_id":"qqartist_003Nz2So3XXYek","disabled":false,"id":"qqtrack_003ECrFR1qSNyV","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/nW/W/001sM5UF3kkknW.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=003ECrFR1qSNyV&tpl=yqq_song_detail","title":"天下无双","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_003ECrFR1qSNyV"},{"album":"迷人的五月","album_id":"qqalbum_001C3DA13LhT0b","artist":"甄妮","artist_id":"qqartist_000H1y5p2jQKaU","disabled":false,"id":"qqtrack_001UFUAU0tE9XJ","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/0b/b/001C3DA13LhT0b.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001UFUAU0tE9XJ&tpl=yqq_song_detail","title":"再度孤独","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001UFUAU0tE9XJ"},{"album":"男朋友","album_id":"qqalbum_000xX0JZ1j8BOQ","artist":"古天乐","artist_id":"qqartist_003iS0ID43LIxm","disabled":false,"id":"qqtrack_001W1Twk0CluTZ","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/OQ/Q/000xX0JZ1j8BOQ.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001W1Twk0CluTZ&tpl=yqq_song_detail","title":"天真","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001W1Twk0CluTZ"},{"album":"Grasshopper III","album_id":"qqalbum_003GuXpo3y2pEZ","artist":"草蜢","artist_id":"qqartist_003pVJZJ2uEq4j","disabled":false,"id":"qqtrack_000jBsaI0rY4C1","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/EZ/Z/003GuXpo3y2pEZ.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=000jBsaI0rY4C1&tpl=yqq_song_detail","title":"ABC","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_000jBsaI0rY4C1"},{"album":"真假情话","album_id":"qqalbum_00360h7d4BDQIj","artist":"关淑怡","artist_id":"qqartist_002TQIvU0HOCU3","disabled":false,"id":"qqtrack_0027ylXz1xggZD","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/Ij/j/00360h7d4BDQIj.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=0027ylXz1xggZD&tpl=yqq_song_detail","title":"无尽的爱","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_0027ylXz1xggZD"},{"album":"大热","album_id":"qqalbum_0022QXnD2oNOPY","artist":"张国荣","artist_id":"qqartist_0001v4XU1cZxPy","disabled":false,"id":"qqtrack_0043divU3Jf4ju","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/PY/Y/0022QXnD2oNOPY.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=0043divU3Jf4ju&tpl=yqq_song_detail","title":"愿你决定","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_0043divU3Jf4ju"},{"album":"雨后阳光","album_id":"qqalbum_000vXY034ZKQuv","artist":"许志安","artist_id":"qqartist_000Jh2K72nwQmN","disabled":false,"id":"qqtrack_001FdBwK3sgL5y","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/uv/v/000vXY034ZKQuv.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001FdBwK3sgL5y&tpl=yqq_song_detail","title":"喜欢你是你","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001FdBwK3sgL5y"},{"album":"爱的感觉","album_id":"qqalbum_000sD2rk2sJ31k","artist":"杨采妮","artist_id":"qqartist_002xSVIq1Ichp0","disabled":false,"id":"qqtrack_002eZh5b0oDoQ7","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/1k/k/000sD2rk2sJ31k.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002eZh5b0oDoQ7&tpl=yqq_song_detail","title":"不会哭于你面前","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002eZh5b0oDoQ7"},{"album":"爱的根源","album_id":"qqalbum_001Pqm2V3obm8Q","artist":"谭咏麟","artist_id":"qqartist_0040D7gK4aI54k","disabled":false,"id":"qqtrack_0020iupA1mwhvq","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/8Q/Q/001Pqm2V3obm8Q.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=0020iupA1mwhvq&tpl=yqq_song_detail","title":"夏日寒风","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_0020iupA1mwhvq"},{"album":"Leon Sound","album_id":"qqalbum_003EXFoL0MuZ17","artist":"黎明","artist_id":"qqartist_001wYy5s2mM3Tq","disabled":false,"id":"qqtrack_000nckjp2Yr3Op","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/17/7/003EXFoL0MuZ17.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=000nckjp2Yr3Op&tpl=yqq_song_detail","title":"你令爱了不起","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_000nckjp2Yr3Op"},{"album":"together","album_id":"qqalbum_004DQp4S1lsq1e","artist":"郑伊健","artist_id":"qqartist_003bdcMg1ML7YC","disabled":false,"id":"qqtrack_003uRGOY4BAOEz","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/1e/e/004DQp4S1lsq1e.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=003uRGOY4BAOEz&tpl=yqq_song_detail","title":"Together","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_003uRGOY4BAOEz"},{"album":"绝对空虚","album_id":"qqalbum_0024rh0u108sCs","artist":"蔡枫华","artist_id":"qqartist_001lbSD32A74M2","disabled":false,"id":"qqtrack_000jUPPE1QAGwP","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/Cs/s/0024rh0u108sCs.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=000jUPPE1QAGwP&tpl=yqq_song_detail","title":"绝对空虚","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_000jUPPE1QAGwP"},{"album":"黑白精选","album_id":"qqalbum_002CS0063thzrp","artist":"叶德娴","artist_id":"qqartist_002C4R3n2Z3jJB","disabled":false,"id":"qqtrack_002fMSD41GoVMe","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/rp/p/002CS0063thzrp.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002fMSD41GoVMe&tpl=yqq_song_detail","title":"千个太阳","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002fMSD41GoVMe"},{"album":"抱着你的日子","album_id":"qqalbum_001M7Sdu0RZOsn","artist":"彭羚","artist_id":"qqartist_001GnU7a0kBSHD","disabled":false,"id":"qqtrack_001V3JpP1uWqUL","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/sn/n/001M7Sdu0RZOsn.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001V3JpP1uWqUL&tpl=yqq_song_detail","title":"夜风铃","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001V3JpP1uWqUL"},{"album":"偏偏喜欢你 永远的珍藏","album_id":"qqalbum_003ebkff43PizI","artist":"陈百强","artist_id":"qqartist_0033DUFG3yj0r3","disabled":false,"id":"qqtrack_001ukLQU3MZKMG","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/zI/I/003ebkff43PizI.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=001ukLQU3MZKMG&tpl=yqq_song_detail","title":"摘星","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_001ukLQU3MZKMG"},{"album":"封面女郎","album_id":"qqalbum_001YwctD3AleZ4","artist":"梅艳芳","artist_id":"qqartist_0011CYh41MbdFm","disabled":false,"id":"qqtrack_002UvVtA2lHwSb","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/Z4/4/001YwctD3AleZ4.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002UvVtA2lHwSb&tpl=yqq_song_detail","title":"封面女郎","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002UvVtA2lHwSb"},{"album":"Kiss（新曲 + 精选）","album_id":"qqalbum_003yMH6U3aqc82","artist":"梁咏琪","artist_id":"qqartist_003RfioZ1j7KJR","disabled":false,"id":"qqtrack_002jq85F19XjiN","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/82/2/003yMH6U3aqc82.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002jq85F19XjiN&tpl=yqq_song_detail","title":"一天一天","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002jq85F19XjiN"},{"album":"The Legendary Collection -雨夜钢琴","album_id":"qqalbum_000aej2l3f57iS","artist":"林志美","artist_id":"qqartist_00143oyS1BatzG","disabled":false,"id":"qqtrack_003La6Y036gr3e","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/iS/S/000aej2l3f57iS.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=003La6Y036gr3e&tpl=yqq_song_detail","title":"雨夜钢琴","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_003La6Y036gr3e"},{"album":"当找到你","album_id":"qqalbum_003mGMCr3jusEx","artist":"李克勤","artist_id":"qqartist_003nS2v740Lxcw","disabled":false,"id":"qqtrack_002Ls0291uPipj","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/Ex/x/003mGMCr3jusEx.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002Ls0291uPipj&tpl=yqq_song_detail","title":"当找到你","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002Ls0291uPipj"},{"album":"林子祥创作歌集","album_id":"qqalbum_0009fBmG3qdBzw","artist":"林子祥","artist_id":"qqartist_003xM8SD2WibJI","disabled":false,"id":"qqtrack_002j1xev2dFsKC","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/zw/w/0009fBmG3qdBzw.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002j1xev2dFsKC&tpl=yqq_song_detail","title":"每一个晚上","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002j1xev2dFsKC"},{"album":"封锁我一生","album_id":"qqalbum_002TM7iM3IFT4G","artist":"王杰","artist_id":"qqartist_003NKwHr46UKeR","disabled":false,"id":"qqtrack_002taFH80D6Bjk","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/4G/G/002TM7iM3IFT4G.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=002taFH80D6Bjk&tpl=yqq_song_detail","title":"从未这样爱过","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_002taFH80D6Bjk"},{"album":"继续革命","album_id":"qqalbum_004ex7iR3S9VcR","artist":"BEYOND","artist_id":"qqartist_002pUZT93gF4Cu","disabled":false,"id":"qqtrack_003lXjR90ymBm6","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/cR/R/004ex7iR3S9VcR.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=003lXjR90ymBm6&tpl=yqq_song_detail","title":"早班火车","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_003lXjR90ymBm6"},{"album":"娴情","album_id":"qqalbum_0034M8WE15rgLa","artist":"陈慧娴","artist_id":"qqartist_000JvETZ3tOrPR","disabled":false,"id":"qqtrack_003brDHY0I5yrc","img_url":"http://imgcache.qq.com/music/photo/mid_album_300/La/a/0034M8WE15rgLa.jpg","source":"qq","source_url":"http://y.qq.com/#type=song&mid=003brDHY0I5yrc&tpl=yqq_song_detail","title":"傻女","url":"http://193.112.93.197:9999/bootstrap_track?track_id=qqtrack_003brDHY0I5yrc"}]
     * info : {"id":"qqplaylist_5519081958","title":"鬼才林振强笔下的粤语作品 ","cover_img_url":"http://p.qpic.cn/music_cover/gu6Yf5YflwkKK1xnz7gjxUYV8TWWHjGHhzt4r2lnSc8DoGfGMYyjuw/300?n=1","source_url":"https://y.qq.com/n/yqq/playlist/5519081958.html"}
     */

    private String is_mine;
    private InfoBean info;
    private List<ConvertSongBean> tracks;


    public PlayListResult() {
        this.tracks = new ArrayList<>(64);
    }

    public String getIs_mine() {
        return is_mine;
    }

    public void setIs_mine(String is_mine) {
        this.is_mine = is_mine;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<ConvertSongBean> getTracks() {
        return tracks;
    }

    public void setTracks(List<ConvertSongBean> tracks) {
        this.tracks = tracks;
    }

    public static class InfoBean {
        /**
         * id : qqplaylist_5519081958
         * title : 鬼才林振强笔下的粤语作品
         * cover_img_url : http://p.qpic.cn/music_cover/gu6Yf5YflwkKK1xnz7gjxUYV8TWWHjGHhzt4r2lnSc8DoGfGMYyjuw/300?n=1
         * source_url : https://y.qq.com/n/yqq/playlist/5519081958.html
         */

        private String id;
        private String title;
        private String cover_img_url;
        private String source_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCover_img_url() {
            return cover_img_url;
        }

        public void setCover_img_url(String cover_img_url) {
            this.cover_img_url = cover_img_url;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }
    }

}

