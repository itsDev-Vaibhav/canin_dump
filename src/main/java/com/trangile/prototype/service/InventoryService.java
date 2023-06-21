package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;
import com.trangile.prototype.dbo.repository.SCE_RC_STOCK_ADJ_Repo;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class InventoryService {
	
	@Autowired
	private SCE_RC_STOCK_ADJ_Repo repo;
	
	
	public List<SCE_RC_STOCK_ADJ> getResultByItem(String sku) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItem(sku);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByLot(String lot) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByLotNo(lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultBytnoPal(String tnopal) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByTNOPAL(tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByItemANDLot(String sku, String lot) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItemANDLotNo(sku, lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByItemANDTnopal(String sku, String tnopal) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItemANDTNOPAL(sku, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByLotANDTnopal(String lot, String tnopal) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByLotNoANDTNOPAL(lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_STOCK_ADJ> getResultByItemANDLotANDTnopal(String item, String lot, String tnopal) {
		List<SCE_RC_STOCK_ADJ> list = repo.findAllByItemANDLotNoANDTNOPAL(item, lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}

}
