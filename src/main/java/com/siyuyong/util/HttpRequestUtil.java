package com.siyuyong.util;


import cn.hutool.http.HttpUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequestUtil {
    private HttpRequestUtil() {
    }

    public static Map<String, List<String>> headers;

    static {
        headers = new HashMap<>();
        headers.put("user_agent", Arrays.asList("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86" +
                " Safari/537.36"));
    }

    public static String GetRequest(String url, Map<String, List<String>> extendHeaders, Map<String, Object> paramMap) {
        return HttpUtil.createGet(url).header(headers, true).setFollowRedirects(true).header(extendHeaders, true).form(paramMap).execute().body();
    }

    public static String PostRequest(String url, Map<String, List<String>> extendHeaders, Map<String, Object> paramMap) {
        return HttpUtil.createPost(url).header(headers, true).setFollowRedirects(true).header(extendHeaders, true).form(paramMap).execute().body();
    }
}
