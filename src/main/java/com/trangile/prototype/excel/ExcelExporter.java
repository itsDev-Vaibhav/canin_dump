package com.trangile.prototype.excel;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.trangile.prototype.dbo.entity.SCE_RC_GRN;

public class ExcelExporter {
	
	private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<SCE_RC_GRN> listItem;

	public ExcelExporter(List<SCE_RC_GRN> resultByItem) {
		this.listItem = resultByItem;
		workbook = new XSSFWorkbook();
	}
	
	
	private void writeHeaderLine() {
        sheet = workbook.createSheet("Purchase Data");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "Creation Date", style);      
        createCell(row, 1, "document No.", style);       
        createCell(row, 2, "Order Date", style);    
        createCell(row, 3, "Location Code", style);
        createCell(row, 4, "Item No.", style);
         
    }
	
	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
	
	private void writeDataLines() {
        int rowCount = 1;
 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(10);
        style.setFont(font);
                 
        for (SCE_RC_GRN user : listItem) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, user.getMESSAGE_ID(), style);
            createCell(row, columnCount++, user.getDocumentNo().toString(), style);
            createCell(row, columnCount++, user.getOrderDate().toString(), style);
            createCell(row, columnCount++, user.getLocationCode().toString(), style);
            createCell(row, columnCount++, String.format("%.0f",user.getItemNo()), style);
            
        }
    }


	public void export(HttpServletResponse response) throws IOException {
		writeHeaderLine();
        writeDataLines();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
	}


	

}
