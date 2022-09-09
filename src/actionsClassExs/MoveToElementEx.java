package actionsClassExs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementEx {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/p/page3.html");
		
		driver.manage().window().maximize();
		
		WebElement Blogs = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(Blogs).perform();
		
		WebElement w1 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		
		ac.moveToElement(w1).click().build().perform();
		
		
	}
	
	
	
}
