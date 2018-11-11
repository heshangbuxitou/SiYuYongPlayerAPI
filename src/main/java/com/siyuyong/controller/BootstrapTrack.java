package com.siyuyong.controller;

import com.siyuyong.config.ServiceConfig;
import com.siyuyong.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BootstrapTrack {

    @Autowired
    ServiceConfig serviceConfig;

    @RequestMapping(value = "/bootstrap_track", method = RequestMethod.GET)
    public String springboot(@RequestParam(value = "track_id") String trackId) {
        ReplayService service = serviceConfig.getReplayServiceByPrefix(trackId);
        return service.getUrlById(trackId.split("_")[1]);
    }
}
