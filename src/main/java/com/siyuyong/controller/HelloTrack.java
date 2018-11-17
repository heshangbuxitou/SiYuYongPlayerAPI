package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import com.siyuyong.config.ServiceConfig;
import com.siyuyong.util.MapGenerateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

@RestController
public class HelloTrack {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> helloProcess(HttpServletRequest request) {
        String retrunValue = "Hello, Angus! This is GET request!";
        System.out.println("=======GET Process=======");

        Map<String,String[]> requestMsg = request.getParameterMap();
        Enumeration<String> headerNames = request.getHeaderNames();
        Enumeration<String> requestHeader = headerNames;

        System.out.println("------- header -------");
        while(requestHeader.hasMoreElements()){
            String headerKey=requestHeader.nextElement().toString();
            //打印所有Header值

            System.out.println("headerKey="+headerKey+";value="+request.getHeader(headerKey));
        }

        System.out.println("------- parameter -------");
        for(String key :requestMsg.keySet())
        {
            for(int i=0;i<requestMsg.get(key).length;i++)
            {
                //打印所有请求参数值

                System.out.println("key="+key+";value="+requestMsg.get(key)[i].toString());
            }
        }
        return Dict.create().set("hello", retrunValue);
    }
}
