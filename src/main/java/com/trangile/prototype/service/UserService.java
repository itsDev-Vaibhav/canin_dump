package com.trangile.prototype.service;

import com.trangile.prototype.db.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}