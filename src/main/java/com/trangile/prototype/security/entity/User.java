package com.trangile.prototype.security.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "users")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String username;

    private String password;
    
    private String userFrom;


    @Transient
    private String passwordConfirm;
    

    @ManyToMany
    @JoinTable(
    		  name = "user_roles", 
    		  joinColumns = @JoinColumn(name = "users_id"), 
    		  inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private Set<Role> roles;


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserFrom() {
		return userFrom;
	}


	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	


	public String getPasswordConfirm() {
		return passwordConfirm;
	}


	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", userFrom=" + userFrom
				+ ", roles=" + roles + "]";
	}

}