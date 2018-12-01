package com.siyuyong.service;

import com.siyuyong.domain.BootstrapResult;
import com.siyuyong.domain.ListPlayListResult;
import com.siyuyong.domain.LyricResult;
import com.siyuyong.domain.SearchResult;

import java.util.Map;

public interface ReplayService {
    /**
     * @param keyword 搜索的关键子
     * @return 搜索结果，考虑改成Bean形式返回
     */
    SearchResult searchTrack(String keyword);

    /**
     * @param songId 歌曲的id
     * @return 歌词相关结果
     */
    LyricResult getLyricById(String songId);

    /**
     * @param offset 偏移量
     * @return 首页歌单列表
     */
    ListPlayListResult listPlaylist(String offset);

    /**
     * @param listId 歌曲的listid
     * @return 返回 歌手，专辑， 歌单
     */
    Map<String, Object> getPlaylist(String listId);

    /**
     * @param songId 歌曲id
     * @return 歌曲url
     */
    BootstrapResult getUrlById(String songId);
}
