package xcelFileHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_TestCase {
	
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		UtilExcel util = new UtilExcel();
	    String username = util.readStringExcel("sheet1", 4, 0);
	    String password =util.readStringExcel("sheet1", 4, 1);
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String ExpectedUrl= "https://www.saucedemo.com/inventory.html";
		
		String actualUrl = driver.getCurrentUrl();
		
		if(ExpectedUrl.equals(actualUrl))
		{
			//util.writeInExcel("sheet1",1, 2, "Pass");
			util.writeInExcel2("sheet1", 4, 2,100.00 );
		}
		else
		{
			util.writeInExcel2("sheet1", 4, 2, 45.89);
		}
		
	    
		
	    
		
	}

}
