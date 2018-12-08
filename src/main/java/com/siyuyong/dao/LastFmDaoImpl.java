package com.siyuyong.dao;

import cn.hutool.core.lang.Dict;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.siyuyong.domain.LastFmUser;
import com.siyuyong.domain.SessionParam;
import com.siyuyong.util.MyUtils;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName LastFmDaoImpl
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/5 23:17
 * @Version 1.0
 */
@Component
public class LastFmDaoImpl implements LastFmDao {

    public final static String API_URL = "https://ws.audioscrobbler.com/2.0/";
    public final static String API_KEY = "6790c00a181128dc7c4ce06cd99d17c8";
    public final static String API_SECRET = "d68f1dfc6ff43044c96a79ae7dfb5c27";

    @Override
    public LastFmUser getUserInfo(SessionParam sessionParam) {
        Dict params = Dict.create().set("method", "user.getinfo")
                .set("api_key", API_KEY)
                .set("sk", sessionParam.getKey());
        params.set("api_sig", generateSign(params));
        params.set("format", "json");

        String resp = HttpUtil.createPost(API_URL).setFollowRedirects(true).form(params).execute().body();
        return JSON.parseObject(resp, LastFmUser.class);
    }

    public static String generateSign(Dict params) {
        String[] strings = params.keySet().toArray(new String[params.size()]);
        Arrays.sort(strings);
        StringBuffer result = new StringBuffer();
        for(String s: strings){
            if (!s.equals("format") && !s.equals("callback")){
                result.append(s);
                result.append(params.get(s));
            }
        }
        String res = MyUtils.urlEncode(result.toString()) + API_SECRET;
        return MD5Encoder.encode(res.getBytes());
    }
}

