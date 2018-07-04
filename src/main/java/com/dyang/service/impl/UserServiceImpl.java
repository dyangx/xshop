package com.dyang.service.impl;

import com.dyang.model.User;
import com.dyang.respository.UseRrespository;
import com.dyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DYang on 2018/7/4
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UseRrespository useRrespository;

    @Override
    public User getUserByName(String username) {

        return useRrespository.getUserByName(username);
    }
}
