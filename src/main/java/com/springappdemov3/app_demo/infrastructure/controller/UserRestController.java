package com.springappdemov3.app_demo.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springappdemov3.app_demo.domain.dto.UserDto;
import com.springappdemov3.app_demo.domain.entity.User;

@RestController
@RequestMapping("/api/demo")
public class UserRestController {
    @GetMapping("/user/details")
    public UserDto details() {
        UserDto newUser = new UserDto();
        User user = new User("Lorenzo", "Lopez");
        newUser.setTitle("Desarrollador FullStack");
        newUser.setUser(user);
        return newUser;
    }
}
