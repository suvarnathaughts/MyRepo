package xcelFileHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogIn_TestCase {
	
	//login with phonenumber
	
	public static void main(String args[]) throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		UtilExcel util = new UtilExcel();
		String username = util.readNumericExcel("Sheet2", 1, 0);
		String password = util.readStringExcel("Sheet2", 1, 1);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);   
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
}