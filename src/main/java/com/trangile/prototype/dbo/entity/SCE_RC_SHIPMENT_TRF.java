package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_SHIPMENT_TRF_DATA")
public class SCE_RC_SHIPMENT_TRF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String MESSAGE_ID;
	private String WHSEID;
	private String DocumentNo;
	private String ExternalDocumentNo;
	private LocalDateTime ShipmentDate;
	private Double EDITransfer_fromCode;
	private String Transfer_fromCode;
	private Double EDITransfer_toCode;
	private String Transfer_toCode;
	private String EDIMainCarrierNo;
	private String MainCarrierNo;
	private String ShippingAgentCode;
	private String TransportMethod;
	private String Distance;
	private String VehicleType;
	private String VehicleNo;
	private String Line_No;
	private String ItemNo;
	private String UnitofMeasureCode;
	private Double QtytoShip;
	private Double QtytoShipBase;
	private String Description;
	private String ReasonCode;
	private Double EANCode;
	private String VLCode;
	private Double QtyperUnitofMeasure;
	private Double Quantity;
	private Double QuantityBase;
	private LocalDateTime ExpirationDate;
	private String LotNo;
	private String ManufacturingLotNo;
	private String QualityStatus;
	private String PHRStatus;
	private String RDD;
	private LocalDateTime ManufacturingDate;
	private String TNOPAL;
	private String SourceSubType;
	private String SelltoCustomerName;
	
	public SCE_RC_SHIPMENT_TRF() {
		
	}

	

	public SCE_RC_SHIPMENT_TRF(Long id, String mESSAGE_ID, String wHSEID, String documentNo, String externalDocumentNo,
			LocalDateTime shipmentDate, Double eDITransfer_fromCode, String transfer_fromCode,
			Double eDITransfer_toCode, String transfer_toCode, String eDIMainCarrierNo, String mainCarrierNo,
			String shippingAgentCode, String transportMethod, String distance, String vehicleType, String vehicleNo,
			String line_No, String itemNo, String unitofMeasureCode, Double qtytoShip, Double qtytoShipBase,
			String description, String reasonCode, Double eANCode, String vLCode, Double qtyperUnitofMeasure,
			Double quantity, Double quantityBase, LocalDateTime expirationDate, String lotNo, String manufacturingLotNo,
			String qualityStatus, String pHRStatus, String rDD, LocalDateTime manufacturingDate, String tNOPAL,
			String sourceSubType, String selltoCustomerName) {
		Id = id;
		MESSAGE_ID = mESSAGE_ID;
		WHSEID = wHSEID;
		DocumentNo = documentNo;
		ExternalDocumentNo = externalDocumentNo;
		ShipmentDate = shipmentDate;
		EDITransfer_fromCode = eDITransfer_fromCode;
		Transfer_fromCode = transfer_fromCode;
		EDITransfer_toCode = eDITransfer_toCode;
		Transfer_toCode = transfer_toCode;
		EDIMainCarrierNo = eDIMainCarrierNo;
		MainCarrierNo = mainCarrierNo;
		ShippingAgentCode = shippingAgentCode;
		TransportMethod = transportMethod;
		Distance = distance;
		VehicleType = vehicleType;
		VehicleNo = vehicleNo;
		Line_No = line_No;
		ItemNo = itemNo;
		UnitofMeasureCode = unitofMeasureCode;
		QtytoShip = qtytoShip;
		QtytoShipBase = qtytoShipBase;
		Description = description;
		ReasonCode = reasonCode;
		EANCode = eANCode;
		VLCode = vLCode;
		QtyperUnitofMeasure = qtyperUnitofMeasure;
		Quantity = quantity;
		QuantityBase = quantityBase;
		ExpirationDate = expirationDate;
		LotNo = lotNo;
		ManufacturingLotNo = manufacturingLotNo;
		QualityStatus = qualityStatus;
		PHRStatus = pHRStatus;
		RDD = rDD;
		ManufacturingDate = manufacturingDate;
		TNOPAL = tNOPAL;
		SourceSubType = sourceSubType;
		SelltoCustomerName = selltoCustomerName;
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

	public String getExternalDocumentNo() {
		return ExternalDocumentNo;
	}

	public void setExternalDocumentNo(String externalDocumentNo) {
		ExternalDocumentNo = externalDocumentNo;
	}

	public LocalDateTime getShipmentDate() {
		return ShipmentDate;
	}

	public void setShipmentDate(LocalDateTime shipmentDate) {
		ShipmentDate = shipmentDate;
	}

	public Double getEDITransfer_fromCode() {
		return EDITransfer_fromCode;
	}

	public void setEDITransfer_fromCode(Double eDITransfer_fromCode) {
		EDITransfer_fromCode = eDITransfer_fromCode;
	}

	public String getTransfer_fromCode() {
		return Transfer_fromCode;
	}

	public void setTransfer_fromCode(String transfer_fromCode) {
		Transfer_fromCode = transfer_fromCode;
	}

	public Double getEDITransfer_toCode() {
		return EDITransfer_toCode;
	}

	public void setEDITransfer_toCode(Double eDITransfer_toCode) {
		EDITransfer_toCode = eDITransfer_toCode;
	}

	public String getTransfer_toCode() {
		return Transfer_toCode;
	}

	public void setTransfer_toCode(String transfer_toCode) {
		Transfer_toCode = transfer_toCode;
	}

	public String getEDIMainCarrierNo() {
		return EDIMainCarrierNo;
	}

	public void setEDIMainCarrierNo(String eDIMainCarrierNo) {
		EDIMainCarrierNo = eDIMainCarrierNo;
	}

	public String getMainCarrierNo() {
		return MainCarrierNo;
	}

	public void setMainCarrierNo(String mainCarrierNo) {
		MainCarrierNo = mainCarrierNo;
	}

	public String getShippingAgentCode() {
		return ShippingAgentCode;
	}

	public void setShippingAgentCode(String shippingAgentCode) {
		ShippingAgentCode = shippingAgentCode;
	}

	public String getTransportMethod() {
		return TransportMethod;
	}

	public void setTransportMethod(String transportMethod) {
		TransportMethod = transportMethod;
	}

	public String getDistance() {
		return Distance;
	}

	public void setDistance(String distance) {
		Distance = distance;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
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

	public String getUnitofMeasureCode() {
		return UnitofMeasureCode;
	}

	public void setUnitofMeasureCode(String unitofMeasureCode) {
		UnitofMeasureCode = unitofMeasureCode;
	}

	public Double getQtytoShip() {
		return QtytoShip;
	}

	public void setQtytoShip(Double qtytoShip) {
		QtytoShip = qtytoShip;
	}

	public Double getQtytoShipBase() {
		return QtytoShipBase;
	}

	public void setQtytoShipBase(Double qtytoShipBase) {
		QtytoShipBase = qtytoShipBase;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getReasonCode() {
		return ReasonCode;
	}

	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}

	public Double getEANCode() {
		return EANCode;
	}

	public void setEANCode(Double eANCode) {
		EANCode = eANCode;
	}

	public String getVLCode() {
		return VLCode;
	}

	public void setVLCode(String vLCode) {
		VLCode = vLCode;
	}

	public Double getQtyperUnitofMeasure() {
		return QtyperUnitofMeasure;
	}

	public void setQtyperUnitofMeasure(Double qtyperUnitofMeasure) {
		QtyperUnitofMeasure = qtyperUnitofMeasure;
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

	public String getManufacturingLotNo() {
		return ManufacturingLotNo;
	}

	public void setManufacturingLotNo(String manufacturingLotNo) {
		ManufacturingLotNo = manufacturingLotNo;
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

	public String getSourceSubType() {
		return SourceSubType;
	}

	public void setSourceSubType(String sourceSubType) {
		SourceSubType = sourceSubType;
	}

	public String getSelltoCustomerName() {
		return SelltoCustomerName;
	}

	public void setSelltoCustomerName(String selltoCustomerName) {
		SelltoCustomerName = selltoCustomerName;
	}

	@Override
	public String toString() {
		return "SCE_RC_SHIPMENT_TRF [Id=" + Id + ", MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", DocumentNo="
				+ DocumentNo + ", ExternalDocumentNo=" + ExternalDocumentNo + ", ShipmentDate=" + ShipmentDate
				+ ", EDITransfer_fromCode=" + EDITransfer_fromCode + ", Transfer_fromCode=" + Transfer_fromCode
				+ ", EDITransfer_toCode=" + EDITransfer_toCode + ", Transfer_toCode=" + Transfer_toCode
				+ ", EDIMainCarrierNo=" + EDIMainCarrierNo + ", MainCarrierNo=" + MainCarrierNo + ", ShippingAgentCode="
				+ ShippingAgentCode + ", TransportMethod=" + TransportMethod + ", Distance=" + Distance
				+ ", VehicleType=" + VehicleType + ", VehicleNo=" + VehicleNo + ", Line_No=" + Line_No + ", ItemNo="
				+ ItemNo + ", UnitofMeasureCode=" + UnitofMeasureCode + ", QtytoShip=" + QtytoShip + ", QtytoShipBase="
				+ QtytoShipBase + ", Description=" + Description + ", ReasonCode=" + ReasonCode + ", EANCode=" + EANCode
				+ ", VLCode=" + VLCode + ", QtyperUnitofMeasure=" + QtyperUnitofMeasure + ", Quantity=" + Quantity
				+ ", QuantityBase=" + QuantityBase + ", ExpirationDate=" + ExpirationDate + ", LotNo=" + LotNo
				+ ", ManufacturingLotNo=" + ManufacturingLotNo + ", QualityStatus=" + QualityStatus + ", PHRStatus="
				+ PHRStatus + ", RDD=" + RDD + ", ManufacturingDate=" + ManufacturingDate + ", TNOPAL=" + TNOPAL
				+ ", SourceSubType=" + SourceSubType + ", SelltoCustomerName=" + SelltoCustomerName + ", getId()="
				+ getId() + ", getMESSAGE_ID()=" + getMESSAGE_ID() + ", getWHSEID()=" + getWHSEID()
				+ ", getDocumentNo()=" + getDocumentNo() + ", getExternalDocumentNo()=" + getExternalDocumentNo()
				+ ", getShipmentDate()=" + getShipmentDate() + ", getEDITransfer_fromCode()="
				+ getEDITransfer_fromCode() + ", getTransfer_fromCode()=" + getTransfer_fromCode()
				+ ", getEDITransfer_toCode()=" + getEDITransfer_toCode() + ", getTransfer_toCode()="
				+ getTransfer_toCode() + ", getEDIMainCarrierNo()=" + getEDIMainCarrierNo() + ", getMainCarrierNo()="
				+ getMainCarrierNo() + ", getShippingAgentCode()=" + getShippingAgentCode() + ", getTransportMethod()="
				+ getTransportMethod() + ", getDistance()=" + getDistance() + ", getVehicleType()=" + getVehicleType()
				+ ", getVehicleNo()=" + getVehicleNo() + ", getLine_No()=" + getLine_No() + ", getItemNo()="
				+ getItemNo() + ", getUnitofMeasureCode()=" + getUnitofMeasureCode() + ", getQtytoShip()="
				+ getQtytoShip() + ", getQtytoShipBase()=" + getQtytoShipBase() + ", getDescription()="
				+ getDescription() + ", getReasonCode()=" + getReasonCode() + ", getEANCode()=" + getEANCode()
				+ ", getVLCode()=" + getVLCode() + ", getQtyperUnitofMeasure()=" + getQtyperUnitofMeasure()
				+ ", getQuantity()=" + getQuantity() + ", getQuantityBase()=" + getQuantityBase()
				+ ", getExpirationDate()=" + getExpirationDate() + ", getLotNo()=" + getLotNo()
				+ ", getManufacturingLotNo()=" + getManufacturingLotNo() + ", getQualityStatus()=" + getQualityStatus()
				+ ", getPHRStatus()=" + getPHRStatus() + ", getRDD()=" + getRDD() + ", getManufacturingDate()="
				+ getManufacturingDate() + ", getTNOPAL()=" + getTNOPAL() + ", getSourceSubType()=" + getSourceSubType()
				+ ", getSelltoCustomerName()=" + getSelltoCustomerName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
