package com.springappdemov3.app_demo.infrastructure.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
            new User("Carlos", "Perez"),
            new User("Martha","Sanchez"),
            new User("Vicente","Camargo")
        );
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "list";
        }
}
