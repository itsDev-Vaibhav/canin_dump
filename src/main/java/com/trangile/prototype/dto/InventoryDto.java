package com.trangile.prototype.dto;

import java.time.LocalDateTime;

public class InventoryDto {
	
	private LocalDateTime CreationDate;
	private String ItemNo;
	private String Description;
	private Double Quantity;
	private String LotNo;
	private LocalDateTime ExpirationDate;
	private String TNOPAL;
	private String ManufacturingLotNo;
	private LocalDateTime ManufacturingDate;
	private String LocationCode;
	private String QualityStatus;
	private String ReasonCode;
	private String DocumentNo;
	private String WHSEID;
	
	public InventoryDto() {
		
	}

	public InventoryDto(LocalDateTime creationDate, String itemNo, String description, Double quantity, String lotNo,
			LocalDateTime expirationDate, String tNOPAL, String manufacturingLotNo, LocalDateTime manufacturingDate,
			String locationCode, String qualityStatus, String reasonCode, String documentNo, String wHSEID) {
		CreationDate = creationDate;
		ItemNo = itemNo;
		Description = description;
		Quantity = quantity;
		LotNo = lotNo;
		ExpirationDate = expirationDate;
		TNOPAL = tNOPAL;
		ManufacturingLotNo = manufacturingLotNo;
		ManufacturingDate = manufacturingDate;
		LocationCode = locationCode;
		QualityStatus = qualityStatus;
		ReasonCode = reasonCode;
		DocumentNo = documentNo;
		WHSEID = wHSEID;
	}

	public LocalDateTime getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		CreationDate = creationDate;
	}

	public String getItemNo() {
		return ItemNo;
	}

	public void setItemNo(String itemNo) {
		ItemNo = itemNo;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Double getQuantity() {
		return Quantity;
	}

	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}

	public String getLotNo() {
		return LotNo;
	}

	public void setLotNo(String lotNo) {
		LotNo = lotNo;
	}

	public LocalDateTime getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getTNOPAL() {
		return TNOPAL;
	}

	public void setTNOPAL(String tNOPAL) {
		TNOPAL = tNOPAL;
	}

	public String getManufacturingLotNo() {
		return ManufacturingLotNo;
	}

	public void setManufacturingLotNo(String manufacturingLotNo) {
		ManufacturingLotNo = manufacturingLotNo;
	}

	public LocalDateTime getManufacturingDate() {
		return ManufacturingDate;
	}

	public void setManufacturingDate(LocalDateTime manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}

	public String getLocationCode() {
		return LocationCode;
	}

	public void setLocationCode(String locationCode) {
		LocationCode = locationCode;
	}

	public String getQualityStatus() {
		return QualityStatus;
	}

	public void setQualityStatus(String qualityStatus) {
		QualityStatus = qualityStatus;
	}

	public String getReasonCode() {
		return ReasonCode;
	}

	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}

	public String getDocumentNo() {
		return DocumentNo;
	}

	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}

	public String getWHSEID() {
		return WHSEID;
	}

	public void setWHSEID(String wHSEID) {
		WHSEID = wHSEID;
	}
}
