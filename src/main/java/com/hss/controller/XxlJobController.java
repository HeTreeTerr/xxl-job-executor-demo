package com.hss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XxlJobController {

    @RequestMapping(value = "/helloXxlJob")
    public String helloXxlJob(){
        return "hello,xxl-job";
    }
}
