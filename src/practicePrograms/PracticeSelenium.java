package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshotEX.UtilClass;

public class PracticeSelenium {
	
	public static void main(String args [])
	
	{
		UtilClass.setProp("chrome");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(button).perform();
		
		WebElement copyLink = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		ac.moveToElement(copyLink).click();
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		
	}

}
