package com.example.bakeryShop.service;

import com.example.bakeryShop.entity.User;

public interface UserService {
    void save(User user);
    void login(String username, String password);
    User findByUsername(String username);
    User findByEmail(String email);
    User findById(long id);
}
