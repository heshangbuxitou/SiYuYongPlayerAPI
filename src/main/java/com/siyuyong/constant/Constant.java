package com.siyuyong.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Constant {
    //此数据是读取的配置文件
    public static String DEFAULT_SERVER_PORT;
    //注入
    @Autowired(required = false)
    public void setUploadPath(@Value("${player.server.port}")String DEFAULT_SERVER_PORT) {
        Constant.DEFAULT_SERVER_PORT = DEFAULT_SERVER_PORT;
    }

}