package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorEx {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]")).click();
		String Msg_On_CustomerService_page = driver.findElement(By.xpath("(//h1)[1]")).getText();
		System.out.println("Message on Customer Service Page: "+Msg_On_CustomerService_page);		
		driver.navigate().back();
		WebElement MobilesLink = driver.findElement(By.xpath("(//a[text()='Mobiles'])"));
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(MobilesLink)).click();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
		String Msg_On_BestSeller_page=driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println("Message on Best Seller Service Page: "+Msg_On_BestSeller_page);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("Today's Deals"))).click();
		String TitleOfFashionPage = driver.getTitle();
		System.out.println(TitleOfFashionPage);
		driver.quit();

}
}