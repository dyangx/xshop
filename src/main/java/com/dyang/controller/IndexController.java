package com.dyang.controller;

import com.dyang.model.MenuVO;
import com.dyang.service.IndexService;
import com.dyang.util.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * Created by DYang on 2018/9/6
 */
@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/index.html")
    public String index(Model model) throws InterruptedException, ExecutionException, TimeoutException {
        List<MenuVO> list = indexService.getMenuThread();
        System.out.println(list);
        model.addAttribute("menus",list);
        return "index.html";
    }

    @RequestMapping("/index/getMenu.json")
    @ResponseBody
    public ReturnData getMenu() throws InterruptedException, ExecutionException, TimeoutException {
        List<MenuVO> list = indexService.getMenuThread();
        return ReturnData.success().setData(list);
    }
}
