package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_GRN_DATA", schema = "dbo")
public class SCE_RC_GRN {
	
	@Id
	private String MESSAGE_ID;
	private String WHSEID;
	private String DocumentNo;
	private LocalDateTime OrderDate;
	private String BuyFromVendorNo;
	private String LocationCode;
	private LocalDateTime ReceiptDate;
	private Double Line_No;
	private Double ItemNo;
	private String UnitofMeasureCode;
	private Double QuantityTotal;
	private String QuantityBaseTotal;
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
	
	public SCE_RC_GRN() {
		
	}

	public SCE_RC_GRN(String mESSAGE_ID, String wHSEID, String documentNo, LocalDateTime orderDate,
			String buyFromVendorNo, String locationCode, LocalDateTime receiptDate, Double line_No, Double itemNo,
			String unitofMeasureCode, Double quantityTotal, String quantityBaseTotal, String eANCode,
			String qtyperUnitofMeasure, Double quantity, String quantityBase, LocalDateTime expirationDate,
			String lotNo, String qualityStatus, String pHRStatus, LocalDateTime rDD, LocalDateTime manufacturingDate,
			String tNOPAL) {
		super();
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
		QuantityTotal = quantityTotal;
		QuantityBaseTotal = quantityBaseTotal;
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

	public Double getItemNo() {
		return ItemNo;
	}

	public void setItemNo(Double itemNo) {
		ItemNo = itemNo;
	}

	public String getUnitofMeasureCode() {
		return UnitofMeasureCode;
	}

	public void setUnitofMeasureCode(String unitofMeasureCode) {
		UnitofMeasureCode = unitofMeasureCode;
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

	@Override
	public String toString() {
		return "SCE_RC_GRN [MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", DocumentNo=" + DocumentNo
				+ ", OrderDate=" + OrderDate + ", BuyFromVendorNo=" + BuyFromVendorNo + ", LocationCode=" + LocationCode
				+ ", ReceiptDate=" + ReceiptDate + ", Line_No=" + Line_No + ", ItemNo=" + ItemNo
				+ ", UnitofMeasureCode=" + UnitofMeasureCode + ", QuantityTotal=" + QuantityTotal
				+ ", QuantityBaseTotal=" + QuantityBaseTotal + ", EANCode=" + EANCode + ", QtyperUnitofMeasure="
				+ QtyperUnitofMeasure + ", Quantity=" + Quantity + ", QuantityBase=" + QuantityBase
				+ ", ExpirationDate=" + ExpirationDate + ", LotNo=" + LotNo + ", QualityStatus=" + QualityStatus
				+ ", PHRStatus=" + PHRStatus + ", RDD=" + RDD + ", ManufacturingDate=" + ManufacturingDate + ", TNOPAL="
				+ TNOPAL + "]";
	}
}
