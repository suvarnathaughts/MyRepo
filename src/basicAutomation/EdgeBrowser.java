package basicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String args[])
	{
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
	}

}
