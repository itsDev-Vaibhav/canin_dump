package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;
import com.trangile.prototype.dbo.repository.SCE_RC_STOCK_ADJ_Repo;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class InventoryService {
	
	
	final static Logger logger = LoggerFactory.getLogger(InventoryService.class);

	
	@Autowired
	private SCE_RC_STOCK_ADJ_Repo repo;
	
	
	public List<SCE_RC_STOCK_ADJ> getResultByItem(String sku) {
		logger.info("Inside getResultByItem()");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItem(sku);
		if(list.size() > 0) {
			logger.info(list.toString());
			logger.info("Returning from getResultByItem(): " +list.size());
			return list;
		}
		logger.info("Returning from getResultByItem(): " +list.size());
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByLot(String lot) {
		logger.info("Inside getResultByLot(): ");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByLotNo(lot);
		if(list.size() > 0) {
			logger.info("Returning from getResultByLot(): "+list.size());
			return list;
		}
		logger.info("Returning from getResultByLot(): "+list.size());
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultBytnoPal(String tnopal) {
		logger.info("Inside getResultBytnoPal(): ");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByTNOPAL(tnopal);
		if(list.size() > 0) {
			logger.info("Returning from getResultBytnoPal(): "+list.size());
			return list;
		}
		logger.info("Returning from getResultBytnoPal(): "+list.size());
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByItemANDLot(String sku, String lot) {
		logger.info("Inside getResultByItemANDLot(): ");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItemANDLotNo(sku, lot);
		if(list.size() > 0) {
			logger.info("Returning from getResultByItemANDLot(): "+list.size());
			return list;
		}
		logger.info("Returning from getResultByItemANDLot(): "+list.size());
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByItemANDTnopal(String sku, String tnopal) {
		logger.info("Inside getResultByItemANDTnopal(): ");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItemANDTNOPAL(sku, tnopal);
		if(list.size() > 0) {
			logger.info("Returning from getResultByItemANDTnopal(): "+list.size());
			return list;
		}
		logger.info("Returning from getResultByItemANDTnopal(): "+list.size());
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByLotANDTnopal(String lot, String tnopal) {
		logger.info("Inside getResultByLotANDTnopal(): ");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByLotNoANDTNOPAL(lot, tnopal);
		if(list.size() > 0) {
			logger.info("Returing from getResultByLotANDTnopal(): "+list.size());
			return list;
		}
		logger.info("Returing from getResultByLotANDTnopal(): "+list.size());
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByItemANDLotANDTnopal(String item, String lot, String tnopal) {
		logger.info("Inside getResultByItemANDLotANDTnopal(): ");
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItemANDLotNoANDTNOPAL(item, lot, tnopal);
		if(list.size() > 0) {
			logger.info("Returning from getResultByItemANDLotANDTnopal(): "+list.size());
			return list;
		}
		logger.info("Returning from getResultByItemANDLotANDTnopal(): "+list.size());
		return new ArrayList<>();
	}

}
