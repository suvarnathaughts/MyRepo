package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
	    driver.manage().window().maximize();	
	    
	    driver.findElement(By.name("email")).sendKeys("bhamaresuvarna24@gmail.com");
	    //entered wrong password
	    driver.findElement(By.name("pass")).sendKeys("neharik");
	    
	    driver.findElement(By.name("login")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    
	    WebElement emailTextbox =driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
	    
	    emailTextbox.clear();
	    
	    emailTextbox.sendKeys("bhamaresuvarna24@gmail.com");
	    
	    WebElement passwordTextbox= driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
	               
	    passwordTextbox.clear();
	    //entered correct password
	    passwordTextbox.sendKeys("neharika");
	    
	    WebElement loginButton = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button"));
	    
	    loginButton.click();
	    
	    driver.quit();
	    
	
		
		
		
		
		
		
	}
	
}
