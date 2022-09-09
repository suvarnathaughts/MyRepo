package actionsClassExs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByEx {

	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://omayo.blogspot.com/p/page3.html");
	
	driver.manage().window().maximize();
	
	WebElement minLabel = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
	
	Actions ac = new Actions(driver);
	
	ac.dragAndDropBy(minLabel, 100, 0).perform();
	ac.dragAndDropBy(minLabel, -50, 0).perform();
	
}
}
