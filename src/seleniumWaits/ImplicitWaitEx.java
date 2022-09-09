package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {
	
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
       driver.get("https://dubai360.com/");
       
       driver.findElement(By.xpath("(//div[@class='wrapper-button'])[3]")).click();
}
}