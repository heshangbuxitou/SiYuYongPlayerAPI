package com.siyuyong.controller;


import com.alibaba.fastjson.JSONObject;
import com.siyuyong.util.MapGenerateUtil;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorInterceptor implements ErrorController {

    private final static String ERROR_PATH = "/error";

    @RequestMapping(ERROR_PATH)
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String[] keyList = {"error"};
        if (statusCode == 401) {
            return JSONObject.toJSONString(MapGenerateUtil.createMap(keyList, new Object[]{"资源禁止访问。。"}));
        } else if (statusCode == 404) {
            return JSONObject.toJSONString(MapGenerateUtil.createMap(keyList, new Object[]{"页面找不到了。。。"}));
        } else if (statusCode == 403) {
            return JSONObject.toJSONString(MapGenerateUtil.createMap(keyList, new Object[]{"页面错误了。。。。"}));

        } else {
            return JSONObject.toJSONString(MapGenerateUtil.createMap(keyList, new Object[]{"服务器错误了。。。"}));

        }

    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
