package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		
		driver.manage().window().maximize();
		
		WebElement SearchBox = driver.findElement(By.id("search_query_top"));
		
		SearchBox.sendKeys("T-shirt");
		
		//locate Search button
		
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		
		// click on button
		
		searchButton.click();
		
		driver.quit();
	}

}
