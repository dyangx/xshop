package com.dyang.util;

import javassist.SerialVersionUID;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by DYang on 2018/9/7
 */
public class ReturnData extends HashMap<String,Object> implements Serializable {

    private static final Integer CODE_SUCCESS = 100;

    private static final Integer CODE_ERROR = 999;

    private Integer code;

    private String msg;

    private Object data;

    public ReturnData(){}

    public ReturnData(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public static ReturnData success(String... msg){
        String message = null;
        if(msg != null && msg.length > 0){
            message = msg[0];
        }
        return new ReturnData(CODE_SUCCESS,message);
    }

    public static ReturnData error(String msg){
        return new ReturnData(CODE_ERROR,msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public ReturnData setData(Object data) {
        this.data = data;
        return this;
    }
}
