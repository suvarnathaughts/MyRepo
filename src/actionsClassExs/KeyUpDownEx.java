package actionsClassExs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDownEx {
	
	public static void main(String args[]) {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/p/page3.html");
		
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[text()='compendiumdev']"));
		
		Actions ac =new Actions(driver);
		
		ac.keyDown( Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).build().perform();
		
	}

}
