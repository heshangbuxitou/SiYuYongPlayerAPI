package com.siyuyong.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.siyuyong.constant.Constant;
import com.siyuyong.dao.LastFmDao;
import com.siyuyong.domain.GeneralResult;
import com.siyuyong.domain.LastFmUser;
import com.siyuyong.domain.SessionParam;
import com.siyuyong.util.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;

/**
 * @ClassName AuthController
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/2 22:57
 * @Version 1.0
 */
@RestController
public class AuthController {

    @Autowired
    LastFmDao lastFmDao;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "session") String sessionStr, HttpServletRequest request) {
        SessionParam sessionParam = JSON.parseObject(sessionStr, SessionParam.class);
        HttpSession session = request.getSession();
        if (session.getAttribute(Constant.LASTFM_KEY) == null || !session.getAttribute(Constant.LASTFM_KEY).equals(sessionParam.getKey())) {
            LastFmUser userInfo = lastFmDao.getUserInfo(sessionParam);
            session.setAttribute("username", userInfo.getUser().getName());
            session.setAttribute("key", sessionParam.getKey());
        }

        Path path = Paths.get(Constant.UPLOAD_PATH, session.getAttribute("username") + ".json");
        return new String(MyUtils.readPathBytes(path));
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public GeneralResult upload(HttpServletRequest request) {
        // 处理请求参数
        Enumeration<String> params = request.getParameterNames();
        JSONObject parmsObj = new JSONObject();
        while (params.hasMoreElements()) {
            String element = params.nextElement();
            String value = request.getParameter(element);
            parmsObj.put(element, JSONObject.parse(value));
        }
        HttpSession session = request.getSession();
        Path path = Paths.get(Constant.UPLOAD_PATH, session.getAttribute("username") + ".json");
        MyUtils.writeString(path, parmsObj.toJSONString());
        return GeneralResult.createInstance("success");
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void download(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Path path = Paths.get(Constant.UPLOAD_PATH, session.getAttribute("username") + ".json");
        byte[] allBytes = MyUtils.readPathBytes(path);

        String mimeType = "application/octet-stream";
        response.setContentType(mimeType);
        response.setContentLength(allBytes.length);

        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=" + MyUtils.urlEncode("listen_backup.json"));
        response.setHeader(headerKey, headerValue);

        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            outputStream.write(allBytes);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}

