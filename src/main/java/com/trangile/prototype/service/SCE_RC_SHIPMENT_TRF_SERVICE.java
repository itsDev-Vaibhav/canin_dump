package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT_TRF;
import com.trangile.prototype.dbo.repository.SCE_RC_SHIPMENT_TRF_Repo;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class SCE_RC_SHIPMENT_TRF_SERVICE {
	
	
	@Autowired
	private SCE_RC_SHIPMENT_TRF_Repo repo;
	
	
	public List<SCE_RC_SHIPMENT_TRF> getResultByItem(String sku) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByItem(sku);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT_TRF> getResultByLot(String lot) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByLotNo(lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT_TRF> getResultBytnoPal(String tnopal) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByTNOPAL(tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT_TRF> getResultByItemANDLot(String sku, String lot) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByItemANDLotNo(sku, lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT_TRF> getResultByItemANDTnopal(String sku, String tnopal) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByItemANDTNOPAL(sku, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT_TRF> getResultByLotANDTnopal(String lot, String tnopal) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByLotNoANDTNOPAL(lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT_TRF> getResultByItemANDLotANDTnopal(String item, String lot, String tnopal) {
		List<SCE_RC_SHIPMENT_TRF> list = repo.findAllByItemANDLotNoANDTNOPAL(item, lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}

	

}
