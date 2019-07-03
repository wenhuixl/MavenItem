package com.uwitec.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author wenhui
 * @description
 * @Date 2019/7/3
 */
@Service
@Slf4j
public class MemberService {

    @Async // 异步调用
    public String addMemberAndEmail () {
        log.info("2");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("3");
        return "ok";
    }

}
