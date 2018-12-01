package com.siyuyong.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListPlayListResult
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/1 20:21
 * @Version 1.0
 */
public class ListPlayListResult {

    private List<ResultBean> result;

    public ListPlayListResult() {
        this.result = new ArrayList<>(64);
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * list_id : qqplaylist_5424225889
         * title : 一曲相诉，侠客江湖里的红尘纷扰
         * play_count : 1064593
         * cover_img_url : http://p.qpic.cn/music_cover/qhuJFHlwiayRp1rhWoJk9HdJb1O3rbE2VMRBYG6MXkianQVVQQZyEzQw/600?n=1
         */

        private String list_id;
        private String title;
        private int play_count;
        private String cover_img_url;
        private String source_url;

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getList_id() {
            return list_id;
        }

        public void setList_id(String list_id) {
            this.list_id = list_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPlay_count() {
            return play_count;
        }

        public void setPlay_count(int play_count) {
            this.play_count = play_count;
        }

        public String getCover_img_url() {
            return cover_img_url;
        }

        public void setCover_img_url(String cover_img_url) {
            this.cover_img_url = cover_img_url;
        }
    }
}

