package com.trangile.prototype.security.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RCI_INDEX_VIEW_TBL")
public class IndexView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String userFrom;
	
	private String viewBase;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserFrom() {
		return userFrom;
	}
	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}
	public String getViewBase() {
		return viewBase;
	}
	public void setViewBase(String viewBase) {
		this.viewBase = viewBase;
	}
	
	@Override
	public String toString() {
		return "IndexView [id=" + id + ", userFrom=" + userFrom + ", viewBase=" + viewBase + "]";
	}

}