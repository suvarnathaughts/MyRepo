package alertsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowEX3 {
	public static void main(String args[])
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[3]")).click();
		String ParentWindowID = driver.getWindowHandle();
		System.out.println(ParentWindowID);
		Set<String> allWindowsID = driver.getWindowHandles();
		
		for(String id :allWindowsID )
		{
			if(!(id.equals(ParentWindowID)))
			{
			  
			  driver.switchTo().window(id);
			  System.out.println(driver.getTitle());
			  driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			  driver.close();
			}
			
		}
		driver.switchTo().window(ParentWindowID);
		System.out.println(driver.getTitle());
		
        
}
}