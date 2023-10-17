package com.trangile.prototype.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.trangile.prototype.security.entity.IndexView;
import com.trangile.prototype.security.entity.User;
import com.trangile.prototype.security.repository.IndexViewRepository;
import com.trangile.prototype.security.repository.UserRepository;

@Component
public class UserSecurityService {
	
	@Autowired
	private UserRepository uRepo;
	
	
	@Autowired
	private IndexViewRepository viewRepository; 
	
	public String getViewByUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name2 = authentication.getName();
		User findByUsername = uRepo.findByUsername(name2);
		IndexView findViewByUser = viewRepository.findByUserFrom(findByUsername.getUserFrom());
		return findViewByUser.getViewBase();
	}
}