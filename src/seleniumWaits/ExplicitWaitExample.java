package seleniumWaits;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Selenium Webdriver']")));
		
		String s = text.getText();
		
		System.out.println(s);
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='hidden']")));
		
	    String ss = driver.findElement(By.xpath("//button[@id='hidden']")).getText();
		
		System.out.println(ss);
		
	}

}
