package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;
import com.trangile.prototype.dto.SearchForm;

@Component
public class InventoryDataService {
	
	
	final static Logger logger = LoggerFactory.getLogger(InventoryDataService.class);

	
	@Autowired
	private InventoryService invService;
	
	
	
	public List<SCE_RC_STOCK_ADJ> getInventoryList(SearchForm form) {
		logger.info("Inside getInventoryList(): ");
		if(form.getSku().length() != 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() != 0) {
			return invService.getResultByItemANDLotANDTnopal(form.getSku(), form.getBatchNo(), form.getSscNo());
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() == 0) {
			return invService.getResultByItemANDLot(form.getSku(), form.getBatchNo());
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() != 0) {
			return invService.getResultByItemANDTnopal(form.getSku(), form.getSscNo());
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() != 0) {
			return invService.getResultByLotANDTnopal(form.getBatchNo(), form.getSscNo());
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() == 0) {
			return invService.getResultByItem(form.getSku());
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() == 0) {
			return invService.getResultByLot(form.getBatchNo());
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() != 0) {
			return invService.getResultBytnoPal(form.getSscNo());
		}
		logger.info("Returning getInventoryList(): ");
		return new ArrayList<>();
	}


}
