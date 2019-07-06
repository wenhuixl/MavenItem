package com.uwitec.controller;

import com.uwitec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenhui
 * @description
 * @Date 2019/7/6
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public Integer insertUser(String name, Integer age) {
        return userService.insert(name, age);
    }

}
