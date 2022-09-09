package actionsClassExs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx {
	
	public static void main(String args[])
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/p/page3.html");
		
		WebElement dc = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		
		 Actions ac = new Actions(driver);
		
		 ac.doubleClick(dc).build().perform();
		
		//ac.doubleClick(dc).perform();

}
}