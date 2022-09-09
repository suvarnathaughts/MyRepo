package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement interactions= driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(interactions);
		
		WebElement DragAndDrop  =driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		
		ac.moveToElement(DragAndDrop);
		
		WebElement static1 = driver.findElement(By.xpath("//a[text()='Static ']"));
		
		ac.moveToElement(static1).click();
		
		
		
		
	}

}
