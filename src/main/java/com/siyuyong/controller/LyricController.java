package com.siyuyong.controller;

import com.siyuyong.config.ServiceConfig;
import com.siyuyong.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LyricController {
    @Autowired
    ServiceConfig serviceConfig;

    @RequestMapping(value = "/lyric", method = RequestMethod.GET)
    public String springboot(@RequestParam(value = "track_id", required = false) String trackId,
                             @RequestParam(value = "lyric_url", required = false) String lyricUrl) {
        String[] trackArray = trackId.split("_");
        ReplayService service = serviceConfig.getReplayServiceByIndex(Integer.valueOf(trackArray[0]));

        // 兼容虾米
        if (lyricUrl != null && !lyricUrl.equals("")){
            trackArray[1] = lyricUrl;
        }
        return service.getLyricById(trackArray[1]);
    }
}
