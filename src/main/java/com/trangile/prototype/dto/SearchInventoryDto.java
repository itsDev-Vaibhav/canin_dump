package com.trangile.prototype.dto;

import java.util.Objects;

public class SearchInventoryDto {
	
	private String owner;
	
	

	public SearchInventoryDto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public SearchInventoryDto(String owner) {
		this.owner = owner;
	}



	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}



	@Override
	public int hashCode() {
		return Objects.hash(owner);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchInventoryDto other = (SearchInventoryDto) obj;
		return Objects.equals(owner, other.owner);
	}



	@Override
	public String toString() {
		return "SearchInventoryDto [owner=" + owner + "]";
	}
}
