package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOnIframe {

	    public static void main(String args[]) 
		{
	        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/bhama/OneDrive/Desktop/firstform.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='acg23']")).sendKeys("Teju");
			//driver.switchTo().frame(0);  //by using index
			//driver.switchTo().frame("as567jk");  // by using id or name
			WebElement s = driver.findElement(By.xpath("//iframe[@id='as567jk']"));
			//switch by WebElement
			driver.switchTo().frame(s);
			driver.findElement(By.xpath("//input[@name='ac1523']")).sendKeys("Sangli");
		    //driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//input[@name='345as']")).sendKeys("Patil");
		}

	
}