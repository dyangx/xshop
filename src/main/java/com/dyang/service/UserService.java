package com.dyang.service;

import com.dyang.model.User;

/**
 * Created by DYang on 2018/7/4
 */
public interface UserService {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User getUserByName(String username);
}
