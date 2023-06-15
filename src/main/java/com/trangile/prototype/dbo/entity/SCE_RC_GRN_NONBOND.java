package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_GRN_NONBOND_DATA")
public class SCE_RC_GRN_NONBOND {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String MESSAGE_ID;
	private String WHSEID;
	private String DocumentNo;
	private String Description;
	private String TransferfromCode;
	private String TransfertoCode;
	private LocalDateTime ReceiptDate;
	private Double Line_No;
	private String ItemNo;
	private String ManufacturingLotNo;
	private String UnitofMeasureCode;
	private String QtytoReceive;
	private Double QtytoReceiveBase;
	private String EANCode;
	private String QtyperUnitofMeasure;
	private String Quantity;
	private Double QuantityBase;
	private LocalDateTime ExpirationDate;
	private String  LotNo;
	private LocalDateTime ManufacturingDate;
	private LocalDateTime RDD;
	private String QualityStatus;
	private String TNOPAL;
	
	
	public SCE_RC_GRN_NONBOND() {
		
	}


	public SCE_RC_GRN_NONBOND(String mESSAGE_ID, String wHSEID, String documentNo, String description,
			String transferfromCode, String transfertoCode, LocalDateTime receiptDate, Double line_No, String itemNo,
			String manufacturingLotNo, String unitofMeasureCode, String qtytoReceive, Double qtytoReceiveBase,
			String eANCode, String qtyperUnitofMeasure, String quantity, Double quantityBase,
			LocalDateTime expirationDate, String lotNo, LocalDateTime manufacturingDate, LocalDateTime rDD,
			String qualityStatus, String tNOPAL) {
		MESSAGE_ID = mESSAGE_ID;
		WHSEID = wHSEID;
		DocumentNo = documentNo;
		Description = description;
		TransferfromCode = transferfromCode;
		TransfertoCode = transfertoCode;
		ReceiptDate = receiptDate;
		Line_No = line_No;
		ItemNo = itemNo;
		ManufacturingLotNo = manufacturingLotNo;
		UnitofMeasureCode = unitofMeasureCode;
		QtytoReceive = qtytoReceive;
		QtytoReceiveBase = qtytoReceiveBase;
		EANCode = eANCode;
		QtyperUnitofMeasure = qtyperUnitofMeasure;
		Quantity = quantity;
		QuantityBase = quantityBase;
		ExpirationDate = expirationDate;
		LotNo = lotNo;
		ManufacturingDate = manufacturingDate;
		RDD = rDD;
		QualityStatus = qualityStatus;
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


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getTransferfromCode() {
		return TransferfromCode;
	}


	public void setTransferfromCode(String transferfromCode) {
		TransferfromCode = transferfromCode;
	}


	public String getTransfertoCode() {
		return TransfertoCode;
	}


	public void setTransfertoCode(String transfertoCode) {
		TransfertoCode = transfertoCode;
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


	public String getManufacturingLotNo() {
		return ManufacturingLotNo;
	}


	public void setManufacturingLotNo(String manufacturingLotNo) {
		ManufacturingLotNo = manufacturingLotNo;
	}


	public String getUnitofMeasureCode() {
		return UnitofMeasureCode;
	}


	public void setUnitofMeasureCode(String unitofMeasureCode) {
		UnitofMeasureCode = unitofMeasureCode;
	}


	public String getQtytoReceive() {
		return QtytoReceive;
	}


	public void setQtytoReceive(String qtytoReceive) {
		QtytoReceive = qtytoReceive;
	}


	public Double getQtytoReceiveBase() {
		return QtytoReceiveBase;
	}


	public void setQtytoReceiveBase(Double qtytoReceiveBase) {
		QtytoReceiveBase = qtytoReceiveBase;
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


	public String getQuantity() {
		return Quantity;
	}


	public void setQuantity(String quantity) {
		Quantity = quantity;
	}


	public Double getQuantityBase() {
		return QuantityBase;
	}


	public void setQuantityBase(Double quantityBase) {
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


	public LocalDateTime getManufacturingDate() {
		return ManufacturingDate;
	}


	public void setManufacturingDate(LocalDateTime manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}


	public LocalDateTime getRDD() {
		return RDD;
	}


	public void setRDD(LocalDateTime rDD) {
		RDD = rDD;
	}


	public String getQualityStatus() {
		return QualityStatus;
	}


	public void setQualityStatus(String qualityStatus) {
		QualityStatus = qualityStatus;
	}


	public String getTNOPAL() {
		return TNOPAL;
	}


	public void setTNOPAL(String tNOPAL) {
		TNOPAL = tNOPAL;
	}


	@Override
	public String toString() {
		return "SCE_RC_GRN_NONBOND [MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", DocumentNo=" + DocumentNo
				+ ", Description=" + Description + ", TransferfromCode=" + TransferfromCode + ", TransfertoCode="
				+ TransfertoCode + ", ReceiptDate=" + ReceiptDate + ", Line_No=" + Line_No + ", ItemNo=" + ItemNo
				+ ", ManufacturingLotNo=" + ManufacturingLotNo + ", UnitofMeasureCode=" + UnitofMeasureCode
				+ ", QtytoReceive=" + QtytoReceive + ", QtytoReceiveBase=" + QtytoReceiveBase + ", EANCode=" + EANCode
				+ ", QtyperUnitofMeasure=" + QtyperUnitofMeasure + ", Quantity=" + Quantity + ", QuantityBase="
				+ QuantityBase + ", ExpirationDate=" + ExpirationDate + ", LotNo=" + LotNo + ", ManufacturingDate="
				+ ManufacturingDate + ", RDD=" + RDD + ", QualityStatus=" + QualityStatus + ", TNOPAL=" + TNOPAL + "]";
	}
}
