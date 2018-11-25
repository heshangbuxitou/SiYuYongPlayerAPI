package com.siyuyong.cache;

import com.siyuyong.util.KeyLock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SingleInstance
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/11/22 21:48
 * @Version 1.0
 */
public enum SingleInstance {
    INSTANCE;
    private Lock instance;
    private KeyLock<String> keyLock;
    private Map<String, CachedMethodInvocation> cachedMethodInvocationMap;
    SingleInstance() {
        instance = new ReentrantLock();
        keyLock = new KeyLock<>();
        cachedMethodInvocationMap = new ConcurrentHashMap<>();
    }
    public Lock getLockInstance() {
        return instance;
    }

    public KeyLock getKeyInstance() {
        return keyLock;
    }

    public Map<String, CachedMethodInvocation> getCachedMethodInvocationMap(){
        return cachedMethodInvocationMap;
    }

}

