package com.learn.controller.viewmodel;

/**
 * Created by Erin on 6/4/16.
 */
public class ResponseJson {

    private String msg;

    /**
     * 1代表正确,-1代表错误
     */
    private int statusCode;

    /**
     * put any data
     */
    private Object data;

    public static ResponseJson ok(String msg){
        return new ResponseJson();
    }
}
