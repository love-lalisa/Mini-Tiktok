package com.fingerdance.minitiktok.pojo;

@lombok.Data
public class Response {
    /**
     * 状态码，0-成功，其他值-失败
     */
    private long statusCode;
    /**
     * 返回状态描述
     */
    private String statusMsg;
    /**
     * 用户鉴权token
     */
    private String token;
    /**
     * 用户id
     */
    private long userid;
}