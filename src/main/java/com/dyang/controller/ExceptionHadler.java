package com.dyang.controller;

import com.dyang.util.MyException;
import com.dyang.util.ReturnData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by DYang on 2018/9/7
 */
@RestControllerAdvice
public class ExceptionHadler {

    @ExceptionHandler(value = Exception.class)
    public ReturnData errorHandler(Exception e){
        return ReturnData.error("系统异常");
    }

    @ExceptionHandler(value = MyException.class)
    public ReturnData myErrorHandler(MyException e){
        return ReturnData.error(e.getMessage());
    }
}
