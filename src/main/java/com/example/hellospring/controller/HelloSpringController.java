package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpringController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "HelloSpringController: Hello World!";
    }

}
