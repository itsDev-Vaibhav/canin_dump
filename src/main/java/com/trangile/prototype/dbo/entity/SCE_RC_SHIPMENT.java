package com.trangile.prototype.dbo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCE_RC_SHIPMENT_SO_DATA", schema = "dbo")
public class SCE_RC_SHIPMENT {
	@Id
	private String MESSAGE_ID;
	private String WHSEID;
	private String DocumentNo;
	private String ExternalDocumentNo;
	private Double PackageTrackingNo;
	private LocalDateTime ShipmentDate;
	private String SelltoCustomerNo;
	private String ShippingAgentCode;
	private String TransportMethod;
	private String Distance;
	private String VehicleType;
	private String VehicleNo;
	private Double EDISelltoCustomerNo;
	private Double Line_No;
	private String ItemNo;
	private String UnitofMeasureCode;
	private Double EDILocationCode;
	private String LocationCode;
	private Double QtytoShip;
	private Double QtytoShipBase;
	private String ReasonCode;
	private Double EANCode;
	private String VLCode;
	private Double QtyperUnitofMeasure;
	private Double Quantity;
	private Double QuantityBase;
	private LocalDateTime ExpirationDate;
	private String LotNo;
	private String QualityStatus;
	private String PHRStatus;
	private String RDD;
	private LocalDateTime ManufacturingDate;
	private Double TNOPAL;
	
	
	public SCE_RC_SHIPMENT() {
		
	}


	public SCE_RC_SHIPMENT(String mESSAGE_ID, String wHSEID, String documentNo, String externalDocumentNo,
			Double packageTrackingNo, LocalDateTime shipmentDate, String selltoCustomerNo, String shippingAgentCode,
			String transportMethod, String distance, String vehicleType, String vehicleNo, Double eDISelltoCustomerNo,
			Double line_No, String itemNo, String unitofMeasureCode, Double eDILocationCode, String locationCode,
			Double qtytoShip, Double qtytoShipBase, String reasonCode, Double eANCode, String vLCode,
			Double qtyperUnitofMeasure, Double quantity, Double quantityBase, LocalDateTime expirationDate,
			String lotNo, String qualityStatus, String pHRStatus, String rDD, LocalDateTime manufacturingDate,
			Double tNOPAL) {
		MESSAGE_ID = mESSAGE_ID;
		WHSEID = wHSEID;
		DocumentNo = documentNo;
		ExternalDocumentNo = externalDocumentNo;
		PackageTrackingNo = packageTrackingNo;
		ShipmentDate = shipmentDate;
		SelltoCustomerNo = selltoCustomerNo;
		ShippingAgentCode = shippingAgentCode;
		TransportMethod = transportMethod;
		Distance = distance;
		VehicleType = vehicleType;
		VehicleNo = vehicleNo;
		EDISelltoCustomerNo = eDISelltoCustomerNo;
		Line_No = line_No;
		ItemNo = itemNo;
		UnitofMeasureCode = unitofMeasureCode;
		EDILocationCode = eDILocationCode;
		LocationCode = locationCode;
		QtytoShip = qtytoShip;
		QtytoShipBase = qtytoShipBase;
		ReasonCode = reasonCode;
		EANCode = eANCode;
		VLCode = vLCode;
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


	public String getExternalDocumentNo() {
		return ExternalDocumentNo;
	}


	public void setExternalDocumentNo(String externalDocumentNo) {
		ExternalDocumentNo = externalDocumentNo;
	}


	public Double getPackageTrackingNo() {
		return PackageTrackingNo;
	}


	public void setPackageTrackingNo(Double packageTrackingNo) {
		PackageTrackingNo = packageTrackingNo;
	}


	public LocalDateTime getShipmentDate() {
		return ShipmentDate;
	}


	public void setShipmentDate(LocalDateTime shipmentDate) {
		ShipmentDate = shipmentDate;
	}


	public String getSelltoCustomerNo() {
		return SelltoCustomerNo;
	}


	public void setSelltoCustomerNo(String selltoCustomerNo) {
		SelltoCustomerNo = selltoCustomerNo;
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


	public Double getEDISelltoCustomerNo() {
		return EDISelltoCustomerNo;
	}


	public void setEDISelltoCustomerNo(Double eDISelltoCustomerNo) {
		EDISelltoCustomerNo = eDISelltoCustomerNo;
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


	public Double getTNOPAL() {
		return TNOPAL;
	}


	public void setTNOPAL(Double tNOPAL) {
		TNOPAL = tNOPAL;
	}


	@Override
	public String toString() {
		return "SCE_RC_SHIPMENT [MESSAGE_ID=" + MESSAGE_ID + ", WHSEID=" + WHSEID + ", DocumentNo=" + DocumentNo
				+ ", ExternalDocumentNo=" + ExternalDocumentNo + ", PackageTrackingNo=" + PackageTrackingNo
				+ ", ShipmentDate=" + ShipmentDate + ", SelltoCustomerNo=" + SelltoCustomerNo + ", ShippingAgentCode="
				+ ShippingAgentCode + ", TransportMethod=" + TransportMethod + ", Distance=" + Distance
				+ ", VehicleType=" + VehicleType + ", VehicleNo=" + VehicleNo + ", EDISelltoCustomerNo="
				+ EDISelltoCustomerNo + ", Line_No=" + Line_No + ", ItemNo=" + ItemNo + ", UnitofMeasureCode="
				+ UnitofMeasureCode + ", EDILocationCode=" + EDILocationCode + ", LocationCode=" + LocationCode
				+ ", QtytoShip=" + QtytoShip + ", QtytoShipBase=" + QtytoShipBase + ", ReasonCode=" + ReasonCode
				+ ", EANCode=" + EANCode + ", VLCode=" + VLCode + ", QtyperUnitofMeasure=" + QtyperUnitofMeasure
				+ ", Quantity=" + Quantity + ", QuantityBase=" + QuantityBase + ", ExpirationDate=" + ExpirationDate
				+ ", LotNo=" + LotNo + ", QualityStatus=" + QualityStatus + ", PHRStatus=" + PHRStatus + ", RDD=" + RDD
				+ ", ManufacturingDate=" + ManufacturingDate + ", TNOPAL=" + TNOPAL + "]";
	}
}
