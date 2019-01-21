package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigateController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/env")
    public String env(){
        return "env";
    }

    @RequestMapping("/case")
    public String testCase(){
        return "case";
    }

    @RequestMapping("/doc")
    public String document(){
        return "doc";
    }
}
