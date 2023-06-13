package com.trangile.prototype.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.repository.SCE_RC_GRN_Repo;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class GRNService {
	
	@Autowired
	private SCE_RC_GRN_Repo repo;
	
	public List<SCE_RC_GRN> getResultByItem(String sku) {
		Double dsku = new Double(sku);
		List<SCE_RC_GRN> findByItem = repo.fetchByItemNo(dsku);
		if(findByItem.size() > 0) {
			return findByItem;
		}
		return null;
	}
	
	

}
