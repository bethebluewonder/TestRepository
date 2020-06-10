package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld2Controller {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}