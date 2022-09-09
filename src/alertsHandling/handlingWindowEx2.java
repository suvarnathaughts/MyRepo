package alertsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindowEx2 {
	
	public static void main(String args[]) throws InterruptedException
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("macbookpro"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		String parentID = driver.getWindowHandle();
		Set<String> childIDS = driver.getWindowHandles();
		
		for(String id : childIDS)
		{
			
			if(!(id.equals(parentID)))
					{
				        driver.switchTo().window(id);
				        System.out.println(driver.getTitle());
				        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				       
				     }
			
		}
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());

}
}