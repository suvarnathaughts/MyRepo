package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		// locate search box 
		
	WebElement search_box = driver.findElement(By.xpath("html/body/div/div/header/div[3]/div/div/div[2]/form/input[4]"));
	
	// enter text in search box
	
	search_box.sendKeys("T-Shirt");
	Point position = search_box.getLocation();
	System.out.println(position);
	
	
		
	}

}
