package com.siyuyong.cache;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ReflectUtil;
import com.siyuyong.util.SpringContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.core.serializer.support.SerializationDelegate;
import org.springframework.lang.Nullable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;

/**
 * @ClassName CustomizedConcurrentMapCache
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/11/21 23:27
 * @Version 1.0
 */
public class CustomizedConcurrentMapCache extends ConcurrentMapCache {

    /**
     * 缓存失效时间
     * 单位：秒
     */
    private long expirationSecondTime = 0;
    /**
     * 缓存主动在失效前强制刷新缓存的时间
     * 单位：秒
     */
    private long preloadSecondTime = 0;

    private static int TIME_CONVERNT_INTERVAL = 1000;
    /**
     * 创建时间
     */
    private long createTime = System.currentTimeMillis();

    private String SUPER_FIELD_STORE = "store";

    private String SUPER_METHOD_TOVALUEWRAPPER = "toValueWrapper";

    private CacheSupport getCacheSupport() {
        return SpringContextUtils.getBean(CacheSupport.class);
    }
    public Map<Object, Long> getCacheCreateTime() {
        return cacheCreateTime;
    }

    public void setCacheCreateTime(Map<Object, Long> cacheCreateTime) {
        this.cacheCreateTime = cacheCreateTime;
    }

    private Map<Object, Long> cacheCreateTime = new ConcurrentHashMap();

    public CustomizedConcurrentMapCache(String name, long expirationSecondTime, long preloadSecondTime) {
        this(name, new ConcurrentHashMap<>(256), true, null, expirationSecondTime, preloadSecondTime);
    }

    public CustomizedConcurrentMapCache(String name, boolean allowNullValues, long expirationSecondTime, long preloadSecondTime) {
        this(name, new ConcurrentHashMap<>(256), allowNullValues, null, expirationSecondTime, preloadSecondTime);
    }

    public CustomizedConcurrentMapCache(String name, ConcurrentMap<Object, Object> store, boolean allowNullValues, long expirationSecondTime, long preloadSecondTime) {
        this(name, store, allowNullValues, null, expirationSecondTime, preloadSecondTime);
    }

    protected CustomizedConcurrentMapCache(String name, ConcurrentMap<Object, Object> store, boolean allowNullValues, SerializationDelegate serialization, long expirationSecondTime, long preloadSecondTime) {
        super(name, store, allowNullValues, serialization);
        this.expirationSecondTime = expirationSecondTime;
        this.preloadSecondTime = preloadSecondTime;
    }

    private static final Logger logger = LoggerFactory.getLogger(CustomizedConcurrentMapCache.class);


    @Override
    public ValueWrapper get(final Object key) {
        // 调用重写后的get方法
        Object value = getNativeCache().get(key);
        Long createTime = cacheCreateTime.get(key);
        if (createTime != null && System.currentTimeMillis() - createTime > expirationSecondTime * TIME_CONVERNT_INTERVAL) {
            value = null;
        }
        ValueWrapper valueWrapper = ReflectUtil.invoke(this, SUPER_METHOD_TOVALUEWRAPPER, value);

        if (valueWrapper != null) {
            // 刷新缓存数据
            refreshCache(key);
        }
        return valueWrapper;
    }

    @Override
    public void put(Object key, @Nullable Object value) {
        getNativeCache().put(key, toStoreValue(value));
        cacheCreateTime.put(key, System.currentTimeMillis());
    }

    /**
     * 刷新缓存数据
     */
    private void refreshCache(Object key) {
        Long createTime = cacheCreateTime.get(key);
        Long ttl = System.currentTimeMillis() - createTime;
        if (null != ttl && ttl > preloadSecondTime * TIME_CONVERNT_INTERVAL) {
            // 尽量少的去开启线程，因为线程池是有限的
            ThreadUtil.execute(() -> {
                // 加一个分布式锁，只放一个请求去刷新缓存
                Lock globalLock = SingleInstance.INSTANCE.getLockInstance();

                try {
                    globalLock.lock();
                    // 获取锁之后再判断一下过期时间，看是否需要加载数据
                    Long ttl2 = System.currentTimeMillis() - createTime;
                    if (null != ttl2 && ttl2 > preloadSecondTime * TIME_CONVERNT_INTERVAL) {
                        // 通过获取代理方法信息重新加载缓存数据
                        logger.info("开始刷新 ==name:" + CustomizedConcurrentMapCache.super.getName() + "====key:" + (String) key);
                        getCacheSupport().refreshCacheByKey(CustomizedConcurrentMapCache.super.getName(), (String) key);
                    }
                } catch (Exception e) {
                    logger.info(e.getMessage(), e);
                } finally {
                    globalLock.unlock();
                }
            });
        }
    }

    public long getExpirationSecondTime() {
        return expirationSecondTime;
    }
}

