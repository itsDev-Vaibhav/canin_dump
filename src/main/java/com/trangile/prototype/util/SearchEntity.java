package com.trangile.prototype.util;

public class SearchEntity {
	private String sku;
	private String batchNo;
	private String sscNo;

	public SearchEntity() {

	}

	public SearchEntity(String sku, String batchNo, String sscNo) {
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
		return "SearchEntity [sku=" + sku + ", batchNo=" + batchNo + ", sscNo=" + sscNo + "]";
	}
}
