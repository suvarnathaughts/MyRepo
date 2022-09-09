package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	
	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Documentation")).click();
		
		//driver.findElement(By.partialLinkText(" st Practices")).click();
		
	}	
		
		
		
		


}
