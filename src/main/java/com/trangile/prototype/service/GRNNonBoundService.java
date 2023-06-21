package com.trangile.prototype.service;
import java.util.ArrayList;
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
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByItem(sku);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN_NONBOND> getResultByLot(String lot) {
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByLotNo(lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN_NONBOND> getResultBytnoPal(String tnopal) {
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByTNOPAL(tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN_NONBOND> getResultByItemANDLot(String sku, String lot) {
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByItemANDLotNo(sku, lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN_NONBOND> getResultByItemANDTnopal(String sku, String tnopal) {
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByItemANDTNOPAL(sku, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN_NONBOND> getResultByLotANDTnopal(String lot, String tnopal) {
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByLotNoANDTNOPAL(lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN_NONBOND> getResultByItemANDLotANDTnopal(String item, String lot, String tnopal) {
		List<SCE_RC_GRN_NONBOND> list = repo.findAllByItemANDLotNoANDTNOPAL(item, lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	


}
