package actionsClassExs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	    
	public static void main(String args[]) {
	    	
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement capital = driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		WebElement country = driver.findElement(By.xpath("//div[text()='Denmark']"));
		
		Actions ac = new Actions(driver);
		
		//ac.clickAndHold(capital).moveToElement(country).release().build().perform();
		
		ac.dragAndDrop(capital, country).perform();
	}     
}