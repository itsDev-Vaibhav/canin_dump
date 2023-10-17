package com.trangile.prototype.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trangile.prototype.security.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByRoleName(String roleName);
	
	@Query(value = "SELECT * FROM roles r WHERE r.roleName like :userFrom%", nativeQuery = true)
	List<Role> findRoleByUserFrom(@Param("userFrom") String userFrom);
	
}