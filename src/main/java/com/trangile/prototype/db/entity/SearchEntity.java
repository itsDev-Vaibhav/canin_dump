package com.trangile.prototype.db.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SearchEntity {
	
	@Id
	private Integer id;
	private String sku;
	private String batchNo;
	private String sscNo;
}
