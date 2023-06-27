package com.trangile.prototype.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.entity.SCE_RC_GRN_NONBOND;
import com.trangile.prototype.dto.PurchaseDto;
import com.trangile.prototype.dto.SearchForm;


@Component
public class GRNDataService {
	
	final static Logger logger = LoggerFactory.getLogger(GRNDataService.class);
	
	@Autowired
	private GRNService grn_service;
	
	@Autowired
	private GRNNonBoundService grn_non_bound_service;
	
	
	List<PurchaseDto> purchaseList = null;


	public GRNDataService() {
		
	}


	public List<PurchaseDto> getPurchaseList(SearchForm form) {
		logger.info("Inside getPurchaseList()");
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
		logger.info("Returning from getPurchaseList()");
		return this.purchaseList;
	}


	private void convertToNonBoundPurchaseList(List<SCE_RC_GRN_NONBOND> resultByItem) {
		for (SCE_RC_GRN_NONBOND sce_RC_GRN_NON : resultByItem) {
			PurchaseDto dtoNON = new PurchaseDto();
			dtoNON.setCreationDate(sce_RC_GRN_NON.getReceiptDate());
			dtoNON.setItemNo(sce_RC_GRN_NON.getItemNo());
			dtoNON.setDescription(sce_RC_GRN_NON.getDescription());
			dtoNON.setQuantityBase(Double.valueOf(sce_RC_GRN_NON.getQuantityBase()));
			dtoNON.setLotNo(sce_RC_GRN_NON.getLotNo());
			dtoNON.setExpirationDate(sce_RC_GRN_NON.getExpirationDate());
			dtoNON.setTNOPAL(sce_RC_GRN_NON.getTNOPAL());
			dtoNON.setManufacturingLotNo(sce_RC_GRN_NON.getManufacturingLotNo());
			dtoNON.setLocationCode(sce_RC_GRN_NON.getTransfertoCode());
			dtoNON.setQualityStatus(sce_RC_GRN_NON.getQualityStatus());
			dtoNON.setSourceSubType(sce_RC_GRN_NON.getSourceSubType());
			dtoNON.setDocumentNo(sce_RC_GRN_NON.getDocumentNo());
			dtoNON.setWHSEID(sce_RC_GRN_NON.getWHSEID());
			this.purchaseList.add(dtoNON);
		}
		
	}


	private void convertToPurchaseList(List<SCE_RC_GRN> resultByItem) {
		this.purchaseList = new ArrayList<>();
		for (SCE_RC_GRN sce_RC_GRN : resultByItem) {
			PurchaseDto dto = new PurchaseDto();
			dto.setCreationDate(sce_RC_GRN.getOrderDate());
			dto.setItemNo(sce_RC_GRN.getItemNo());
			dto.setDescription(sce_RC_GRN.getDescription());
			dto.setQuantityBase(Double.valueOf(sce_RC_GRN.getQuantityBase()));
			dto.setLotNo(sce_RC_GRN.getLotNo());
			dto.setExpirationDate(sce_RC_GRN.getExpirationDate());
			dto.setTNOPAL(sce_RC_GRN.getTNOPAL());
			dto.setManufacturingLotNo(sce_RC_GRN.getManufacturingLotNo());
			dto.setLocationCode(sce_RC_GRN.getLocationCode());
			dto.setQualityStatus(sce_RC_GRN.getQualityStatus());
			dto.setSourceSubType(sce_RC_GRN.getSourceSubType());
			dto.setDocumentNo(sce_RC_GRN.getDocumentNo());
			dto.setWHSEID(sce_RC_GRN.getWHSEID());
			this.purchaseList.add(dto);
		}
	}
}
