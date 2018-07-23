package com.dyang.controller;

import com.dyang.model.User;
import com.dyang.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 登陆注册
 * Created by DYang on 2018/7/4
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    UserService userService;

    @RequestMapping("/login.html")
    public String login(){
        return "login.html";
    }

    @RequestMapping("/register.html")
    public String register(){
        return "register.html";
    }

    /**
     * 登陆
     * @param username
     * @param password
     * @param vcode
     * @return
     */
    @RequestMapping("/dologin.json")
    @ResponseBody
    public Map<String,Object> dologin(@RequestParam String username, @RequestParam String password, String vcode){
        Map<String,Object> resMap = new HashMap<>();
        try {
            userService.login(username,password,true);
            resMap.put("code",100);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            resMap.put("code",999);
            resMap.put("msg",e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            resMap.put("code",999);
            resMap.put("msg","系统异常！");
        }
        return resMap;
    }

    /**
     * 判断用户是否存在
     * @param username
     * @return
     */
    @RequestMapping("/hasReistered.json")
    @ResponseBody
    public String hasRegistered(@RequestParam String username){
        User user = userService.getUserByName(username);
        if(user != null){
            return "Y";
        }
        return "N";
    }

    @RequestMapping("registe.json")
    public Map<String,Object> registe(){

        return null;
    }
}
