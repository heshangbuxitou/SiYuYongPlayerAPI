package com.siyuyong.builder;

import cn.hutool.http.HttpRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequestBuiler {
    public HttpRequest httpRequest;

    public Map<String, List<String>> headers;

    public HttpRequestBuiler(String url) {
        httpRequest = new HttpRequest(url);
        headers = new HashMap<>();
        headers.put("user_agent", Arrays.asList("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86" +
                " Safari/537.36"));
        httpRequest.header(headers,true);

    }

    public HttpRequestBuiler setHeaders(Map<String, List<String>> extraHeaders) {
        httpRequest.header(headers,true);
        return this;
    }

    public HttpRequest createHttpRequest(){
        return httpRequest;
    }



}
