package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class LyricControllerTest extends BaseControllerTest{

    @Test
    public void lyric() throws Exception {
        for (String songId: Stream.of("qqtrack_002HybvF4WaCcj", "netrack_443882206").toArray(String[]::new)){
            baseTest("/lyric", Dict.create()
                    .set("track_id", songId), true);
        }
        baseTest("/lyric", Dict.create()
                .set("track_id", "xmtrack_193963")
                .set("lyric_url", "http://img.xiami.net/lyric/193963_13776673272808.lrc"), true);
    }
}