package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_GRN_DATA")
public class SCE_RC_GRN {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String MESSAGE_ID;
	private String WHSEID;
	private String DocumentNo;
	private LocalDateTime OrderDate;
	private String BuyFromVendorNo;
	private String LocationCode;
	private LocalDateTime ReceiptDate;
	private Double Line_No;
	private String ItemNo;
	private String UnitofMeasureCode;
	private String Description;
	private Double QuantityTotal;
	private String QuantityBaseTotal;
	private String ManufacturingLotNo;
	private String EANCode;
	private String QtyperUnitofMeasure;
	private Double Quantity;
	private String QuantityBase;
	private LocalDateTime ExpirationDate;
	private String LotNo;
	private String QualityStatus;
	private String PHRStatus;
	private LocalDateTime RDD;
	private LocalDateTime ManufacturingDate;
	private String TNOPAL;
	private String SourceSubType;
	
	
	public SCE_RC_GRN() {
		// TODO Auto-generated constructor stub
	}


	public SCE_RC_GRN(Long id, String mESSAGE_ID, String wHSEID, String documentNo, LocalDateTime orderDate,
			String buyFromVendorNo, String locationCode, LocalDateTime receiptDate, Double line_No, String itemNo,
			String unitofMeasureCode, String description, Double quantityTotal, String quantityBaseTotal,
			String manufacturingLotNo, String eANCode, String qtyperUnitofMeasure, Double quantity, String quantityBase,
			LocalDateTime expirationDate, String lotNo, String qualityStatus, String pHRStatus, LocalDateTime rDD,
			LocalDateTime manufacturingDate, String tNOPAL, String sourceSubType) {
		Id = id;
		MESSAGE_ID = mESSAGE_ID;
		WHSEID = wHSEID;
		DocumentNo = documentNo;
		OrderDate = orderDate;
		BuyFromVendorNo = buyFromVendorNo;
		LocationCode = locationCode;
		ReceiptDate = receiptDate;
		Line_No = line_No;
		ItemNo = itemNo;
		UnitofMeasureCode = unitofMeasureCode;
		Description = description;
		QuantityTotal = quantityTotal;
		QuantityBaseTotal = quantityBaseTotal;
		ManufacturingLotNo = manufacturingLotNo;
		EANCode = eANCode;
		QtyperUnitofMeasure = qtyperUnitofMeasure;
		Quantity = quantity;
		QuantityBase = quantityBase;
		ExpirationDate = expirationDate;
		LotNo = lotNo;
		QualityStatus = qualityStatus;
		PHRStatus = pHRStatus;
		RDD = rDD;
		ManufacturingDate = manufacturingDate;
		TNOPAL = tNOPAL;
		SourceSubType = sourceSubType;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
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


	public String getDocumentNo() {
		return DocumentNo;
	}


	public void setDocumentNo(String documentNo) {
		DocumentNo = documentNo;
	}


	public LocalDateTime getOrderDate() {
		return OrderDate;
	}


	public void setOrderDate(LocalDateTime orderDate) {
		OrderDate = orderDate;
	}


	public String getBuyFromVendorNo() {
		return BuyFromVendorNo;
	}


	public void setBuyFromVendorNo(String buyFromVendorNo) {
		BuyFromVendorNo = buyFromVendorNo;
	}


	public String getLocationCode() {
		return LocationCode;
	}


	public void setLocationCode(String locationCode) {
		LocationCode = locationCode;
	}


	public LocalDateTime getReceiptDate() {
		return ReceiptDate;
	}


	public void setReceiptDate(LocalDateTime receiptDate) {
		ReceiptDate = receiptDate;
	}


	public Double getLine_No() {
		return Line_No;
	}


	public void setLine_No(Double line_No) {
		Line_No = line_No;
	}


	public String getItemNo() {
		return ItemNo;
	}


	public void setItemNo(String itemNo) {
		ItemNo = itemNo;
	}


	public String getUnitofMeasureCode() {
		return UnitofMeasureCode;
	}


	public void setUnitofMeasureCode(String unitofMeasureCode) {
		UnitofMeasureCode = unitofMeasureCode;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public Double getQuantityTotal() {
		return QuantityTotal;
	}


	public void setQuantityTotal(Double quantityTotal) {
		QuantityTotal = quantityTotal;
	}


	public String getQuantityBaseTotal() {
		return QuantityBaseTotal;
	}


	public void setQuantityBaseTotal(String quantityBaseTotal) {
		QuantityBaseTotal = quantityBaseTotal;
	}


	public String getManufacturingLotNo() {
		return ManufacturingLotNo;
	}


	public void setManufacturingLotNo(String manufacturingLotNo) {
		ManufacturingLotNo = manufacturingLotNo;
	}


	public String getEANCode() {
		return EANCode;
	}


	public void setEANCode(String eANCode) {
		EANCode = eANCode;
	}


	public String getQtyperUnitofMeasure() {
		return QtyperUnitofMeasure;
	}


	public void setQtyperUnitofMeasure(String qtyperUnitofMeasure) {
		QtyperUnitofMeasure = qtyperUnitofMeasure;
	}


	public Double getQuantity() {
		return Quantity;
	}


	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}


	public String getQuantityBase() {
		return QuantityBase;
	}


	public void setQuantityBase(String quantityBase) {
		QuantityBase = quantityBase;
	}


	public LocalDateTime getExpirationDate() {
		return ExpirationDate;
	}


	public void setExpirationDate(LocalDateTime expirationDate) {
		ExpirationDate = expirationDate;
	}


	public String getLotNo() {
		return LotNo;
	}


	public void setLotNo(String lotNo) {
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


	public LocalDateTime getRDD() {
		return RDD;
	}


	public void setRDD(LocalDateTime rDD) {
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


	public String getSourceSubType() {
		return SourceSubType;
	}


	public void setSourceSubType(String sourceSubType) {
		SourceSubType = sourceSubType;
	}


	@Override
	public String toString() {
		return "SCE_RC_GRN [Id=" + Id + ", MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", DocumentNo="
				+ DocumentNo + ", OrderDate=" + OrderDate + ", BuyFromVendorNo=" + BuyFromVendorNo + ", LocationCode="
				+ LocationCode + ", ReceiptDate=" + ReceiptDate + ", Line_No=" + Line_No + ", ItemNo=" + ItemNo
				+ ", UnitofMeasureCode=" + UnitofMeasureCode + ", Description=" + Description + ", QuantityTotal="
				+ QuantityTotal + ", QuantityBaseTotal=" + QuantityBaseTotal + ", ManufacturingLotNo="
				+ ManufacturingLotNo + ", EANCode=" + EANCode + ", QtyperUnitofMeasure=" + QtyperUnitofMeasure
				+ ", Quantity=" + Quantity + ", QuantityBase=" + QuantityBase + ", ExpirationDate=" + ExpirationDate
				+ ", LotNo=" + LotNo + ", QualityStatus=" + QualityStatus + ", PHRStatus=" + PHRStatus + ", RDD=" + RDD
				+ ", ManufacturingDate=" + ManufacturingDate + ", TNOPAL=" + TNOPAL + ", SourceSubType=" + SourceSubType
				+ "]";
	}
	
}
