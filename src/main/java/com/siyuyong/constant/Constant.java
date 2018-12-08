package com.siyuyong.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Constant {
    //此数据是读取的配置文件
    public static String DEFAULT_SERVER_PORT;
    public static String DEFAULT_SERVER_IP;
    public static List<String> USER_FILTER_URLS;
    public static String LASTFM_KEY = "key";

    static {
        USER_FILTER_URLS = Arrays.asList("/upload", "/download", "/getusername", "/hello");
    }

    //注入
    @Autowired(required = false)
    public void setDefaultServerPort(@Value("${player.server.port}") String DEFAULT_SERVER_PORT) {
        Constant.DEFAULT_SERVER_PORT = DEFAULT_SERVER_PORT;
    }

    //注入
    @Autowired(required = false)
    public void setDefaultServerIp(@Value("${player.server.ip}") String DEFAULT_SERVER_IP) {
        Constant.DEFAULT_SERVER_IP = DEFAULT_SERVER_IP;
    }

}