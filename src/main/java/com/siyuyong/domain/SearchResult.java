package com.siyuyong.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SearchResult
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/1 18:34
 * @Version 1.0
 */
public class SearchResult {

    private List<ConvertSongBean> result;

    public SearchResult() {
        this.result = new ArrayList<ConvertSongBean>(32);
    }

    public List<ConvertSongBean> getResult() {
        return result;
    }

    public void setResult(List<ConvertSongBean> result) {
        this.result = result;
    }

}

