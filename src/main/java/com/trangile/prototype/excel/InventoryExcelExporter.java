package com.trangile.prototype.excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opencsv.CSVWriter;
import com.trangile.prototype.dbo.entity.UCBInventoryEntity;

public class InventoryExcelExporter {
	
	final static Logger logger = LoggerFactory.getLogger(InventoryExcelExporter.class);
	private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;
	
	private Workbook workbook;
	private Sheet sheet;
	//private static final int BATCH_SIZE = 1000;
	
//	@Autowired
//	private UCBInventoryRepo repo;

	public InventoryExcelExporter() {
		workbook = new SXSSFWorkbook();
	}

	public void exportInventory(HttpServletResponse response, List<UCBInventoryEntity> allRecords, String dateTime) throws IOException {
		logger.info("inside exportInventory with: " +allRecords.size());
		String[] classNames = allRecords.get(allRecords.size() - 1).getClass().getCanonicalName().split("\\.");
		response.setContentType("text/csv");
		String namePrefix = classNames[classNames.length - 1].replace("Entity", "");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename="+ namePrefix + "__"+ dateTime + ".csv";
        response.setHeader(headerKey, headerValue);
        if (allRecords == null || allRecords.size() == 0) {
			allRecords = new ArrayList<>();
		}
        try(CSVWriter writer = new CSVWriter(response.getWriter())) {
        	StringBuilder dateString = new StringBuilder("As of ");
        	dateString.append(dateTime);
        	writer.writeNext(dateString.toString().split("\\s")); 
        	String[] header = {"Item", "Description", "LPN", "Lot", "Location", "On Hand", "Lottable06"};
        	 writer.writeNext(header);
        	 List<String[]> stringArrays = allRecords.stream()
        	            .map(obj -> new String[] {nullString(obj.getItem()), nullString(obj.getDescription()), nullString(obj.getLPN()), nullString(obj.getLot()), nullString(obj.getLocation()), obj.getOnHand().toString(), obj.getLottable06().toString()})
        	            .collect(Collectors.toList());
        	 writer.writeAll(stringArrays);
        }
	}

//	private void writeDataLines(List<InventoryEntity> allRecords) throws IOException {
//		logger.info("inside writeDataLines");
//		long  startTime = System.currentTimeMillis();    //start time
//		logger.info("start execute time: " + startTime);
//		int rowIndex = 1;
//        int batchSize = 0;
//        CellStyle style = workbook.createCellStyle();
//        XSSFFont font = (XSSFFont) workbook.createFont();
//        font.setFontHeight(10);
//        style.setFont(font);
//        for (InventoryEntity inventoryEntity : allRecords) {
//        	Row row = sheet.createRow(rowIndex++);
//        	createCell(row, 0, nullString(inventoryEntity.getRegion()), style);
//            createCell(row, 1, nullString(inventoryEntity.getCountry()) , style);
//            createCell(row, 2, nullString("ABC"), style);
//            createCell(row, 3, inventoryEntity.getSalesChannel(), style);
//            createCell(row, 4, nullString(inventoryEntity.getOrderDate().toString()), style);
//            createCell(row, 5, nullString(inventoryEntity.getShipDate().toString()), style);
//            createCell(row, 6, nullString("ZYZ"), style);
//            createCell(row, 7, nullString("JKL"), style);
//            batchSize++;
//         // Flush the rows to disk in batches
//            if (batchSize % BATCH_SIZE == 0) {
//                ((SXSSFSheet) sheet).flushRows(BATCH_SIZE); // Flush the rows
//            }
//		}
//        long  stopTime = System.currentTimeMillis();    //start time
//		logger.info("stop execution time: " + stopTime);
//        logger.info("returning from writeDataLines");
//	}
	
	private String nullString(String t) {
		return t == null ? "": t;
	}

	private void writeHeaderLine() {
		logger.info("inside writeHeaderLine");
		this.sheet = this.workbook.createSheet("Inventory");
        Row row = sheet.createRow(0);
        CellStyle style = this.workbook.createCellStyle();
        XSSFFont font = (XSSFFont) this.workbook.createFont();
        font.setBold(true);
        font.setFontHeight(12);
        style.setFont(font);
        createCell(row, 0, "Creation Date", style);      
        createCell(row, 1, "Item No.", style);
        createCell(row, 2, "Description", style);
        createCell(row, 3, "Quantity", style);       
        createCell(row, 4, "Manufacturing Lot No.", style);    
        createCell(row, 5, "Expiration Date", style);
        createCell(row, 6, "TNOPAL", style);
        createCell(row, 7, "Lot No.", style);
        logger.info("returning from writeHeaderLine");
	}
	
	
	private void createCell(Row row, int columnCount, Object value, CellStyle style) {
		((SXSSFSheet) sheet).trackAllColumnsForAutoSizing();
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
}
