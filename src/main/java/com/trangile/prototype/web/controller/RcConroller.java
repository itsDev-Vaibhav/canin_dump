package com.trangile.prototype.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
import com.trangile.prototype.service.GRNDataService;
import com.trangile.prototype.service.InventoryDataService;
import com.trangile.prototype.service.ShipmentDataService;

@CrossOrigin("*")
@Controller
@RequestMapping(value = "/rc")
public class RcConroller {
	
	@Autowired
	private GRNDataService grnService;
	
	@Autowired
	private ShipmentDataService shipService;
	
	@Autowired
	private InventoryDataService invenService;
	
	@PostMapping(value = "/search")
	public String getSearchResult(Model model, SearchForm form, HttpServletResponse response) throws IOException {
		if (form.getSku().length() == 0 && form.getBatchNo().length() == 0 && form.getSscNo().length() == 0) {
			model.addAttribute("message", "Please Enter atleast one value.");
			return "welcome";
		} else {
			model.addAttribute("searchForm", form);
			model.addAttribute("message", "File is being downloaded.");
			List<PurchaseDto> purchaseList = grnService.getPurchaseList(form);
			List<SalesDto> salesList = shipService.getSalesList(form);
			List<SCE_RC_STOCK_ADJ> inventoryList = invenService.getInventoryList(form);
			ExcelExporter excelExporter = new ExcelExporter();
			excelExporter.export(response, purchaseList, salesList, inventoryList);
			return null;
		}
	}
}
