package basicAutomation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	
	}

}
