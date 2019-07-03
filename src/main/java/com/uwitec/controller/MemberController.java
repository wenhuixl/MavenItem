package com.uwitec.controller;

import com.uwitec.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Value("${name}")
    private String name;

    @Value("${http_url}")
    private String httpUrl;

    @RequestMapping("/getMember")
    public Map<String, Object> getMember() {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("errorcode", 200);
        hashMap.put("errorMsg", "ok");
        return hashMap;
    }

    @RequestMapping("/addMemberAndEmail")
    public String addMemberAndEmail() {
        log.info("1");
        String result = memberService.addMemberAndEmail();
        log.info("4");
        return "result: "+result;
    }

    @RequestMapping("/getName")
    public String getName() {
        return name;
    }

    @RequestMapping("/getHttpUrl")
    public String getHttpUrl(){
        return httpUrl;
    }

}
