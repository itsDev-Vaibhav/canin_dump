package com.trangile.prototype.dto;

import java.util.Objects;

public class SearchForm {
	
	private String sku;
	private String batchNo;
	private String sscNo;
	
	public SearchForm() {
		
	}
	
	
	public SearchForm(String sku, String batchNo, String sscNo) {
		this.sku = sku;
		this.batchNo = batchNo;
		this.sscNo = sscNo;
	}


	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getSscNo() {
		return sscNo;
	}
	public void setSscNo(String sscNo) {
		this.sscNo = sscNo;
	}


	@Override
	public String toString() {
		return "SearchForm [sku=" + sku + ", batchNo=" + batchNo + ", sscNo=" + sscNo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(batchNo, sku, sscNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchForm other = (SearchForm) obj;
		return Objects.equals(batchNo, other.batchNo) && Objects.equals(sku, other.sku)
				&& Objects.equals(sscNo, other.sscNo);
	}	
}
