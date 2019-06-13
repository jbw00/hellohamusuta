package com.hamusuta.hellohamusuta.vo.responseVo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * <pre>REST API 响应请求结果信息实体封装类，主要返回请求状态代码、请求状态说明、请求响应数据等信息。</pre>
 *
 * @author Floki
 */
public class ResponseResult<T> implements Serializable {
    /**
     * 请求状态代码
     */
    private Integer code;

    /**
     * 请求状态说明
     */
    private String message;

    /**
     * 请求响应数据
     */
    private T data;


    /**
     * 设置请求响应状态
     *
     * @param status 响应状态
     * @return
     */
    public ResponseResult setStatus(Status status) {
        this.code = status.getCode();
        this.message = status.getMessage();
        return this;
    }

    /**
     * 设置请求响应数据
     *
     * @param data 请求响应数据
     * @return
     */
    public ResponseResult setData(T data) {
        this.data = data;
        return this;
    }

    /**
     * 错误请求响应数据
     *
     * @param code 请求错误码
     * @param message 请求错误信息
     * @param data 请求响应数据
     * @return
     */
    public ResponseResult error(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        return this;
    }

    /**
     * 获取请求状态代码
     *
     * @return 请求状态代码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 获取请求状态说明
     *
     * @return 请求状态说明
     */
    public String getMessage() {
        return message;
    }

    /**
     * 请求响应数据
     *
     * @return 请求响应数据
     */
    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
