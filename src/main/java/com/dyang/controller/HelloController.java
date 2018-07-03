package com.dyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/login.html")
    private ModelAndView login(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    @RequestMapping("/login.do")
    private String index(){
        ModelAndView view = new ModelAndView("login.html");
        return "hello,you!";
    }
}
