package com.weichaishi.utils;


import org.apache.http.HttpStatus;

public class JsonResponseResult<T> {

    /**
     * 操作状态：默认为200
     */
    private Integer status = HttpStatus.SC_OK;

    /**
     *错误信息： 默认“” ；
     */
    private String errorMsg = "";

    /**
     *状态码
     * T 操作成功
     * F 操作失败
     */
    private  String code = "T";

    /**
     *结果信息
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
