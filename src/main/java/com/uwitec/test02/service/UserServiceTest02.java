package com.uwitec.test02.service;

import com.uwitec.test02.mapper.UserMapperTest02;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wenhui
 * @description
 * @Date 2019/7/6
 */

@Service
@Slf4j
public class UserServiceTest02 {

    @Autowired
    private UserMapperTest02 userMapper;

    @Transactional(transactionManager = "test2TransactionManager") // 事务, 对应DataSourceConfig2
    public int insert(String name, Integer age) {
        int result = userMapper.insert(name, age);
        int i = 1 / age; // age=0时抛出异常，验证事务是否开启
        log.info("=====result: ====="+result);
        return result;
    }

}
