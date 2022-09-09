package alertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertEx {
	
	public static void main(String args[])
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		String simpleAlertMsg = driver.switchTo().alert().getText();
		System.out.println(simpleAlertMsg);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		String promptAlert = driver.switchTo().alert().getText();
		System.out.println(promptAlert);
		driver.switchTo().alert().sendKeys("i am able to handle alert");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		String confirmAlert = driver.switchTo().alert().getText();
		System.out.println(confirmAlert);
		driver.switchTo().alert().dismiss();
		
		


}
}