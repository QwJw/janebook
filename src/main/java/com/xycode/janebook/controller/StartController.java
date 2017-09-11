package com.xycode.janebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("helo");
        return "index";
    }


    @RequestMapping("/editor")
    public String hello(){
        return "editor";
    }


}
