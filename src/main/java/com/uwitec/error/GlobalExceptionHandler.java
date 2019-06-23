package com.uwitec.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wenhui
 * @description 全局捕获异常
 * 1.捕获返回json格式
 * 2.捕获返回页面
 * @Date 2019/6/23
 */
@ControllerAdvice(basePackages = "com.uwitec.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> errorResult() {
        Map<String, Object> errorResultMap = new HashMap<String, Object>();
        errorResultMap.put("errorCode", "500");
        errorResultMap.put("errorMsg", "系统错误");
        return errorResultMap;
    }

}
