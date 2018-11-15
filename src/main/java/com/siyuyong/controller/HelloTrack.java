package com.siyuyong.controller;

import com.siyuyong.config.ServiceConfig;
import com.siyuyong.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTrack {

    @Autowired
    ServiceConfig serviceConfig;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String springboot() {
        return "hello,world";
    }
}
