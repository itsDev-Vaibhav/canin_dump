package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.entity.SCE_RC_GRN_NONBOND;
import com.trangile.prototype.dto.PurchaseDto;


@Component
public class GRNDataService {
	
	@Autowired
	private GRNService grn_service;
	
	@Autowired
	private GRNNonBoundService grn_non_bound_service;
	
	
	List<PurchaseDto> purchaseList = null;


	public GRNDataService() {
		
	}


	public List<PurchaseDto> getPurchaseList(String sku) {
		convertToPurchaseList(grn_service.getResultByItem(sku));
		convertToNonBoundPurchaseList(grn_non_bound_service.getResultByItem(sku));
		return this.purchaseList;
	}


	private void convertToNonBoundPurchaseList(List<SCE_RC_GRN_NONBOND> resultByItem) {
		for (SCE_RC_GRN_NONBOND sce_RC_GRN : resultByItem) {
			PurchaseDto dto = new PurchaseDto();
			BeanUtils.copyProperties(sce_RC_GRN, dto);
			System.out.println("Non Bound: "+dto);
			this.purchaseList.add(dto);
		}
		
	}


	private void convertToPurchaseList(List<SCE_RC_GRN> resultByItem) {
		this.purchaseList = new ArrayList<>();
		for (SCE_RC_GRN sce_RC_GRN : resultByItem) {
			PurchaseDto dto = new PurchaseDto();
			BeanUtils.copyProperties(sce_RC_GRN, dto);
//			System.out.println(dto);
			this.purchaseList.add(dto);
		}
	}
}
