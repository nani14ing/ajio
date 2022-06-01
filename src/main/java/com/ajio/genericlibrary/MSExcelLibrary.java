package com.ajio.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is used to maintain all excel specific common methods
 * @author Admin
 *
 */
public class MSExcelLibrary {
	static Workbook wb;

	public static void openExcelFile(String filePath) throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel=new FileInputStream(filePath);
		wb=WorkbookFactory.create(fisExcel);
	}
/**
 * This method is used to fetch the data from Excel sheet
 * @param SheetName
 * @param rowNumber
 * @param cellNumber
 * @return
 */
public static String getDataFromExcel(String sheetName, int rowNumber, int cellNumber) {
	String data=wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	return data;
	
}

/**
 * This method is used to set the data into excel sheet
 * @param sheetName
 * @param rowNumber
 * @param cellNumber
 */
public static void insertDataIntoExcel(String sheetName, int rowNumber, int cellNumber, String text) {
	  wb.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(text);
}

/**
 * This method is used to write the data and to close the excel sheet
 * @param filePath
 * @throws IOException
 */
public static void writeDataIntoExcel(String filePath) throws IOException {
	FileOutputStream fos=new FileOutputStream(filePath);
	wb.write(fos);
}

/**
 * this method is used to close the excel file
 * @throws IOException
 */
public static void closeExcelFile() throws IOException {
	wb.close();
}
}

