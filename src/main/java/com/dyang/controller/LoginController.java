package com.dyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DYang on 2018/7/4
 */
@Controller
@RequestMapping("/sso")
public class LoginController {

    @RequestMapping("/login.html")
    public String init(){
        return "login.html";
    }
}
