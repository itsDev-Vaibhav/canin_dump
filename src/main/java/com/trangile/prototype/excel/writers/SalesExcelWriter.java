package com.trangile.prototype.excel.writers;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.trangile.prototype.dto.SalesDto;

public class SalesExcelWriter {
	
	private XSSFWorkbook workbook;
	List<SalesDto> salesData;
    private XSSFSheet sheet;


	public SalesExcelWriter(XSSFWorkbook workbook, List<SalesDto> salesData) {
		this.workbook = workbook;
		this.salesData = salesData;
	}

	public void writeHeaderLine() {
        sheet = workbook.createSheet("Sale Data");
        Row row = sheet.createRow(0);
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
        createCell(row, 0, "Creation Date", style);      
        createCell(row, 1, "Item No.", style);
        createCell(row, 2, "Description", style);
        createCell(row, 3, "Quantity", style);       
        createCell(row, 4, "Manufacturing Lot No.", style);    
        createCell(row, 5, "Expiration Date", style);
        createCell(row, 6, "TNOPAL", style);
        createCell(row, 7, "Lot No.", style);
        createCell(row, 8, "Manufacturing Date", style);
        createCell(row, 9, "Location Code", style);
        createCell(row, 10, "RDD2", style);
        createCell(row, 11, "Quality Status", style);
        createCell(row, 12, "Source Sub Type", style);
        createCell(row, 13, "Source ID", style);
        createCell(row, 14, "Sell-to Customer No.", style);
        createCell(row, 15, "Sell-to Customer Name", style);
        writeDataLines();
    }
	
	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Number) {
        	if(value instanceof Integer) {
        		cell.setCellValue((Integer) value);
        	} else {
        		cell.setCellValue((Double) value);
        	}
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
	
	public void writeDataLines() {
        int rowCount = 1;
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(10);
        style.setFont(font);       
        for (SalesDto sales : salesData) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0; 
            createCell(row, columnCount++, nullString(sales.getCreationDate().toString()), style);
            createCell(row, columnCount++, nullString(sales.getItemNo()) , style);
            createCell(row, columnCount++, nullString(sales.getDescription()), style);
            createCell(row, columnCount++, sales.getQtytoShipBase(), style);
            createCell(row, columnCount++, nullString(sales.getLotNo()), style);
            createCell(row, columnCount++, nullString(sales.getExpirationDate().toString()), style);
            createCell(row, columnCount++, nullString(sales.getTNOPAL()), style);
            createCell(row, columnCount++, nullString(sales.getTNOPAL()), style);
            createCell(row, columnCount++, nullString(sales.getManufacturingDate().toString()), style);
            createCell(row, columnCount++, nullString(sales.getLocationCode()), style);
            createCell(row, columnCount++, nullString(sales.getRDD()), style);
            createCell(row, columnCount++, nullString(sales.getQualityStatus()), style);
            createCell(row, columnCount++, nullString(sales.getSourceSubType()), style);
            createCell(row, columnCount++, nullString(sales.getDocumentNo()), style);
            createCell(row, columnCount++, nullString(sales.getSelltoCustomerNo()), style);
            createCell(row, columnCount++, nullString(sales.getSelltoCustomerName()), style);
        }
    }
	
	
	
	private String nullString(String t) {
		return t == null ? "": t;
	}

}
