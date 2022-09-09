package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx1 {
	
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement capital = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement country = driver.findElement(By.xpath("//div[@id='box101']"));
		
		Actions ac = new Actions(driver);
		
		//ac.clickAndHold(capital).moveToElement(country).release().build().perform();
		ac.dragAndDrop(capital, country).build().perform();
		
		WebElement e =  driver.findElement(By.xpath("//a[text()='Drag And Drop scripts from DHTMLGoodies.com']"));

		ac.scrollToElement(e).perform();
		

}
}