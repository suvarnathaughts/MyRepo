package dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String args[]) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		//day
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		
		//s.selectByValue("15");
		s.selectByIndex(11);
		//month
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Aug");
		
		
		//year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1994");
	    List<WebElement> all_Options=s2.getOptions();
	    int count = all_Options.size();
	    System.out.println(count);
	    
	    for(int i=0; i<count; i++)
	    {
	    	String data = all_Options.get(i).getText();
	    	System.out.println(data);
	    	
	    }
	
		
		
		
		
		
		
		
		
		
	}

}
