package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.entity.SCE_RC_GRN_NONBOND;
import com.trangile.prototype.dto.PurchaseDto;
import com.trangile.prototype.dto.SearchForm;


@Component
public class GRNDataService {
	
	@Autowired
	private GRNService grn_service;
	
	@Autowired
	private GRNNonBoundService grn_non_bound_service;
	
	
	List<PurchaseDto> purchaseList = null;


	public GRNDataService() {
		
	}


	public List<PurchaseDto> getPurchaseList(SearchForm form) {
		if(form.getSku().length() != 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() != 0) {
			convertToPurchaseList(grn_service.getResultByItemANDLotANDTnopal(form.getSku(), form.getBatchNo(), form.getSscNo()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultByItemANDLotANDTnopal(form.getSku(), form.getBatchNo(), form.getSscNo()));
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() == 0) {
			convertToPurchaseList(grn_service.getResultByItemANDLot(form.getSku(), form.getBatchNo()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultByItemANDLot(form.getSku(), form.getBatchNo()));
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() != 0) {
			convertToPurchaseList(grn_service.getResultByItemANDTnopal(form.getSku(), form.getSscNo()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultByItemANDTnopal(form.getSku(), form.getSscNo()));
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() != 0) {
			convertToPurchaseList(grn_service.getResultByLotANDTnopal(form.getBatchNo(), form.getSscNo()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultByLotANDTnopal(form.getBatchNo(), form.getSscNo()));
		} else if (form.getSku().length() != 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() == 0) {
			convertToPurchaseList(grn_service.getResultByItem(form.getSku()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultByItem(form.getSku()));
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() != 0 && form.getSscNo().length() == 0) {
			convertToPurchaseList(grn_service.getResultByLot(form.getBatchNo()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultByLot(form.getBatchNo()));
		} else if (form.getSku().length() == 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() != 0) {
			convertToPurchaseList(grn_service.getResultBytnoPal(form.getSscNo()));
			convertToNonBoundPurchaseList(grn_non_bound_service.getResultBytnoPal(form.getSscNo()));
		}
		return this.purchaseList;
	}


	private void convertToNonBoundPurchaseList(List<SCE_RC_GRN_NONBOND> resultByItem) {
		for (SCE_RC_GRN_NONBOND sce_RC_GRN_NON : resultByItem) {
			PurchaseDto dto = new PurchaseDto();
			BeanUtils.copyProperties(sce_RC_GRN_NON, dto);
			dto.setCreationDate(sce_RC_GRN_NON.getReceiptDate());
			this.purchaseList.add(dto);
		}
		
	}


	private void convertToPurchaseList(List<SCE_RC_GRN> resultByItem) {
		this.purchaseList = new ArrayList<>();
		for (SCE_RC_GRN sce_RC_GRN : resultByItem) {
			PurchaseDto dto = new PurchaseDto();
			BeanUtils.copyProperties(sce_RC_GRN, dto);
			dto.setCreationDate(sce_RC_GRN.getOrderDate());
			this.purchaseList.add(dto);
		}
	}
}
