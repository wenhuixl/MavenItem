package com.uwitec.controller;

import com.uwitec.service.UserService;
import com.uwitec.test01.service.UserServiceTest01;
import com.uwitec.test02.service.UserServiceTest02;
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

    @Autowired
    private UserServiceTest01 userServiceTest01;

    @Autowired
    private UserServiceTest02 userServiceTest02;

    @RequestMapping("/insertUser")
    public Integer insertUser(String name, Integer age) {
        return userService.insert(name, age);
    }


    @RequestMapping("/insertUserTest1")
    public Integer insertUserTest1(String name, Integer age) {
        return userServiceTest01.insert(name, age);
    }

    @RequestMapping("/insertUserTest2")
    public Integer insertUserTest2(String name, Integer age) {
        return userServiceTest02.insert(name, age);
    }

}
