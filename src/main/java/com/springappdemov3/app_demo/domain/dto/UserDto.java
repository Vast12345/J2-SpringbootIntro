package com.springappdemov3.app_demo.domain.dto;

import com.springappdemov3.app_demo.domain.entity.User;

public class UserDto {
    private String title;
    private User user;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    };

}
