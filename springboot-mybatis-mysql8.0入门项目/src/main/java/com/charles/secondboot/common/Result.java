package com.charles.secondboot.common;

public class Result<T>{
    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体的内容*/
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {

    }

    public Result(T data) {
        this.data = data;
    }

    public Result(T data, String msg, Integer code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public Result makeSuccessResult(T data) {
        return new Result(data, "success", 0);
    }

    public Result makeFailResult(T data) {
        return new Result(data, "failed", -1);
    }
}