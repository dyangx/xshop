package com.dyang.service.impl;

import com.dyang.model.User;
import com.dyang.respository.UserRepository;
import com.dyang.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by DYang on 2018/7/4
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository useRrespository;

    @Override
    public User getUserByName(String username) {
        return useRrespository.getUserByName(username);
    }

    @Override
    public void login(UsernamePasswordToken usernamePasswordToken) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        subject.login(usernamePasswordToken);
    }

    @Override
    public void saveUser(User user) {
        useRrespository.save(user);
    }
}
