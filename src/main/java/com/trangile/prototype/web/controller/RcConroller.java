package com.trangile.prototype.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;
import com.trangile.prototype.dto.PurchaseDto;
import com.trangile.prototype.dto.SalesDto;
import com.trangile.prototype.dto.SearchForm;
import com.trangile.prototype.excel.ExcelExporter;
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
	
//	@PostMapping(value = "/search")
//	public String getSearchResult(Model model, SearchForm form, HttpServletResponse response) throws IOException {
//		logger.info("Inside RcController getSearchResult + " + form);
//		ExcelExporter excelExporter = new ExcelExporter();
//		if(form.getSku().length() > 0 || form.getBatchNo().length() > 0 || form.getSscNo().length() > 0) {
//			if (form.getSku().length() > 0 & form.getBatchNo().length() > 0 & form.getSscNo().length() > 0) {
//				Long itemCount = cService.getItemCount(form.getSku());
//				Long lotCount = cService.getLotCount(form.getBatchNo());
//				Long tnopalCount = cService.getTNOPALCount(form.getSscNo());
//				if(itemCount > 0 & lotCount > 0 & tnopalCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (itemCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Item not found in the database: " + form.getSku());
//					logger.error("Item not found in the database: " + form.getSku());
//					return "welcome";
//				} else if (lotCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Batch Number not found in the database: " + form.getBatchNo());
//					logger.error("Batch Number not found in the database: " + form.getBatchNo());
//					return "welcome";
//				} else if (tnopalCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "SSCC not found in the database: " + form.getSscNo());
//					logger.error("SSCC not found in the database: " + form.getSscNo());
//					return "welcome";
//				}
//			}
//			if (form.getSku().length() > 0 & form.getBatchNo().length() > 0 & form.getSscNo().length() <= 0) {
//				Long itemCount = cService.getItemCount(form.getSku());
//				Long lotCount = cService.getLotCount(form.getBatchNo());
//				if(itemCount > 0 & lotCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (itemCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Item not found in the database: " + form.getSku());
//					logger.error("Item not found in the database: " + form.getSku());
//					return "welcome";
//				} else if (lotCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Batch Number not found in the database: " + form.getBatchNo());
//					logger.error("Batch Number not found in the database: " + form.getBatchNo());
//					return "welcome";
//				}
//			}
//			if (form.getSku().length() > 0 & form.getBatchNo().length() <= 0 & form.getSscNo().length() > 0) {
//				Long itemCount = cService.getItemCount(form.getSku());
//				Long tnopalCount = cService.getTNOPALCount(form.getSscNo());
//				if(itemCount > 0 & tnopalCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (itemCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Item not found in the database: " + form.getSku());
//					logger.error("Item not found in the database: " + form.getSku());
//					return "welcome";
//				}  else if (tnopalCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "SSCC not found in the database: " + form.getSscNo());
//					logger.error("SSCC not found in the database: " + form.getSscNo());
//					return "welcome";
//				}
//			}
//			if (form.getSku().length() <= 0 & form.getBatchNo().length() > 0 & form.getSscNo().length() > 0) {
//				Long lotCount = cService.getLotCount(form.getBatchNo());
//				Long tnopalCount = cService.getTNOPALCount(form.getSscNo());
//				if(lotCount > 0 & tnopalCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (lotCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Batch not found in the database: " + form.getBatchNo());
//					logger.error("Batch not found in the database: " + form.getBatchNo());
//					return "welcome";
//				}  else if (tnopalCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "SSCC not found in the database: " + form.getSscNo());
//					logger.error("SSCC not found in the database: " + form.getSscNo());
//					return "welcome";
//				}
//			}
//			if (form.getSku().length() > 0 & form.getBatchNo().length() <= 0 & form.getSscNo().length() <= 0) {
//				Long itemCount = cService.getItemCount(form.getSku());
//				if(itemCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (itemCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Item not found in the database: " + form.getSku());
//					logger.error("Item not found in the database: " + form.getSku());
//					return "welcome";
//				}  
//			}
//			if (form.getSku().length() <= 0 & form.getBatchNo().length() > 0 & form.getSscNo().length() <= 0) {
//				Long lotCount = cService.getLotCount(form.getBatchNo());
//				if(lotCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (lotCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "Batch not found in the database: " + form.getBatchNo());
//					logger.error("Batch not found in the database.");
//					return "welcome";
//				}  
//			}
//			if (form.getSku().length() <= 0 & form.getBatchNo().length() <= 0 & form.getSscNo().length() > 0) {
//				Long tnopalCount = cService.getTNOPALCount(form.getSscNo());
//				if(tnopalCount > 0) {
//					List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
//					List<SalesDto> salesList = shipService.getSalesList(form);
//					List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
//					excelExporter.export(response, purchaseList, salesList, inventoryList);
//				} else if (tnopalCount <= 0) {
//					model.addAttribute("searchForm", new SearchForm());
//					model.addAttribute("message", "TNOPAL not found in the database: " + form.getSscNo());
//					logger.error("TNOPAL not found in the database: " + form.getSscNo());
//					return "welcome";
//				}  
//			}
//		} else 
//			model.addAttribute("searchForm", new SearchForm());
//			model.addAttribute("message", "Please Enter atleast one value.");
//			logger.error("Invalid fields for search.");
//			return "welcome";
//	}
	
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
}
