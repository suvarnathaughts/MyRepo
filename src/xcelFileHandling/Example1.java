package xcelFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	public static void main(String args[]) throws IOException
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String path= "C:\\Users\\bhama\\OneDrive\\Desktop\\TestData.xlsx";
		
		//create object of file class
		
		File file = new File(path);
		
		//create object of FileInputStream
		FileInputStream fis = new FileInputStream(file);
		
		//create an object of workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//create an object of sheet by using wb
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//create an object of row using sheet
		XSSFRow row = sheet.getRow(0);
		
		//create an object of cell using row
		XSSFCell cell = row.getCell(0);
		
	    // get data
		String data00 = cell.getStringCellValue();
		System.out.println(data00);
		
		wb.close();
		

		

}
}