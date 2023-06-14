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
	
	public InventoryExcelWriter(XSSFWorkbook workbook, List<SCE_RC_STOCK_ADJ> inventoryData) {
		this.workbook = workbook;
		this.inventoryData = inventoryData;
	}
	
	public void writeHeaderLine() {
        sheet = workbook.createSheet("Inventory");
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
        createCell(row, 4, "Lot No.", style);    
        createCell(row, 5, "Expiration Date", style);
        createCell(row, 6, "TNOPAL", style);
        createCell(row, 7, "Manufacturing Lot No.", style);
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
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
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
        for (SCE_RC_STOCK_ADJ user : inventoryData) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0; 
            createCell(row, columnCount++, user.getMESSAGE_ID(), style);
            createCell(row, columnCount++, user.getDocumentNo().toString(), style);
            createCell(row, columnCount++, String.format("%.0f",user.getEDILocationCode()), style);
            createCell(row, columnCount++, user.getLocationCode().toString(), style);
            createCell(row, columnCount++, String.format("%.0f",user.getItemNo()), style);
        }
    }


}
