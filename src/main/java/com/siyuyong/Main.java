package com.siyuyong;

import cn.hutool.core.lang.Dict;
import com.alibaba.fastjson.JSON;
import com.siyuyong.util.MyUtils;
import org.apache.commons.lang3.StringUtils;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.lang.management.LockInfo;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public String mm = "ss";

    public static void main(String[] args) {
        String string = Stream.of("1", "2").collect(Collectors.joining(","));
        Stream.of(string).forEach(System.out::println);
        StringBuffer sb = new StringBuffer("456");
        String s = StringUtils.leftPad("22", 5, "0");
        System.out.println(s);
    }

    public static byte[] addBytes(byte[] data1, byte[] data2) {
        byte[] data3 = new byte[data1.length + data2.length];
        System.arraycopy(data1, 0, data3, 0, data1.length);
        System.arraycopy(data2, 0, data3, data1.length, data2.length);
        return data3;
    }

}