package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		
	    int size =	driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println(size);
		
		//driver.switchTo().frame(frame);
		driver.switchTo().frame("moneyiframe");
		//driver.switchTo().frame(0);
		
		WebElement bse = driver.findElement(By.xpath("//span[text()='58,387.93']"));
		
		bse.click();
		
		//driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		
		
	}

}
