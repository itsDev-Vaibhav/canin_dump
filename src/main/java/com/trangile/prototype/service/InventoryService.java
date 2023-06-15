package com.trangile.prototype.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class InventoryService {
	
	
//	public List<SCE_RC_STOCK_ADJ> getResultByItem(String sku) {
//		Double dsku = new Double(sku);
//		List<SCE_RC_SHIPMENT> findByItem = repo.fetchByItemNo(dsku);
//		if(findByItem.size() > 0) {
//			return findByItem;
//		}
//		return null;
//	}

}
