package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_STOCK_ADJ_DATA")
public class SCE_RC_STOCK_ADJ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String MESSAGE_ID;
	private String WHSEID;
	private String Line_No;
	private String ItemNo;
	private LocalDateTime PostingDate;
	private LocalTime PostingTime;
	private Double EntryType;
	private String DocumentNo;
	private String Description;
	private Double EDILocationCode;
	private String LocationCode;
	private String UnitofMeasureCode;
	private Double Quantity;
	private Double QuantityBase;
	private String ReasonCode;
	private String EANCode;
	private String VLCode;
	private String EntryNo;
	private String QtyperUnitofMeasure;
	private String ManufacturingLotNo;
	private LocalDateTime ExpirationDate;
	private String LotNo;
	private String QualityStatus;
	private String PHRStatus;
	private String RDD;
	private String SourceSubType;
	private LocalDateTime ManufacturingDate;
	private String TNOPAL;
	
	public SCE_RC_STOCK_ADJ() {
		
	}

	public SCE_RC_STOCK_ADJ(Long id, String mESSAGE_ID, String wHSEID, String line_No, String itemNo,
			LocalDateTime postingDate, LocalTime postingTime, Double entryType, String documentNo, String description,
			Double eDILocationCode, String locationCode, String unitofMeasureCode, Double quantity, Double quantityBase,
			String reasonCode, String eANCode, String vLCode, String entryNo, String qtyperUnitofMeasure,
			String manufacturingLotNo, LocalDateTime expirationDate, String lotNo, String qualityStatus,
			String pHRStatus, String rDD, String sourceSubType, LocalDateTime manufacturingDate, String tNOPAL) {
		Id = id;
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
		ManufacturingLotNo = manufacturingLotNo;
		ExpirationDate = expirationDate;
		LotNo = lotNo;
		QualityStatus = qualityStatus;
		PHRStatus = pHRStatus;
		RDD = rDD;
		SourceSubType = sourceSubType;
		ManufacturingDate = manufacturingDate;
		TNOPAL = tNOPAL;
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

	public String getLine_No() {
		return Line_No;
	}

	public void setLine_No(String line_No) {
		Line_No = line_No;
	}

	public String getItemNo() {
		return ItemNo;
	}

	public void setItemNo(String itemNo) {
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

	public Double getEDILocationCode() {
		return EDILocationCode;
	}

	public void setEDILocationCode(Double eDILocationCode) {
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

	public Double getQuantity() {
		return Quantity;
	}

	public void setQuantity(Double quantity) {
		Quantity = quantity;
	}

	public Double getQuantityBase() {
		return QuantityBase;
	}

	public void setQuantityBase(Double quantityBase) {
		QuantityBase = quantityBase;
	}

	public String getReasonCode() {
		return ReasonCode;
	}

	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}

	public String getEANCode() {
		return EANCode;
	}

	public void setEANCode(String eANCode) {
		EANCode = eANCode;
	}

	public String getVLCode() {
		return VLCode;
	}

	public void setVLCode(String vLCode) {
		VLCode = vLCode;
	}

	public String getEntryNo() {
		return EntryNo;
	}

	public void setEntryNo(String entryNo) {
		EntryNo = entryNo;
	}

	public String getQtyperUnitofMeasure() {
		return QtyperUnitofMeasure;
	}

	public void setQtyperUnitofMeasure(String qtyperUnitofMeasure) {
		QtyperUnitofMeasure = qtyperUnitofMeasure;
	}

	public String getManufacturingLotNo() {
		return ManufacturingLotNo;
	}

	public void setManufacturingLotNo(String manufacturingLotNo) {
		ManufacturingLotNo = manufacturingLotNo;
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

	public String getRDD() {
		return RDD;
	}

	public void setRDD(String rDD) {
		RDD = rDD;
	}

	public String getSourceSubType() {
		return SourceSubType;
	}

	public void setSourceSubType(String sourceSubType) {
		SourceSubType = sourceSubType;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Description == null) ? 0 : Description.hashCode());
		result = prime * result + ((DocumentNo == null) ? 0 : DocumentNo.hashCode());
		result = prime * result + ((EANCode == null) ? 0 : EANCode.hashCode());
		result = prime * result + ((EDILocationCode == null) ? 0 : EDILocationCode.hashCode());
		result = prime * result + ((EntryNo == null) ? 0 : EntryNo.hashCode());
		result = prime * result + ((EntryType == null) ? 0 : EntryType.hashCode());
		result = prime * result + ((ExpirationDate == null) ? 0 : ExpirationDate.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((ItemNo == null) ? 0 : ItemNo.hashCode());
		result = prime * result + ((Line_No == null) ? 0 : Line_No.hashCode());
		result = prime * result + ((LocationCode == null) ? 0 : LocationCode.hashCode());
		result = prime * result + ((LotNo == null) ? 0 : LotNo.hashCode());
		result = prime * result + ((MESSAGE_ID == null) ? 0 : MESSAGE_ID.hashCode());
		result = prime * result + ((ManufacturingDate == null) ? 0 : ManufacturingDate.hashCode());
		result = prime * result + ((ManufacturingLotNo == null) ? 0 : ManufacturingLotNo.hashCode());
		result = prime * result + ((PHRStatus == null) ? 0 : PHRStatus.hashCode());
		result = prime * result + ((PostingDate == null) ? 0 : PostingDate.hashCode());
		result = prime * result + ((PostingTime == null) ? 0 : PostingTime.hashCode());
		result = prime * result + ((QtyperUnitofMeasure == null) ? 0 : QtyperUnitofMeasure.hashCode());
		result = prime * result + ((QualityStatus == null) ? 0 : QualityStatus.hashCode());
		result = prime * result + ((Quantity == null) ? 0 : Quantity.hashCode());
		result = prime * result + ((QuantityBase == null) ? 0 : QuantityBase.hashCode());
		result = prime * result + ((RDD == null) ? 0 : RDD.hashCode());
		result = prime * result + ((ReasonCode == null) ? 0 : ReasonCode.hashCode());
		result = prime * result + ((SourceSubType == null) ? 0 : SourceSubType.hashCode());
		result = prime * result + ((TNOPAL == null) ? 0 : TNOPAL.hashCode());
		result = prime * result + ((UnitofMeasureCode == null) ? 0 : UnitofMeasureCode.hashCode());
		result = prime * result + ((VLCode == null) ? 0 : VLCode.hashCode());
		result = prime * result + ((WHSEID == null) ? 0 : WHSEID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SCE_RC_STOCK_ADJ other = (SCE_RC_STOCK_ADJ) obj;
		if (Description == null) {
			if (other.Description != null)
				return false;
		} else if (!Description.equals(other.Description))
			return false;
		if (DocumentNo == null) {
			if (other.DocumentNo != null)
				return false;
		} else if (!DocumentNo.equals(other.DocumentNo))
			return false;
		if (EANCode == null) {
			if (other.EANCode != null)
				return false;
		} else if (!EANCode.equals(other.EANCode))
			return false;
		if (EDILocationCode == null) {
			if (other.EDILocationCode != null)
				return false;
		} else if (!EDILocationCode.equals(other.EDILocationCode))
			return false;
		if (EntryNo == null) {
			if (other.EntryNo != null)
				return false;
		} else if (!EntryNo.equals(other.EntryNo))
			return false;
		if (EntryType == null) {
			if (other.EntryType != null)
				return false;
		} else if (!EntryType.equals(other.EntryType))
			return false;
		if (ExpirationDate == null) {
			if (other.ExpirationDate != null)
				return false;
		} else if (!ExpirationDate.equals(other.ExpirationDate))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (ItemNo == null) {
			if (other.ItemNo != null)
				return false;
		} else if (!ItemNo.equals(other.ItemNo))
			return false;
		if (Line_No == null) {
			if (other.Line_No != null)
				return false;
		} else if (!Line_No.equals(other.Line_No))
			return false;
		if (LocationCode == null) {
			if (other.LocationCode != null)
				return false;
		} else if (!LocationCode.equals(other.LocationCode))
			return false;
		if (LotNo == null) {
			if (other.LotNo != null)
				return false;
		} else if (!LotNo.equals(other.LotNo))
			return false;
		if (MESSAGE_ID == null) {
			if (other.MESSAGE_ID != null)
				return false;
		} else if (!MESSAGE_ID.equals(other.MESSAGE_ID))
			return false;
		if (ManufacturingDate == null) {
			if (other.ManufacturingDate != null)
				return false;
		} else if (!ManufacturingDate.equals(other.ManufacturingDate))
			return false;
		if (ManufacturingLotNo == null) {
			if (other.ManufacturingLotNo != null)
				return false;
		} else if (!ManufacturingLotNo.equals(other.ManufacturingLotNo))
			return false;
		if (PHRStatus == null) {
			if (other.PHRStatus != null)
				return false;
		} else if (!PHRStatus.equals(other.PHRStatus))
			return false;
		if (PostingDate == null) {
			if (other.PostingDate != null)
				return false;
		} else if (!PostingDate.equals(other.PostingDate))
			return false;
		if (PostingTime == null) {
			if (other.PostingTime != null)
				return false;
		} else if (!PostingTime.equals(other.PostingTime))
			return false;
		if (QtyperUnitofMeasure == null) {
			if (other.QtyperUnitofMeasure != null)
				return false;
		} else if (!QtyperUnitofMeasure.equals(other.QtyperUnitofMeasure))
			return false;
		if (QualityStatus == null) {
			if (other.QualityStatus != null)
				return false;
		} else if (!QualityStatus.equals(other.QualityStatus))
			return false;
		if (Quantity == null) {
			if (other.Quantity != null)
				return false;
		} else if (!Quantity.equals(other.Quantity))
			return false;
		if (QuantityBase == null) {
			if (other.QuantityBase != null)
				return false;
		} else if (!QuantityBase.equals(other.QuantityBase))
			return false;
		if (RDD == null) {
			if (other.RDD != null)
				return false;
		} else if (!RDD.equals(other.RDD))
			return false;
		if (ReasonCode == null) {
			if (other.ReasonCode != null)
				return false;
		} else if (!ReasonCode.equals(other.ReasonCode))
			return false;
		if (SourceSubType == null) {
			if (other.SourceSubType != null)
				return false;
		} else if (!SourceSubType.equals(other.SourceSubType))
			return false;
		if (TNOPAL == null) {
			if (other.TNOPAL != null)
				return false;
		} else if (!TNOPAL.equals(other.TNOPAL))
			return false;
		if (UnitofMeasureCode == null) {
			if (other.UnitofMeasureCode != null)
				return false;
		} else if (!UnitofMeasureCode.equals(other.UnitofMeasureCode))
			return false;
		if (VLCode == null) {
			if (other.VLCode != null)
				return false;
		} else if (!VLCode.equals(other.VLCode))
			return false;
		if (WHSEID == null) {
			if (other.WHSEID != null)
				return false;
		} else if (!WHSEID.equals(other.WHSEID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SCE_RC_STOCK_ADJ [Id=" + Id + ", MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", Line_No="
				+ Line_No + ", ItemNo=" + ItemNo + ", PostingDate=" + PostingDate + ", PostingTime=" + PostingTime
				+ ", EntryType=" + EntryType + ", DocumentNo=" + DocumentNo + ", Description=" + Description
				+ ", EDILocationCode=" + EDILocationCode + ", LocationCode=" + LocationCode + ", UnitofMeasureCode="
				+ UnitofMeasureCode + ", Quantity=" + Quantity + ", QuantityBase=" + QuantityBase + ", ReasonCode="
				+ ReasonCode + ", EANCode=" + EANCode + ", VLCode=" + VLCode + ", EntryNo=" + EntryNo
				+ ", QtyperUnitofMeasure=" + QtyperUnitofMeasure + ", ManufacturingLotNo=" + ManufacturingLotNo
				+ ", ExpirationDate=" + ExpirationDate + ", LotNo=" + LotNo + ", QualityStatus=" + QualityStatus
				+ ", PHRStatus=" + PHRStatus + ", RDD=" + RDD + ", SourceSubType=" + SourceSubType
				+ ", ManufacturingDate=" + ManufacturingDate + ", TNOPAL=" + TNOPAL + "]";
	}
}