package com.dyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DYang on 2018/9/6
 */
@Controller
public class IndexController {

    @RequestMapping("/index.html")
    public String index(){
        return "index.html";
    }
}
