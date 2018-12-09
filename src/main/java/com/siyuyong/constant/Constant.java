package com.siyuyong.constant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Constant {
    public static String DEFAULT_SERVER_PORT;
    public static String DEFAULT_SERVER_IP;
    public static List<String> USER_FILTER_URLS;
    public static String LASTFM_KEY = "key";
    public static String UPLOAD_PATH;

    static {
        USER_FILTER_URLS = Arrays.asList("/upload", "/download", "/getusername");

//        try {
//            File file = ResourceUtils.getFile("classpath:upload");
//            UPLOAD_PATH = file.getAbsolutePath();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
    }

    @Autowired
    public void setDefaultServerPort(@Value("${player.server.port}") String DEFAULT_SERVER_PORT) {
        Constant.DEFAULT_SERVER_PORT = DEFAULT_SERVER_PORT;
    }

    @Autowired
    public void setDefaultServerIp(@Value("${player.server.ip}") String DEFAULT_SERVER_IP) {
        Constant.DEFAULT_SERVER_IP = DEFAULT_SERVER_IP;
    }

    @Autowired
    public void setUploadPath(@Value("${player.server.upload}") String UPLOAD_PATH) {
        File file = new File(UPLOAD_PATH);
        file.mkdirs();
        Constant.UPLOAD_PATH = UPLOAD_PATH;
    }
}