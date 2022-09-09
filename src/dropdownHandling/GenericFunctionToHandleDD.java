package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericFunctionToHandleDD {
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		//day
		By day = By.xpath("//select[@id='day']");
		
		//month
		By month = By.xpath("//select[@name='birthday_month']");
				
		//year
		By year = By.xpath("//select[@id='year']");
		
		doSelectByVisibleText(day,"24");
		doSelectByVisibleText(month,"august");
		doSelectByVisibleText(year, "1991");
		
	
}
	public static WebElement getElement(By locator)
	{  return driver.findElement(locator);
		
	}
	public static void doSelectByVisibleText(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
}