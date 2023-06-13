package com.trangile.prototype.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trangile.prototype.db.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}