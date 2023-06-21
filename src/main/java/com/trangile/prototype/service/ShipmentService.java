package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;
import com.trangile.prototype.dbo.repository.SCE_RC_SHIPMENT_Repo;

@Service
@Transactional(transactionManager="ordersTransactionManager")
public class ShipmentService {
	
	@Autowired
	private SCE_RC_SHIPMENT_Repo repo;
	
	
	public List<SCE_RC_SHIPMENT> getResultByItem(String sku) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByItem(sku);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT> getResultByLot(String lot) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByLotNo(lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT> getResultBytnoPal(String tnopal) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByTNOPAL(tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT> getResultByItemANDLot(String sku, String lot) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByItemANDLotNo(sku, lot);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT> getResultByItemANDTnopal(String sku, String tnopal) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByItemANDTNOPAL(sku, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT> getResultByLotANDTnopal(String lot, String tnopal) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByLotNoANDTNOPAL(lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}
	
	public List<SCE_RC_SHIPMENT> getResultByItemANDLotANDTnopal(String item, String lot, String tnopal) {
		List<SCE_RC_SHIPMENT> list = repo.findAllByItemANDLotNoANDTNOPAL(item, lot, tnopal);
		if(list.size() > 0) {
			return list;
		}
		return new ArrayList<>();
	}

	
	

}