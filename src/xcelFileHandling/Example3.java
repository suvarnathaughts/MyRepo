package xcelFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
	
	
	public static void main(String args[]) throws IOException
	{
		String path = "C:\\Users\\bhama\\OneDrive\\Desktop\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String Username =  sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(Username);
		System.out.println(Password);
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.navigate().back();
		
		wb.close();
		
		
		
		
		
		
		
		
		
	}

}
