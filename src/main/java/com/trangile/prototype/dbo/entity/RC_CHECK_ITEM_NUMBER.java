package com.trangile.prototype.dbo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "rc_check_item_number")
public class RC_CHECK_ITEM_NUMBER {
	
	@Id
	private Long id;
	
	private String ItemNo;

	public Long getId() {
		return id;
	}

	public String getItemNo() {
		return ItemNo;
	}
	
}
