package xcelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToSetDifferentTypesValue {
	
	public static void main(String args[]) throws IOException
	{
	   String path = "C:\\Users\\bhama\\eclipse-workspace\\AutomationTestingSelenium\\src\\xcelFileHandling\\Data\\TestData.xlsx";
	   FileInputStream fis = new FileInputStream(path);
	   
	   
	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	  //   XSSFSheet  sheet =  wb.createSheet("TestData1");
	  
   //	   XSSFRow row1 = sheet.createRow(0);
   //	   XSSFRow row2 = sheet.createRow(1);
   //	   XSSFRow row3 = sheet.createRow(2);
	   XSSFSheet sheet = wb.getSheet("TestData1");
	   
	   sheet.getRow(0).createCell(0).setCellValue("Name");
	   sheet.getRow(0).createCell(1).setCellValue("class");
	   sheet.getRow(0).createCell(2).setCellValue("status");
	   
	   FileOutputStream  fos = new FileOutputStream(path);
	   wb.write(fos);
	   
	   wb.close();	
	}

}
