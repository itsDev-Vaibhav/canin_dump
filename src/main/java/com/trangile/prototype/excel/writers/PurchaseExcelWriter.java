package com.trangile.prototype.excel.writers;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.trangile.prototype.dto.PurchaseDto;

public class PurchaseExcelWriter {
	
	private XSSFWorkbook workbook;
	List<PurchaseDto> purchaseData;
    private XSSFSheet sheet;

	public PurchaseExcelWriter(XSSFWorkbook workbook, List<PurchaseDto> purchaseData) {
		this.workbook = workbook;
		this.purchaseData = purchaseData;
	}

	public void writeHeaderLine() {
        sheet = workbook.createSheet("Purchase Data");
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
        createCell(row, 8, "Location Code", style);
        createCell(row, 9, "Quality Status", style);
        createCell(row, 10, "Source Sub Type", style);
        createCell(row, 11, "Source ID", style);
        createCell(row, 12, "Source Ref. No.", style);
        writeDataLines();
    }
	
	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
//        sheet.autoSizeColumn(columnCount);
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
	
	private void writeDataLines() {
        int rowCount = 1;
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(10);
        style.setFont(font);
        for (PurchaseDto grn_in : purchaseData) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
            createCell(row, columnCount++, nullString(grn_in.getCreationDate().toString()), style);
            createCell(row, columnCount++, nullString(grn_in.getItemNo()) , style);
            createCell(row, columnCount++, nullString(grn_in.getDescription()), style);
            createCell(row, columnCount++, grn_in.getQuantityBase(), style);
            createCell(row, columnCount++, nullString(grn_in.getLotNo()), style);
            createCell(row, columnCount++, nullString(grn_in.getExpirationDate().toString()), style);
            createCell(row, columnCount++, nullString(grn_in.getTNOPAL()), style);
            createCell(row, columnCount++, nullString(grn_in.getTNOPAL()), style);
            createCell(row, columnCount++, nullString(grn_in.getLocationCode()), style);
            createCell(row, columnCount++, nullString(grn_in.getQualityStatus()), style);
            createCell(row, columnCount++, nullString(grn_in.getSourceSubType()), style);
            createCell(row, columnCount++, nullString(grn_in.getDocumentNo()), style);
            createCell(row, columnCount++, nullString(grn_in.getWHSEID()), style);
        }
    }

	private String nullString(String t) {
		return t == null ? "": t;
	}


}
