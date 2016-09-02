package com.weichaishi.utils;


import org.apache.http.HttpStatus;

public class JsonResponseResult<T> {

    /**
     * ����״̬��Ϣ��Ĭ��200
     */
    private Integer status = HttpStatus.SC_OK;

    /**
     * ���ش�����ʾ��Ϣ��Ĭ��Ϊnull
     */
    private String errorMsg = "";

    /**
     * ״̬�룬
     * T ����ɹ�
     * F ����ʧ��
     */
    private  String code = "T";

    /**
     * ��������
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
