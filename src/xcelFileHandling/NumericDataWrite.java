package xcelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumericDataWrite {
	
public static void main(String args[]) throws IOException
	
	{  
		String path ="C:\\Users\\bhama\\eclipse-workspace\\AutomationTestingSelenium\\src\\xcelFileHandling\\Data\\TestData.xlsx";		
		
		//To read from excel file
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("TestData");
		XSSFRow row0 = sheet.createRow(0);
		XSSFRow row1 = sheet.createRow(1);
		XSSFRow row2 = sheet.createRow(2);
		XSSFRow row3 = sheet.createRow(3);
		XSSFRow row4 = sheet.createRow(4);
		
		sheet.getRow(0).createCell(3).setCellValue("amount");
		sheet.getRow(1).createCell(3).setCellValue(1000.00);
		sheet.getRow(2).createCell(3).setCellValue(500.00);
		sheet.getRow(3).createCell(3).setCellValue(15555.00);
		sheet.getRow(4).createCell(3).setCellValue(45.890);
		
		sheet.getRow(0).createCell(4).setCellValue("status");
		sheet.getRow(1).createCell(4).setCellValue(true);
		sheet.getRow(2).createCell(4).setCellValue(false);
		sheet.getRow(3).createCell(4).setCellValue(false);
		sheet.getRow(4).createCell(4).setCellValue(true);
		
		sheet.getRow(0).createCell(5).setCellValue("date");
		sheet.getRow(1).createCell(5).setCellValue(15__2__2020);
		sheet.getRow(2).createCell(5).setCellValue(20__4__2022);
		sheet.getRow(3).createCell(5).setCellValue(6__1__2022);
		sheet.getRow(4).createCell(5).setCellValue(16__2__2022);
		
		
		FileOutputStream fos = new FileOutputStream(path);
		
		workbook.write(fos);
		
		workbook.close();
 }
}