package com.uwitec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenhui
 * @description 全局捕获异常案例
 * @Date 2019/6/23
 */
@RestController
public class ErrorController {

    @RequestMapping("/getUser")
    public String getUser(int i) {
        int j = 1 / i;
        return "success: " + j;
    }

}
