package com.uwitec.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wenhui
 * @description
 * @Date 2019/7/1
 */
@Slf4j
@Getter
@Setter
public class User {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("zhangsan");
        user.setAge(23);
        log.info(user.toString());
    }

}
