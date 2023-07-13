package com.trangile.prototype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.prototype.dbo.repository.UCBInventoryRepo;
import com.trangile.prototype.dbo.repository.RC_CHECK_BATCH_NUMBER_Repo;
import com.trangile.prototype.dbo.repository.RC_CHECK_ITEM_NUMBER_Repo;
import com.trangile.prototype.dbo.repository.RC_CHECK_TNOPAL_Repo;

@Component
public class CountService {
	
	@Autowired
	private RC_CHECK_ITEM_NUMBER_Repo irepo;
	
	@Autowired
	private RC_CHECK_BATCH_NUMBER_Repo brepo;
	
	@Autowired
	private RC_CHECK_TNOPAL_Repo trepo;
	
	@Autowired
	private UCBInventoryRepo inventoryrepo;

	
	
	public Long getItemCount(String sku) {
		return irepo.countItem(sku);
	}



	public Long getLotCount(String batchNo) {
		return brepo.countLot(batchNo);
	}



	public Long getTNOPALCount(String sscNo) {
		return trepo.countTnoPAL(sscNo);
	}



//	public Long getOwnerCount(String value) {
//		return inventoryrepo.getCount(value);
//	}
//	

}
