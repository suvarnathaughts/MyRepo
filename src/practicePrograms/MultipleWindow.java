package practicePrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static WebDriver driver;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> hlist = new ArrayList<String>(handles);
		if(switchToRightWindow("Twitter",hlist))
		{
			System.out.println(driver.getCurrentUrl());
		}

}
	public static boolean switchToRightWindow(String Wtitle, List<String>hlist)
	{
		for(String e: hlist)
		{
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(Wtitle))
			{
				System.out.println("found right title");
				return true;
			}
		}return false;
	}
}