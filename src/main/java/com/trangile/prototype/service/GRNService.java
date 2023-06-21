package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.repository.SCE_RC_GRN_Repo;

@Service
@Configurable
@Transactional(transactionManager="ordersTransactionManager")
public class GRNService {
	
	@Autowired
	private SCE_RC_GRN_Repo repo;
	
	public List<SCE_RC_GRN> getResultByItem(String sku) {
		List<SCE_RC_GRN> list = repo.findAllByItem(sku);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN> getResultByLot(String lot) {
		List<SCE_RC_GRN> list = repo.findAllByLotNo(lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN> getResultBytnoPal(String tnopal) {
		List<SCE_RC_GRN> list = repo.findAllByTNOPAL(tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN> getResultByItemANDLot(String sku, String lot) {
		List<SCE_RC_GRN> list = repo.findAllByItemANDLotNo(sku, lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN> getResultByItemANDTnopal(String sku, String tnopal) {
		List<SCE_RC_GRN> list = repo.findAllByItemANDTNOPAL(sku, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN> getResultByLotANDTnopal(String lot, String tnopal) {
		List<SCE_RC_GRN> list = repo.findAllByLotNoANDTNOPAL(lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_GRN> getResultByItemANDLotANDTnopal(String item, String lot, String tnopal) {
		List<SCE_RC_GRN> list = repo.findAllByItemANDLotNoANDTNOPAL(item, lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}

}
