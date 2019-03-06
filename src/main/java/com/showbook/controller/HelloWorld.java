package com.showbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjie
 * @date 2019/3/6 0006 - 17:00
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String test(){
        System.out.println("111");
        return "hello";
    }
}
