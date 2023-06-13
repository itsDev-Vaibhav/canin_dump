package com.trangile.prototype.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trangile.prototype.security.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}