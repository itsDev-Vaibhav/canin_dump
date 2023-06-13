package com.trangile.prototype.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;
import com.trangile.prototype.dto.SearchForm;
import com.trangile.prototype.excel.ExcelExporter;
import com.trangile.prototype.service.GRNService;
import com.trangile.prototype.service.ShipmentService;

@CrossOrigin("*")
@Controller
@RequestMapping(value = "/rc")
public class RcConroller {
	
	@Autowired
	private GRNService grnService;
	
	@Autowired
	private ShipmentService shipService;
	
	@PostMapping(value = "/search")
	public void getSearchResult(Model model, SearchForm form, HttpServletResponse response) throws IOException {
		System.out.println(form);
		List<SCE_RC_GRN> resultByItem = grnService.getResultByItem(form.getSku());
		List<SCE_RC_SHIPMENT> resultByItem2 = shipService.getResultByItem(form.getSku());
		System.out.println(resultByItem);
//		System.out.println(resultByItem2);
		
		response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=rc_" + currentDateTime + ".xlsx";
        ExcelExporter excelExporter = new ExcelExporter(resultByItem);
        model.addAttribute("message", "Excel File is being downloading.");
        response.setHeader(headerKey, headerValue);
        excelExporter.export(response);
	}

}
