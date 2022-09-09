package basicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String args[])
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("iphone13");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		WebElement phone = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 13 (128GB) - Midnight')]"));
		System.out.println(phone.isDisplayed());
		System.out.println(phone.isEnabled());
		System.out.println(phone.isSelected());
		System.out.println(phone.getText());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		String urlAfterBack = driver.getCurrentUrl();
		System.out.println(urlAfterBack);
		driver.close();
		
		
		//driver.close();
		
		 
	}

}
