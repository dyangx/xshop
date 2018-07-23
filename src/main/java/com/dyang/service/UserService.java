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
    User getUserByName(String username);

    /**
     * 登陆方法
     * @param username
     * @param password
     * @param remenberme
     */
    void login(String username, String password, boolean remenberme);
}
