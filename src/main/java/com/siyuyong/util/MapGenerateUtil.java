package com.siyuyong.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapGenerateUtil {
    private MapGenerateUtil() {
    }

    public static <K, V> Map<K, V> createMap(K[] keyList, V[] valueList) {
        return createMap(keyList, valueList, HashMap.class);
    }


    public static <K, V> Map<K, V> createMap(K[] keyList, V[] valueList,Class<? extends Map> clazz) {
        Map<K, V> map = null;
        try {
            map = (Map<K, V>) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        for (int i = 0, len = keyList.length; i < len; i++) {
            if (i < valueList.length) {
                map.put(keyList[i], valueList[i]);
            } else {
                map.put(keyList[i], null);
            }
        }
        return map;
    }
}
