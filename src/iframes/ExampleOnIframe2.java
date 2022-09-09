package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOnIframe2 {
	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		//driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//switch inside frame
		
		driver.switchTo().frame("moneyiframe");
		
		String todaysBSE = driver.findElement(By.xpath("//span[@id='bseindex']")).getText();
		
		System.out.println(todaysBSE);
		
		//click on mail icon outside iframe
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@class='mailicon']")).click();
		
	}

}
