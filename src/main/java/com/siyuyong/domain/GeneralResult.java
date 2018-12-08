package com.siyuyong.domain;

/**
 * @ClassName GeneralResult
 * @Description TODO
 * @Author zhu.yong
 * @Date 2018/12/5 23:37
 * @Version 1.0
 */
public class GeneralResult {
    private String message;
    private int code;
    private String data;

    public static GeneralResult createInstance(String message){
        return new GeneralResult(message);
    }
    private GeneralResult(String message) {
        this(message, 200, null);
    }

    private GeneralResult(String message, int code, String data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

