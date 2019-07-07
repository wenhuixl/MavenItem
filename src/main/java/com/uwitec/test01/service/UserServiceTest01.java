package com.uwitec.test01.service;

import com.uwitec.test01.mapper.UserMapperTest01;
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
public class UserServiceTest01 {

    @Autowired
    private UserMapperTest01 userMapper;

    @Transactional(transactionManager = "test1TransactionManager") // 事务, 对应DataSourceConfig1
    public int insert(String name, Integer age) {
        int result = userMapper.insert(name, age);
        int i = 1 / age; // age=0时抛出异常，验证事务是否开启
        log.info("=====result: ====="+result);
        return result;
    }

}
