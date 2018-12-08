package com.siyuyong.service;

import com.siyuyong.domain.SessionParam;

/**
 * @ClassName AuthService
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/5 22:59
 * @Version 1.0
 */
public interface AuthService {
    /**
     * 验证是否登录
     * @param sessionParam
     * @return
     */
    Boolean isLogin(SessionParam sessionParam);

    /**
     * 登录当前用户
     * @param sessionParam
     */
    void Login(SessionParam sessionParam);
}

