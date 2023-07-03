package com.trangile.prototype.excel.writers;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.trangile.prototype.dbo.entity.SCE_RC_STOCK_ADJ;

public class InventoryExcelWriter {
	
	
	private XSSFWorkbook workbook;
	List<SCE_RC_STOCK_ADJ> inventoryData;
    private XSSFSheet sheet;
	
	public InventoryExcelWriter(XSSFWorkbook workbook, List<SCE_RC_STOCK_ADJ> inventoryList) {
		this.workbook = workbook;
		this.inventoryData = inventoryList;
	}
	
	public void writeHeaderLine() {
        sheet = workbook.createSheet("Inventory Adjustment");
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
        createCell(row, 10, "Quality Status", style);
        createCell(row, 11, "Source Sub Type", style);
        createCell(row, 12, "Source ID", style);
        createCell(row, 13, "Source Ref. No.", style);
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
        for (SCE_RC_STOCK_ADJ stockADJ : inventoryData) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0; 
            createCell(row, columnCount++, nullString(stockADJ.getPostingDate().toString()), style);
            createCell(row, columnCount++, nullString(stockADJ.getItemNo()), style);
            createCell(row, columnCount++, nullString(stockADJ.getDescription()), style);
            createCell(row, columnCount++, stockADJ.getQuantityBase(), style);
            createCell(row, columnCount++, nullString(stockADJ.getLotNo()), style);
            createCell(row, columnCount++, nullString(stockADJ.getExpirationDate().toString()), style);
            createCell(row, columnCount++, nullString(stockADJ.getTNOPAL()), style);
            createCell(row, columnCount++, nullString(stockADJ.getTNOPAL()), style);
            createCell(row, columnCount++, nullString(stockADJ.getManufacturingDate().toString()), style);
            createCell(row, columnCount++, nullString(stockADJ.getLocationCode()), style);
            createCell(row, columnCount++, nullString(stockADJ.getQualityStatus()), style);
            createCell(row, columnCount++, nullString(stockADJ.getReasonCode()), style);
            createCell(row, columnCount++, nullString(stockADJ.getSourceSubType()), style);
            createCell(row, columnCount++, nullString(stockADJ.getWHSEID()), style);
        }
    }
	
	
	private String nullString(String t) {
		return t == null ? "": t;
	}


}
