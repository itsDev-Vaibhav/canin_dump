package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;
import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT_TRF;
import com.trangile.prototype.dto.SalesDto;
import com.trangile.prototype.dto.SearchForm;

@Component
public class ShipmentDataService {
	
	final static Logger logger = LoggerFactory.getLogger(ShipmentDataService.class);

	
	@Autowired
	private ShipmentService shipmentService;
	
	
	@Autowired
	private SCE_RC_SHIPMENT_TRF_SERVICE shipmentTRFService;
	
	List<SalesDto> salesList = null;
	
	public List<SalesDto> getSalesList(SearchForm form) {
		logger.info("Inside getSalesList(): ");
		if(form.getSku().length() != 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() != 0) {
			convertToSalesList(shipmentService.getResultByItemANDLotANDTnopal(form.getSku(), form.getBatchNo(), form.getSscNo()));
			convertToSalesListTRF(shipmentTRFService.getResultByItemANDLotANDTnopal(form.getSku(), form.getBatchNo(), form.getSscNo()));
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() == 0) {
			convertToSalesList(shipmentService.getResultByItemANDLot(form.getSku(), form.getBatchNo()));
			convertToSalesListTRF(shipmentTRFService.getResultByItemANDLot(form.getSku(), form.getBatchNo()));
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() != 0) {
			convertToSalesList(shipmentService.getResultByItemANDTnopal(form.getSku(), form.getSscNo()));
			convertToSalesListTRF(shipmentTRFService.getResultByItemANDTnopal(form.getSku(), form.getSscNo()));
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() != 0) {
			convertToSalesList(shipmentService.getResultByLotANDTnopal(form.getBatchNo(), form.getSscNo()));
			convertToSalesListTRF(shipmentTRFService.getResultByLotANDTnopal(form.getBatchNo(), form.getSscNo()));
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() == 0) {
			convertToSalesList(shipmentService.getResultByItem(form.getSku()));
			convertToSalesListTRF(shipmentTRFService.getResultByItem(form.getSku()));
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() == 0) {
			convertToSalesList(shipmentService.getResultByLot(form.getBatchNo()));
			convertToSalesListTRF(shipmentTRFService.getResultByLot(form.getBatchNo()));
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() != 0) {
			convertToSalesList(shipmentService.getResultBytnoPal(form.getSscNo()));
			convertToSalesListTRF(shipmentTRFService.getResultBytnoPal(form.getSscNo()));
		}
		logger.info("Returing from getSalesList(): ");
		return this.salesList;
	}


	private void convertToSalesListTRF(List<SCE_RC_SHIPMENT_TRF> resultByItemTRF) {
		for (SCE_RC_SHIPMENT_TRF shipment_TRF : resultByItemTRF) {
			SalesDto dtoTRF = new SalesDto();
			dtoTRF.setCreationDate(shipment_TRF.getShipmentDate());
			dtoTRF.setItemNo(shipment_TRF.getItemNo());
			dtoTRF.setDescription(shipment_TRF.getDescription());
			dtoTRF.setQtytoShipBase(shipment_TRF.getQtytoShipBase() * -1);
			dtoTRF.setLotNo(shipment_TRF.getLotNo());
			dtoTRF.setExpirationDate(shipment_TRF.getExpirationDate());
			dtoTRF.setTNOPAL(shipment_TRF.getTNOPAL());
			dtoTRF.setManufacturingLotNo(shipment_TRF.getManufacturingLotNo());
			dtoTRF.setManufacturingDate(shipment_TRF.getManufacturingDate());
			dtoTRF.setLocationCode(shipment_TRF.getTransfer_fromCode());
			dtoTRF.setRDD(shipment_TRF.getRDD());
			dtoTRF.setQualityStatus(shipment_TRF.getQualityStatus());
			dtoTRF.setSourceSubType(shipment_TRF.getSourceSubType());
			dtoTRF.setDocumentNo(shipment_TRF.getDocumentNo());
			dtoTRF.setSelltoCustomerNo(shipment_TRF.getTransfer_toCode());
			dtoTRF.setSelltoCustomerName(shipment_TRF.getSelltoCustomerName());
			this.salesList.add(dtoTRF);
		}
	}


	private void convertToSalesList(List<SCE_RC_SHIPMENT> resultByItemShip) {
		this.salesList = new ArrayList<>();
		for (SCE_RC_SHIPMENT shipment : resultByItemShip) {
			SalesDto sdto = new SalesDto();
			sdto.setCreationDate(shipment.getShipmentDate());
			sdto.setItemNo(shipment.getItemNo());
			sdto.setDescription(shipment.getDescription());
			sdto.setQtytoShipBase(shipment.getQtytoShipBase() * -1);
			sdto.setLotNo(shipment.getLotNo());
			sdto.setExpirationDate(shipment.getExpirationDate());
			sdto.setTNOPAL(shipment.getTNOPAL());
			sdto.setManufacturingLotNo(shipment.getManufacturingLotNo());
			sdto.setManufacturingDate(shipment.getManufacturingDate());
			sdto.setLocationCode(shipment.getLocationCode());
			sdto.setRDD(shipment.getRDD());
			sdto.setQualityStatus(shipment.getQualityStatus());
			sdto.setSourceSubType(shipment.getSourceSubType());
			sdto.setDocumentNo(shipment.getDocumentNo());
			sdto.setSelltoCustomerNo(shipment.getSelltoCustomerNo());
			sdto.setSelltoCustomerName(shipment.getSelltoCustomerName());
			this.salesList.add(sdto);
		}
	}
}
