package com.siyuyong.cache;

/**
 * @ClassName CacheTime
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/11/21 10:53
 * @Version 1.0
 */

public class CacheTime {
    /**
     * 刷新时间， 缓存有效时间
     * @param preloadSecondTime
     * @param expirationSecondTime
     */
    public CacheTime(long preloadSecondTime, long expirationSecondTime) {
        this.preloadSecondTime = preloadSecondTime;
        this.expirationSecondTime = expirationSecondTime;
    }

    /**
     * 缓存主动在失效前强制刷新缓存的时间
     * 单位：秒
     */
    private long preloadSecondTime = 0;

    /**
     * 缓存有效时间
     */
    private long expirationSecondTime;

    public long getPreloadSecondTime() {
        return preloadSecondTime;
    }

    public long getExpirationSecondTime() {
        return expirationSecondTime;
    }

}

