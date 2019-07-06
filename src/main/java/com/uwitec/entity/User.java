package com.uwitec.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wenhui
 * @description
 * @Date 2019/7/1
 */
@Slf4j
@Data // 相当于 @Getter @Setter
public class User {

    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
