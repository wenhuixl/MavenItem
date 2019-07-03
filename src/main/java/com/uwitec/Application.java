package com.uwitec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 功能描述 @SpringBootApplication 等同于  @EnableAutoConfiguration @ComponentScan("uwitec.controller")
 * @author wenhui
 * @date 2019/6/23
 */
@SpringBootApplication
@EnableAsync // 开启异步调用
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
