package com.trangile.prototype.excel;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;
import com.trangile.prototype.dbo.entity.SCE_RC_SHIPMENT;
import com.trangile.prototype.excel.writers.InventoryExcelWriter;
import com.trangile.prototype.excel.writers.PurchaseExcelWriter;
import com.trangile.prototype.excel.writers.SalesExcelWriter;

public class ExcelExporter {
	
	private XSSFWorkbook workbook;

	public ExcelExporter() {
		workbook = new XSSFWorkbook();
	}

	public void export(HttpServletResponse response, List<SCE_RC_GRN> purchaseData, List<SCE_RC_SHIPMENT> salesData) throws IOException {
		response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=royal_canin_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
		PurchaseExcelWriter pw = new PurchaseExcelWriter(workbook, purchaseData);
		pw.writeHeaderLine();
		SalesExcelWriter sw = new SalesExcelWriter(workbook, salesData);
		sw.writeHeaderLine();
		InventoryExcelWriter iw = new InventoryExcelWriter(workbook);
		iw.writeHeaderLine();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
	}


	

}
