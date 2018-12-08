package com.siyuyong.dao;

import com.siyuyong.domain.LastFmUser;
import com.siyuyong.domain.SessionParam;

/**
 * @ClassName LastFmDao
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/5 23:15
 * @Version 1.0
 */
public interface LastFmDao {
    /**
     * 获取LastFm用户信息
     * @param sessionParam
     * @return
     */
    LastFmUser getUserInfo(SessionParam sessionParam);
}

