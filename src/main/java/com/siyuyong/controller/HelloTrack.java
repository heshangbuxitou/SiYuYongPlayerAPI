package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import com.siyuyong.config.ServiceConfig;
import com.siyuyong.util.MapGenerateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class HelloTrack {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> helloProcess(HttpServletRequest request) {
        return Dict.create().set("hello", "world");
    }
}
