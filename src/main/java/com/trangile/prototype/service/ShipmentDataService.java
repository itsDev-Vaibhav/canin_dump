package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
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


	private void convertToSalesListTRF(List<SCE_RC_SHIPMENT_TRF> resultByItem) {
		for (SCE_RC_SHIPMENT_TRF shipment : resultByItem) {
			SalesDto dto = new SalesDto();
			BeanUtils.copyProperties(shipment, dto);
			dto.setCreationDate(shipment.getShipmentDate());
			this.salesList.add(dto);
		}
	}


	private void convertToSalesList(List<SCE_RC_SHIPMENT> resultByItem) {
		this.salesList = new ArrayList<>();
		for (SCE_RC_SHIPMENT shipment : resultByItem) {
			SalesDto dto = new SalesDto();
			BeanUtils.copyProperties(shipment, dto);
			dto.setCreationDate(shipment.getShipmentDate());
			this.salesList.add(dto);
		}
	}
}
