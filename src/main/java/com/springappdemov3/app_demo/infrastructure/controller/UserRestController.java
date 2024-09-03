package com.springappdemov3.app_demo.infrastructure.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springappdemov3.app_demo.domain.dto.UserDto;
import com.springappdemov3.app_demo.domain.entity.User;

@RestController
@RequestMapping("/api/demo")
public class UserRestController {
    @Autowired
    private Environment env;

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("${app.listwords}")
    private String[] listWords;

    @Value("#{'${app.listroles}'.split(',')}")
    private List<String> listRoles;

    @Value("${app.message}")
    private String message;

    @Value("#{${app.inventory}}")
    private Map<String, Object> inventory;

    @Value("#{T(java.lang.Integer).parseInt(${app.inventory}['price']) * T(java.lang.Integer).parseInt(${app.inventory})}")

    @GetMapping("/valores")
    public Map<String, Object> valores() {
        Map<String, Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version", version);
        json.put("listwords", listWords);
        json.put("listroles", listRoles);
        json.put("message", message);
        json.put("mensajev2", env.getProperty("app.message"));
        json.put("inventory", inventory);
        return json;
    }

    @GetMapping("/user/details")
    public UserDto details() {
        UserDto newUser = new UserDto();
        User user = new User("Lorenzo", "Lopez");
        newUser.setTitle("Desarrollador FullStack");
        newUser.setUser(user);
        return newUser;
    }
}
