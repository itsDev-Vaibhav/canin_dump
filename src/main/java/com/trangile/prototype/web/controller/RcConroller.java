package com.trangile.prototype.web.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;
import com.trangile.prototype.dbo.entity.UCBInventoryEntity;
import com.trangile.prototype.dbo.repository.UCBInventoryRepo;
import com.trangile.prototype.dto.PurchaseDto;
import com.trangile.prototype.dto.SalesDto;
import com.trangile.prototype.dto.SearchForm;
import com.trangile.prototype.dto.SearchInventoryDto;
import com.trangile.prototype.excel.ExcelExporter;
import com.trangile.prototype.excel.InventoryExcelExporter;
import com.trangile.prototype.service.CountService;
import com.trangile.prototype.service.GRNDataService;
import com.trangile.prototype.service.InventoryDataService;
import com.trangile.prototype.service.ShipmentDataService;

@CrossOrigin("*")
@Controller
@RequestMapping(value = "/rc")
public class RcConroller {
	
	final static Logger logger = LoggerFactory.getLogger(RcConroller.class);
	
	@Autowired
	private GRNDataService grnService;
	
	@Autowired
	private ShipmentDataService shipService;
	
	@Autowired
	private InventoryDataService invenService;
	
	@Autowired
	private CountService cService;
	
	@Autowired
	private UCBInventoryRepo inventoryRepo;
	
	
	@PostMapping(value = "/search")
	public void getSearchResult(Model model, SearchForm form, HttpServletResponse response) throws IOException {
		logger.info("Inside RcController getSearchResult + " + form);
		ExcelExporter excelExporter = new ExcelExporter();
		List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
		List<SalesDto> salesList = shipService.getSalesList(form);
		List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
		logger.info("Returning from RcController getSearchResult + " + form);
		excelExporter.export(response, purchaseList, salesList, inventoryList);
	}
	
	
	
	@PostMapping(value = "/searchInventory")
	public void getSearchInventoryResult(@ModelAttribute("ownerSearch") SearchInventoryDto form, HttpServletResponse response) throws IOException {
		logger.info("Inside RcController getSearchInventoryResult + " + form);
		InventoryExcelExporter excelInventoryExporter = new InventoryExcelExporter();
		String formValue = form.getOwner();
		List<UCBInventoryEntity> allRecords = null;
		LocalDateTime max = LocalDateTime.now();
		if (formValue.equalsIgnoreCase("UCB")) {
			allRecords = inventoryRepo.getAllRecords();
			max = inventoryRepo.max();
		}
		if (allRecords == null) {
			allRecords = new ArrayList<>();
		}
		logger.info("Returning from RcController getSearchInventoryResult + " + form);
		excelInventoryExporter.exportInventory(response, allRecords, max.toString());
	}
}
