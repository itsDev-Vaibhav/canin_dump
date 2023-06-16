package com.trangile.prototype.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;
import com.trangile.prototype.dto.PurchaseDto;
import com.trangile.prototype.dto.SearchForm;
import com.trangile.prototype.excel.ExcelExporter;
import com.trangile.prototype.service.GRNDataService;

@CrossOrigin("*")
@Controller
@RequestMapping(value = "/rc")
public class RcConroller {
	
	@Autowired
	private GRNDataService grnService;
	
	@PostMapping(value = "/search")
	public void getSearchResult(Model model, SearchForm form, HttpServletResponse response) throws IOException {
		
		List<PurchaseDto> purchaseList = grnService.getPurchaseList(form.getSku());
		
//		
//		List<SCE_RC_GRN> resultByItem = grnService.getResultByItem(form.getSku());
		List<SCE_RC_SHIPMENT> resultByItem2 = new ArrayList<>();
//		System.out.println(resultByItem);
//		System.out.println(resultByItem2);
		ExcelExporter excelExporter = new ExcelExporter();
		excelExporter.export(response, purchaseList, resultByItem2);
	}
}
