package com.siyuyong;

import cn.hutool.core.lang.Dict;
import com.alibaba.fastjson.JSON;
import com.siyuyong.util.MyUtils;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
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

        Dict dict = Dict.create().set("11", "22").set("22", "22");
        Map map = dict;
        System.out.println(JSON.toJSON(dict));
    }

    private static final String modulus = "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7",
            nonce = "0CoJUm6Qyw8W8jud",
            pubKey = "010001";
    private static final String AES_CBC_PADDING = "AES/CBC/PKCS5Padding";
    private static final Charset charset = Charset.forName("UTF-8");

//    public static String aesEncrypt(String text, String secKey) {
//        String modulus = "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b72" +
//                "5152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbd" +
//                "a92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe48" +
//                "75d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7";
//        String nonce = "0CoJUm6Qyw8W8jud";
//        String pubKey = "010001";
//
//        try {
//            Cipher cipher = Cipher.getInstance(AES_CBC_PADDING);
//            SecretKeySpec key = new SecretKeySpec(secKey.getBytes(charset), "AES");
//            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec("0102030405060708".getBytes(charset)));
//            byte[] data = cipher.doFinal(text.getBytes(charset));
//            String result = Base64.encode(data);
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }

    public static byte[] addBytes(byte[] data1, byte[] data2) {
        byte[] data3 = new byte[data1.length + data2.length];
        System.arraycopy(data1, 0, data3, 0, data1.length);
        System.arraycopy(data2, 0, data3, data1.length, data2.length);
        return data3;
    }

    private String createSecretKey(int i) {
        String randomString = MyUtils.getRandomString(16);
        StringBuffer sb = new StringBuffer();
        for (char a : randomString.toCharArray()) {
            sb.append(Integer.toHexString((int) a));
        }
        return sb.substring(0, 16);
    }

    public static String aesEncrypt(String src, String key, String iv) {
        try {
            String encodingFormat = "UTF-8";
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] raw = key.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
            // 使用CBC模式，需要一个向量vi，增加加密算法强度
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] encrypted = cipher.doFinal(src.getBytes(encodingFormat));
            return new BASE64Encoder().encode(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String rsaEncrypt(String text, String pubKey, String modulus) {
        text = new StringBuilder(text).reverse().toString();
        BigInteger integer = new BigInteger(text.getBytes());
        BigInteger pubkeyInt = new BigInteger(pubKey, 16);
        BigInteger modulusInt = new BigInteger(modulus, 16);
        String result = integer.pow(pubkeyInt.intValue()).mod(modulusInt).toString(16);
        while (result.length() < 256)
            result = "0" + result;
        return result;
    }
}