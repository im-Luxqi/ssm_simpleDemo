package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class testControlelr {


    @RequestMapping("index2")
    public String goTwo() {

        return "index2";
    }
}
