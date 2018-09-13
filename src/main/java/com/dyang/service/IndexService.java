package com.dyang.service;

import com.dyang.model.MenuVO;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * Created by DYang on 2018/9/12
 */
public interface IndexService {

    List<MenuVO> getMenuThread() throws InterruptedException, ExecutionException, TimeoutException;

    List<MenuVO> getMenu() throws InterruptedException;
}
