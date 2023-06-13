package com.trangile.prototype.service;

import com.trangile.prototype.security.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}