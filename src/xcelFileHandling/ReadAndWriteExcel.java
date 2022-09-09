package xcelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcel {
	
	
	public static void main(String args[]) throws IOException
	
	{  
		String path ="C:\\Users\\bhama\\eclipse-workspace\\AutomationTestingSelenium\\src\\xcelFileHandling\\Data\\TestData.xlsx";		
		
		//To read from excel file
		
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		String Username = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(Username);
		
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Password);
		
		//To Write into the excel file
		
		sheet.getRow(1).createCell(2).setCellValue("Pass");
		sheet.getRow(2).createCell(2).setCellValue("Pass");
		sheet.getRow(3).createCell(2).setCellValue("Pass");
		sheet.getRow(4).createCell(2).setCellValue("Pass");
		
		FileOutputStream fos = new FileOutputStream(path);
		
		workbook.write(fos);
		
		workbook.close();
		
					
}

}
