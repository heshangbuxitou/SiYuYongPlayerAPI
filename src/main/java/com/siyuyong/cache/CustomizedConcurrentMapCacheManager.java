package com.siyuyong.cache;

import cn.hutool.core.util.ReflectUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName CustomizedConcurrentMapCacheManager
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/11/21 10:15
 * @Version 1.0
 */
//@Component
//@Primary
public class CustomizedConcurrentMapCacheManager extends ConcurrentMapCacheManager {
    private static final Logger logger = LoggerFactory.getLogger(CustomizedConcurrentMapCacheManager.class);

    /**
     * 父类cacheMap字段
     */
    private static final String SUPER_FIELD_CACHEMAP = "cacheMap";

    /**
     * 父类dynamic字段
     */
    private static final String SUPER_FIELD_DYNAMIC = "dynamic";

    /**
     * 父类allowNullValues字段
     */
    private static final String SUPER_FIELD_ALLOWNULLVALUES = "allowNullValues";

    private static final String SUPER_FIELD_SERIALIZATION = "serialization";

    /**
     * 父类updateCacheNames方法
     */
    private static final String SUPER_METHOD_UPDATECACHENAMES = "updateCacheNames";

    /**
     * 缓存参数的分隔符
     * 数组元素0=缓存的名称
     * 数组元素1=缓存过期时间TTL
     * 数组元素2=缓存在多少秒开始主动失效来强制刷新
     */
    private static final String SEPARATOR = "#";

    private long defaultExpiration = 300L;
    /**
     * SpEL标示符
     */
    private static final String MARK = "$";

    @Autowired
    CustomizedConcurrentMapCacheManager cacheManager;

    @Autowired
    DefaultListableBeanFactory beanFactory;

    private Map<String, Long> expires;

    public CustomizedConcurrentMapCacheManager() {
        super();
    }

    public CustomizedConcurrentMapCacheManager(Collection<String> cacheNames) {
        super(cacheNames.toArray(new String[cacheNames.size()]));
    }

    // 设置默认的时间
    public void setDefaultExpiration(long defaultExpireTime) {
        this.defaultExpiration = defaultExpireTime;
    }

    // 根据特定名称设置有效时间
    public void setExpires(Map<String, Long> expires) {
        this.expires = (expires != null ? new ConcurrentHashMap<String, Long>(expires) : null);
    }

    // 获取一个key的有效时间
    protected long computeExpiration(String name) {
        Long expiration = null;
        if (expires != null) {
            expiration = expires.get(name);
        }
        return (expiration != null ? expiration.longValue() : defaultExpiration);
    }

    public ConcurrentMapCacheManager getInstance() {
        return cacheManager;
    }

    @Override
    public Cache getCache(String name) {
        String[] cacheParams = name.split(SEPARATOR);
        String cacheName = cacheParams[0];

        if (StringUtils.isBlank(cacheName)) {
            return null;
        }

        // 有效时间，初始化获取默认的有效时间
        Long expirationSecondTime = getExpirationSecondTime(cacheName, cacheParams);
        // 自动刷新时间，默认是0
        Long preloadSecondTime = getExpirationSecondTime(cacheParams);

        // 通过反射获取父类存放缓存的容器对象
        Object object = ReflectUtil.getFieldValue(getInstance(), SUPER_FIELD_CACHEMAP);
        if (object != null && object instanceof ConcurrentHashMap) {
            ConcurrentHashMap<String, Cache> cacheMap = (ConcurrentHashMap<String, Cache>) object;
            // 生成Cache对象，并将其保存到父类的Cache容器中
            return getCache(cacheName, expirationSecondTime, preloadSecondTime, cacheMap);
        } else {
            throw new RuntimeException("容器对象错误，为null 或者 不是ConcurrentHashMap类型");
        }
    }

    /**
     * 获取过期时间
     *
     * @return
     */
    private long getExpirationSecondTime(String cacheName, String[] cacheParams) {
        // 有效时间，初始化获取默认的有效时间
        Long expirationSecondTime = this.computeExpiration(cacheName);

        // 获取key有效时间
        if (cacheParams.length > 1) {
            String expirationStr = cacheParams[1];
            if (!StringUtils.isEmpty(expirationStr)) {
                // 支持配置过期时间使用EL表达式读取配置文件时间
                if (expirationStr.contains(MARK)) {
                    expirationStr = beanFactory.resolveEmbeddedValue(expirationStr);
                }
                expirationSecondTime = Long.parseLong(expirationStr);
            }
        }

        return expirationSecondTime.longValue();
    }

    /**
     * 获取自动刷新时间
     *
     * @return
     */
    private long getExpirationSecondTime(String[] cacheParams) {
        // 自动刷新时间，默认是0
        Long preloadSecondTime = 0L;

        // 设置自动刷新时间
        if (cacheParams.length > 2) {
            String preloadStr = cacheParams[2];
            if (!StringUtils.isEmpty(preloadStr)) {
                // 支持配置刷新时间使用EL表达式读取配置文件时间
                if (preloadStr.contains(MARK)) {
                    preloadStr = beanFactory.resolveEmbeddedValue(preloadStr);
                }
                preloadSecondTime = Long.parseLong(preloadStr);
            }
        }
        return preloadSecondTime.longValue();
    }

    /**
     * 重写父类的getCache方法，真假了三个参数
     *
     * @param cacheName            缓存名称
     * @param expirationSecondTime 过期时间
     * @param preloadSecondTime    自动刷新时间
     * @param cacheMap             通过反射获取的父类的cacheMap对象
     * @return Cache
     */
    public Cache getCache(String cacheName, long expirationSecondTime, long preloadSecondTime, ConcurrentHashMap<String, Cache> cacheMap) {
        Cache cache = cacheMap.get(cacheName);
        if (cache != null) {
            return cache;
        } else {
            // Fully synchronize now for missing cache creation... todo 需要锁住整个map?
            // 其实可以锁住 对应的String，但是可能会对其他地方使用同样String的锁有影响，取舍问题
            // 引入 KeyLock 解决这个问题
            try {
                SingleInstance.INSTANCE.getKeyInstance().lock(cacheName);
                cache = cacheMap.get(cacheName);
                if (cache == null) {
                    // 调用我们自己的getMissingCache方法创建自己的cache
                    cache = getMissingCache(cacheName, expirationSecondTime, preloadSecondTime);
                    if (cache != null) {
                        cacheMap.put(cacheName, cache);
                    }
                }
                return cache;
            }finally {
                SingleInstance.INSTANCE.getKeyInstance().unlock(cacheName);
            }
        }
    }

    /**
     * 创建缓存
     *
     * @param cacheName            缓存名称
     * @param expirationSecondTime 过期时间
     * @param preloadSecondTime    制动刷新时间
     * @return
     */
    public CustomizedConcurrentMapCache getMissingCache(String cacheName, long expirationSecondTime, long preloadSecondTime) {

        logger.info("缓存 cacheName：{}，过期时间:{}, 自动刷新时间:{}", cacheName, expirationSecondTime, preloadSecondTime);
        Boolean dynamic = (Boolean) ReflectUtil.getFieldValue(getInstance(), SUPER_FIELD_DYNAMIC);
        return dynamic ? new CustomizedConcurrentMapCache(cacheName, new ConcurrentHashMap<>(256), isAllowNullValues(), expirationSecondTime, preloadSecondTime) : null;
    }
}

