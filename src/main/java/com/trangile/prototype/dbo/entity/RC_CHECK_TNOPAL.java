package com.trangile.prototype.dbo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "rc_check_tnopal_number")
public class RC_CHECK_TNOPAL {
	
	@Id
	private Long id;
	
	private String TNOPAL;

	public Long getId() {
		return id;
	}

	public String getTNOPAL() {
		return TNOPAL;
	}

}
