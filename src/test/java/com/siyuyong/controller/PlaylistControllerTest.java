package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PlaylistControllerTest extends BaseControllerTest {

    @Test
    public void showPlaylist() throws Exception {
        for (String source : Stream.of("0", "1", "2").toArray(String[]::new)) {
            baseTest("/show_playlist", Dict.create()
                    .set("source", source));
        }
    }

    @Test
    public void playlist() throws Exception {
        for (String listId : Stream.of("qqplaylist_5519081958", "qqartist_0001v4XU1cZxPy", "qqalbum_004TbrNI1HoWun").toArray(String[]::new)) {
            baseTest("/playlist", Dict.create()
                    .set("list_id", listId));
        }
        for (String listId : Stream.of("neplaylist_2511560749", "neartist_1038040", "nealbum_3122000").toArray(String[]::new)) {
            baseTest("/playlist", Dict.create()
                    .set("list_id", listId));
        }
        for (String listId : Stream.of("xmplaylist_584623436", "xmartist_58831", "xmalbum_298003").toArray(String[]::new)) {
            baseTest("/playlist", Dict.create()
                    .set("list_id", listId));
        }
    }
}