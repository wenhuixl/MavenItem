package com.uwitec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexClntroller {

    @RequestMapping("/hi")
    public String sayHi() {
        return "hi";
    }

}
