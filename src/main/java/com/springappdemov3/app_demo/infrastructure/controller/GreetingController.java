package com.springappdemov3.app_demo.infrastructure.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return "hello, " + name + "!";
    }
}
