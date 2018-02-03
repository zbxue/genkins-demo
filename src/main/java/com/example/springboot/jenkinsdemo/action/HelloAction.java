package com.example.springboot.jenkinsdemo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello/")
public class HelloAction {
    @RequestMapping("say")
    public String say() {
        return "hi xhz";
    }
}
