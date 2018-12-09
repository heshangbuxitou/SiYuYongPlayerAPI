package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import com.siyuyong.constant.Constant;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloTrack {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @Cacheable(value = "Cache#${select.cache.timeout}#${select.cache.refresh}", key = "T(String).valueOf(#index)") // SpEL表达式 组合Key 也可以这样 T(String).valueOf(#index).concat(#offset)
    public Map<String, Object> helloProcess(int index) {
        String path = Constant.UPLOAD_PATH;
        System.out.println("==============我被调用了=============" + index);
        return Dict.create().set("hello", "world");
    }
}
