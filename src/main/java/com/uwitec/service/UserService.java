package com.uwitec.service;

import com.uwitec.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wenhui
 * @description
 * @Date 2019/7/6
 */

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(String name, Integer age) {
        int result = userMapper.insert(name, age);
        log.info("=====result: ====="+result);
        return result;
    }

}
