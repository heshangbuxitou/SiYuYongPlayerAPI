package com.siyuyong.controller;

import com.siyuyong.config.ServiceConfig;
import com.siyuyong.service.ReplayService;
import com.siyuyong.util.MapGenerateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloTrack {

    @Autowired
    ServiceConfig serviceConfig;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> springboot() {
        return MapGenerateUtil.createMap(new String[]{"hello"},new Object[]{"world"});
    }
}
