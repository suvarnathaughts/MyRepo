package actionsClassExs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickEx {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(rc).perform();
		
		WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		
		ac.moveToElement(delete).click().build().perform();
		
		driver.quit();

}
}