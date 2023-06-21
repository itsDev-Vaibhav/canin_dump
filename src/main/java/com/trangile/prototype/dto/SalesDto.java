package com.trangile.prototype.dto;

import java.time.LocalDateTime;

public class SalesDto {
		
	private LocalDateTime CreationDate;
	private String ItemNo;
	private String Description;
	private Double QtytoShipBase;
	private String LotNo;
	private LocalDateTime ExpirationDate;
	private String TNOPAL;
	private String ManufacturingLotNo;
	private LocalDateTime ManufacturingDate;
	private String LocationCode;
	private String RDD;
	private String QualityStatus;
	private String SourceSubType;
	private String DocumentNo;
	private String SelltoCustomerNo;
	private String SelltoCustomerName;
	
	public SalesDto() {
		// TODO Auto-generated constructor stub
	}

	public SalesDto(LocalDateTime creationDate, String itemNo, String description, Double qtytoShipBase, String lotNo,
			LocalDateTime expirationDate, String tNOPAL, String manufacturingLotNo, LocalDateTime manufacturingDate,
			String locationCode, String rDD, String qualityStatus, String sourceSubType, String documentNo,
			String selltoCustomerNo, String selltoCustomerName) {
		CreationDate = creationDate;
		ItemNo = itemNo;
		Description = description;
		QtytoShipBase = qtytoShipBase;
		LotNo = lotNo;
		ExpirationDate = expirationDate;
		TNOPAL = tNOPAL;
		ManufacturingLotNo = manufacturingLotNo;
		ManufacturingDate = manufacturingDate;
		LocationCode = locationCode;
		RDD = rDD;
		QualityStatus = qualityStatus;
		SourceSubType = sourceSubType;
		DocumentNo = documentNo;
		SelltoCustomerNo = selltoCustomerNo;
		SelltoCustomerName = selltoCustomerName;
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

	public Double getQtytoShipBase() {
		return QtytoShipBase;
	}

	public void setQtytoShipBase(Double qtytoShipBase) {
		QtytoShipBase = qtytoShipBase;
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

	public String getRDD() {
		return RDD;
	}

	public void setRDD(String rDD) {
		RDD = rDD;
	}

	public String getQualityStatus() {
		return QualityStatus;
	}

	public void setQualityStatus(String qualityStatus) {
		QualityStatus = qualityStatus;
	}

	public String getSourceSubType() {
		return SourceSubType;
	}

	public void setSourceSubType(String sourceSubType) {
		SourceSubType = sourceSubType;
	}

	public String getDocumentNo() {
		return DocumentNo;
	}

	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}

	public String getSelltoCustomerNo() {
		return SelltoCustomerNo;
	}

	public void setSelltoCustomerNo(String selltoCustomerNo) {
		SelltoCustomerNo = selltoCustomerNo;
	}

	public String getSelltoCustomerName() {
		return SelltoCustomerName;
	}

	public void setSelltoCustomerName(String selltoCustomerName) {
		SelltoCustomerName = selltoCustomerName;
	}

	@Override
	public String toString() {
		return "SalesDto [CreationDate=" + CreationDate + ", ItemNo=" + ItemNo + ", Description=" + Description
				+ ", QtytoShipBase=" + QtytoShipBase + ", LotNo=" + LotNo + ", ExpirationDate=" + ExpirationDate
				+ ", TNOPAL=" + TNOPAL + ", ManufacturingLotNo=" + ManufacturingLotNo + ", ManufacturingDate="
				+ ManufacturingDate + ", LocationCode=" + LocationCode + ", RDD=" + RDD + ", QualityStatus="
				+ QualityStatus + ", SourceSubType=" + SourceSubType + ", DocumentNo=" + DocumentNo
				+ ", SelltoCustomerNo=" + SelltoCustomerNo + ", SelltoCustomerName=" + SelltoCustomerName + "]";
	}
}
