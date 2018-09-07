package com.dyang.service;

import com.dyang.model.User;
import org.apache.shiro.authc.UsernamePasswordToken;

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
     * @param usernamePasswordToken
     */
    void login(UsernamePasswordToken usernamePasswordToken);

    void saveUser(User user);
}
