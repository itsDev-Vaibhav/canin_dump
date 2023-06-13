package com.trangile.prototype.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trangile.prototype.db.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}