package actionsClassExs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeysEx {
	
public static void main(String args[]) {
    	
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		FirstName .sendKeys("Suvi");
		
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("bhamare")
		  .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("acb@gmail.com")
		  .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("1234566789")
		  .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("123")
          .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys("123")
          .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
          .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.SPACE)
          .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.SPACE)
          .sendKeys(Keys.TAB).pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER)
          .build().perform();
}
}