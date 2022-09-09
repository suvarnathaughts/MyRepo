package xcelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilExcel {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	double Data1;
	String Data;
	boolean Data2;
	String s;
	Date date;
	FileOutputStream fos;
	
	String path ="C:\\Users\\bhama\\eclipse-workspace\\AutomationTestingSelenium\\src\\xcelFileHandling\\Data\\TestData.xlsx";
	
	public String readStringExcel(String sheetname, int rownum,int cellnum) throws IOException
	{
        		
		
		//To read String data from excel file
		
		 fis = new FileInputStream(path);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheet(sheetname);
		
		 Data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		 
		 return Data;
		
	}
	public String[] readDate(String sheetname, int rownum,int cellnum) throws IOException
	{
        		
		
		//To read date from excel file
		
		 fis = new FileInputStream(path);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheet(sheetname);
		
		 date = sheet.getRow(rownum).getCell(cellnum).getDateCellValue();
		 String getDateMonthYear = date.toString();
		 String[] dateMonthYear = getDateMonthYear.split(" ");
		 return dateMonthYear;
		
	}
	public String readNumericExcel(String sheetname, int rownum,int cellnum) throws IOException
	{
        		
		
		//To read numeric data from excel file
		
		 fis = new FileInputStream(path);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheet(sheetname);
		
		 Data1 = sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
		 
		 long l = (long)Data1;
		 
		 s = Long.toString(l);
		 return s;
		
	}
	public boolean readBooleanExcel(String sheetname, int rownum,int cellnum) throws IOException
	{
        		
		
		//To read boolean data from excel file
		
		 fis = new FileInputStream(path);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheet(sheetname);
		
		 Data2 = sheet.getRow(rownum).getCell(cellnum).getBooleanCellValue();
		 
		 return Data2;
		
	}
	
	
	public void writeInExcel(String sheetName, int rownum,int cellnum, String status) throws IOException
	{  
		 fos = new FileOutputStream(path);
		 workbook.getSheet(sheetName);
		 sheet.getRow(rownum).createCell(cellnum).setCellValue(status);
		 workbook.write(fos);
		 workbook.close();
	}
	public void writeInExcel1(String sheetName, int rownum,int cellnum, boolean status) throws IOException
	{  
		 fos = new FileOutputStream(path);
		 workbook.getSheet(sheetName);
		 sheet.getRow(rownum).createCell(cellnum).setCellValue(status);
		 workbook.write(fos);
		 workbook.close();
	}
	public void writeInExcel2(String sheetName, int rownum,int cellnum, double amount) throws IOException
	{  
		 fos = new FileOutputStream(path);
		 workbook.getSheet(sheetName);
		 sheet.getRow(rownum).createCell(cellnum).setCellValue(amount);
		 workbook.write(fos);
		 workbook.close();
	}

}
