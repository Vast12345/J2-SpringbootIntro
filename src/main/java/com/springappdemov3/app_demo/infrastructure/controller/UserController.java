package com.springappdemov3.app_demo.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springappdemov3.app_demo.domain.entity.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Lorenzo", "Lopez");
        model.addAttribute("titulo", "Profesional");
        model.addAttribute("user", user);
        return "details";
    }
}
