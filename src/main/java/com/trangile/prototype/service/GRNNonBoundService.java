package com.trangile.prototype.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN_NONBOND;
import com.trangile.prototype.dbo.repository.SCE_RC_GRN_NONBOND_Repo;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class GRNNonBoundService {
	
	
	
	@Autowired
	private SCE_RC_GRN_NONBOND_Repo repo;
	
	public List<SCE_RC_GRN_NONBOND> getResultByItem(String sku) {
		List<SCE_RC_GRN_NONBOND> findByItem = repo.fetchByItemNo(sku);
		if(findByItem.size() > 0) {
			return findByItem;
		}
		return null;
	}	


}
