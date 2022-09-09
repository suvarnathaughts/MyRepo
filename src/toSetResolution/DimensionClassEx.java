package toSetResolution;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClassEx {
	
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	// get size method
	Dimension size1 = driver.manage().window().getSize();
	System.out.println("Resolution after launch :"+size1);
	
	driver.manage().window().maximize();
	Dimension size2 = driver.manage().window().getSize();
	System.out.println("Resolution after maximizing window :"+size2);
	
	driver.manage().window().minimize();
	Dimension size3 = driver.manage().window().getSize();
	System.out.println("Resolution after minimizing window :"+size3);
	
	//setSize method
	Dimension d = new Dimension(600,1000);
	driver.manage().window().setSize(d);
	driver.quit();
	
}
}
