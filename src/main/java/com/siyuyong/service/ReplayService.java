package com.siyuyong.service;

import java.util.Map;

public interface ReplayService {
    String searchTrack(String keyword);
    String getLyricById(String songId);
    String listPlaylist(String offset);
    Map<String, Object> getPlaylist(String listId);
    String getUrlById(String songId);
}
