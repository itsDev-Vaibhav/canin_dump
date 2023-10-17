package com.trangile.prototype.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trangile.prototype.security.entity.IndexView;

public interface IndexViewRepository extends JpaRepository<IndexView, Integer> {
	
	
	IndexView findByUserFrom(String user);
}
