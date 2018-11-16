package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import org.junit.Test;

import java.util.stream.Stream;

public class BootstrapTrackTest extends BaseControllerTest {

    @Test
    public void bootstrapTrack() throws Exception {
        for (String songId: Stream.of("netrack_27646597", "xmtrack_1805931174", "qqtrack_002HybvF4WaCcj").toArray(String[]::new)){
            baseTest("/bootstrap_track", Dict.create()
                    .set("track_id", songId));
        }
    }
}