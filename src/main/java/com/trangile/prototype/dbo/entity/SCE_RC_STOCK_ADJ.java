package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_STOCK_ADJ_DATA", schema = "dbo")
public class SCE_RC_STOCK_ADJ {
	
	@Id
	private String MESSAGE_ID;
	private String WHSEID;
	private Double Line_No;
	private Double ItemNo;
	private LocalDateTime PostingDate;
	private LocalTime PostingTime;
	private Double EntryType;
	private Double DocumentNo;
	private String Description;
	private Long EDILocationCode;
	private String LocationCode;
	private String UnitofMeasureCode;
	private Long Quantity;
	private Long QuantityBase;
	private String ReasonCode;
	private Long EANCode;
	private String VLCode;
	private Long EntryNo;
	private String QtyperUnitofMeasure;
	private LocalDateTime ExpirationDate;
	private Long LotNo;
	private String QualityStatus;
	private String PHRStatus;
	private String RDD;
	private LocalDateTime ManufacturingDate;
	private String TNOPAL;
	
	public SCE_RC_STOCK_ADJ() {
		
	}

	public SCE_RC_STOCK_ADJ(String mESSAGE_ID, String wHSEID, Double line_No, Double itemNo, LocalDateTime postingDate,
			LocalTime postingTime, Double entryType, Double documentNo, String description, Long eDILocationCode,
			String locationCode, String unitofMeasureCode, Long quantity, Long quantityBase, String reasonCode,
			Long eANCode, String vLCode, Long entryNo, String qtyperUnitofMeasure, LocalDateTime expirationDate,
			Long lotNo, String qualityStatus, String pHRStatus, String rDD, LocalDateTime manufacturingDate,
			String tNOPAL) {
		super();
		MESSAGE_ID = mESSAGE_ID;
		WHSEID = wHSEID;
		Line_No = line_No;
		ItemNo = itemNo;
		PostingDate = postingDate;
		PostingTime = postingTime;
		EntryType = entryType;
		DocumentNo = documentNo;
		Description = description;
		EDILocationCode = eDILocationCode;
		LocationCode = locationCode;
		UnitofMeasureCode = unitofMeasureCode;
		Quantity = quantity;
		QuantityBase = quantityBase;
		ReasonCode = reasonCode;
		EANCode = eANCode;
		VLCode = vLCode;
		EntryNo = entryNo;
		QtyperUnitofMeasure = qtyperUnitofMeasure;
		ExpirationDate = expirationDate;
		LotNo = lotNo;
		QualityStatus = qualityStatus;
		PHRStatus = pHRStatus;
		RDD = rDD;
		ManufacturingDate = manufacturingDate;
		TNOPAL = tNOPAL;
	}

	public String getMESSAGE_ID() {
		return MESSAGE_ID;
	}

	public void setMESSAGE_ID(String mESSAGE_ID) {
		MESSAGE_ID = mESSAGE_ID;
	}

	public String getWHSEID() {
		return WHSEID;
	}

	public void setWHSEID(String wHSEID) {
		WHSEID = wHSEID;
	}

	public Double getLine_No() {
		return Line_No;
	}

	public void setLine_No(Double line_No) {
		Line_No = line_No;
	}

	public Double getItemNo() {
		return ItemNo;
	}

	public void setItemNo(Double itemNo) {
		ItemNo = itemNo;
	}

	public LocalDateTime getPostingDate() {
		return PostingDate;
	}

	public void setPostingDate(LocalDateTime postingDate) {
		PostingDate = postingDate;
	}

	public LocalTime getPostingTime() {
		return PostingTime;
	}

	public void setPostingTime(LocalTime postingTime) {
		PostingTime = postingTime;
	}

	public Double getEntryType() {
		return EntryType;
	}

	public void setEntryType(Double entryType) {
		EntryType = entryType;
	}

	public Double getDocumentNo() {
		return DocumentNo;
	}

	public void setDocumentNo(Double documentNo) {
		DocumentNo = documentNo;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Long getEDILocationCode() {
		return EDILocationCode;
	}

	public void setEDILocationCode(Long eDILocationCode) {
		EDILocationCode = eDILocationCode;
	}

	public String getLocationCode() {
		return LocationCode;
	}

	public void setLocationCode(String locationCode) {
		LocationCode = locationCode;
	}

	public String getUnitofMeasureCode() {
		return UnitofMeasureCode;
	}

	public void setUnitofMeasureCode(String unitofMeasureCode) {
		UnitofMeasureCode = unitofMeasureCode;
	}

	public Long getQuantity() {
		return Quantity;
	}

	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}

	public Long getQuantityBase() {
		return QuantityBase;
	}

	public void setQuantityBase(Long quantityBase) {
		QuantityBase = quantityBase;
	}

	public String getReasonCode() {
		return ReasonCode;
	}

	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}

	public Long getEANCode() {
		return EANCode;
	}

	public void setEANCode(Long eANCode) {
		EANCode = eANCode;
	}

	public String getVLCode() {
		return VLCode;
	}

	public void setVLCode(String vLCode) {
		VLCode = vLCode;
	}

	public Long getEntryNo() {
		return EntryNo;
	}

	public void setEntryNo(Long entryNo) {
		EntryNo = entryNo;
	}

	public String getQtyperUnitofMeasure() {
		return QtyperUnitofMeasure;
	}

	public void setQtyperUnitofMeasure(String qtyperUnitofMeasure) {
		QtyperUnitofMeasure = qtyperUnitofMeasure;
	}

	public LocalDateTime getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		ExpirationDate = expirationDate;
	}

	public Long getLotNo() {
		return LotNo;
	}

	public void setLotNo(Long lotNo) {
		LotNo = lotNo;
	}

	public String getQualityStatus() {
		return QualityStatus;
	}

	public void setQualityStatus(String qualityStatus) {
		QualityStatus = qualityStatus;
	}

	public String getPHRStatus() {
		return PHRStatus;
	}

	public void setPHRStatus(String pHRStatus) {
		PHRStatus = pHRStatus;
	}

	public String getRDD() {
		return RDD;
	}

	public void setRDD(String rDD) {
		RDD = rDD;
	}

	public LocalDateTime getManufacturingDate() {
		return ManufacturingDate;
	}

	public void setManufacturingDate(LocalDateTime manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}

	public String getTNOPAL() {
		return TNOPAL;
	}

	public void setTNOPAL(String tNOPAL) {
		TNOPAL = tNOPAL;
	}

	@Override
	public String toString() {
		return "SCE_RC_STOCK_ADJ [MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", Line_No=" + Line_No
				+ ", ItemNo=" + ItemNo + ", PostingDate=" + PostingDate + ", PostingTime=" + PostingTime
				+ ", EntryType=" + EntryType + ", DocumentNo=" + DocumentNo + ", Description=" + Description
				+ ", EDILocationCode=" + EDILocationCode + ", LocationCode=" + LocationCode + ", UnitofMeasureCode="
				+ UnitofMeasureCode + ", Quantity=" + Quantity + ", QuantityBase=" + QuantityBase + ", ReasonCode="
				+ ReasonCode + ", EANCode=" + EANCode + ", VLCode=" + VLCode + ", EntryNo=" + EntryNo
				+ ", QtyperUnitofMeasure=" + QtyperUnitofMeasure + ", ExpirationDate=" + ExpirationDate + ", LotNo="
				+ LotNo + ", QualityStatus=" + QualityStatus + ", PHRStatus=" + PHRStatus + ", RDD=" + RDD
				+ ", ManufacturingDate=" + ManufacturingDate + ", TNOPAL=" + TNOPAL + "]";
	}
}