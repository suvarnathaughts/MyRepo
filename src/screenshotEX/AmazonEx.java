package screenshotEX;
//program  to take screenshot

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AmazonEx {
	
	public static void main(String args []) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    WebElement dd = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    Select s = new Select(dd);
		s.selectByVisibleText("Books");
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearch')]")).sendKeys("ruskin bond");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Ruskin Bond - The Blue Umbrella']")).click();
		TakesScreenshot sh = (TakesScreenshot)driver;
	    File src = sh.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\bhama\\OneDrive\\Desktop\\SQL\\amazon.png");
	    FileHandler.copy(src, dest);
	    
	    
		
	       
	}

}
