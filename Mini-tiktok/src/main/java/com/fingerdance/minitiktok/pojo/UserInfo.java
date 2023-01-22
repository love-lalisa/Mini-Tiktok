package com.fingerdance.minitiktok.pojo;

import lombok.Data;

@Data
public class UserInfo {
    /**
     * 关注总数
     */
    private long followCount;
    /**
     * 粉丝总数
     */
    private long followerCount;
    /**
     * 用户id
     */
    private long id;
    /**
     * true-已关注，false-未关注
     */
    private boolean isFollow;
    /**
     * 用户名称
     */
    private String name;
}
