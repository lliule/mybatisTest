package com.weichaishi.utils;


import org.apache.http.HttpStatus;

public class JsonResponseResult<T> {

    /**
     * 返回状态信息，默认200
     */
    private Integer status = HttpStatus.SC_OK;

    /**
     * 返回错误提示信息，默认为null
     */
    private String errorMsg = "";

    /**
     * 状态码，
     * T 请求成功
     * F 请求失败
     */
    private  String code = "T";

    /**
     * 返回数据
     */
    private  T data;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
