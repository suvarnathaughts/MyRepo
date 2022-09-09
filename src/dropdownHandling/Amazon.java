package dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String args[]) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement DD =driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
	
		System.out.println(DD.isSelected());
		
		Select s = new Select(DD);
		s.selectByVisibleText("Computers & Accessories");
	
	}
}

