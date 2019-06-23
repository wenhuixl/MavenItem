package com.uwitec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MemberController {

    @RequestMapping("/getMember")
    public Map<String, Object> getMember() {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("errorcode", 200);
        hashMap.put("errorMsg", "ok");
        return hashMap;
    }

}
