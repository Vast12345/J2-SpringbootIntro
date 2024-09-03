package com.springappdemov3.app_demo.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {
    
    @GetMapping({"","/","/home"})
    public String home() {
        return "redirect:/list";
    }
}   
