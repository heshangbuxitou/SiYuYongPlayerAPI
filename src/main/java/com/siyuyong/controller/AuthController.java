package com.siyuyong.controller;

import com.alibaba.fastjson.JSON;
import com.siyuyong.constant.Constant;
import com.siyuyong.dao.LastFmDao;
import com.siyuyong.domain.GeneralResult;
import com.siyuyong.domain.LastFmUser;
import com.siyuyong.domain.SessionParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public GeneralResult login(@RequestParam(value = "session") String sessionStr, HttpServletRequest request) {
        SessionParam sessionParam = JSON.parseObject(sessionStr, SessionParam.class);
        HttpSession session = request.getSession();
        if (session.getAttribute(Constant.LASTFM_KEY) == null || !session.getAttribute(Constant.LASTFM_KEY).equals(sessionParam.getKey())) {
            LastFmUser userInfo = lastFmDao.getUserInfo(sessionParam);
            session.setAttribute("username", userInfo.getUser().getName());
            session.setAttribute("key", sessionParam.getKey());
        }
        return GeneralResult.createInstance("success");
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public GeneralResult upload(@RequestParam(value = "session") String sessionStr, HttpServletRequest request) {
        SessionParam sessionParam = JSON.parseObject(sessionStr, SessionParam.class);
        HttpSession session = request.getSession();
        if (session.getAttribute(Constant.LASTFM_KEY) == null || !session.getAttribute(Constant.LASTFM_KEY).equals(sessionParam.getKey())) {
            LastFmUser userInfo = lastFmDao.getUserInfo(sessionParam);
            session.setAttribute("username", userInfo.getUser().getName());
            session.setAttribute("key", sessionParam.getKey());
        }
        return GeneralResult.createInstance("success");
    }
}

