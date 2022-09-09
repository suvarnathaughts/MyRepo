package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DifferentXpath {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Relative Xpath
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop i5");
		
		//contains
		driver.findElement(By.xpath("(//input[contains(@class,'nav-input nav')])[2]")).click();
	    String laptopModelName =   driver.findElement(By.xpath("//span[contains(text(),'Hp 15S- 11Th Gen Intel Core I5')]")).getText();
		System.out.println("Laptop model name is: "+laptopModelName);
	    String Price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	    System.out.println("Price of laptop is: "+Price);
	    driver.navigate().back();
	   
	    // Xpath by text method
	    Thread.sleep(2000);
	    WebElement CustomerServiceLink =  driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
	    CustomerServiceLink.click();
	   
	    // Xpath by Tag name
	    Thread.sleep(2000);
	    String MsgOnCustomerServicePage = driver.findElement(By.xpath("(//h1)[1]")).getText();
	    System.out.println("Message on Customer Service Page: "+MsgOnCustomerServicePage);
	    driver.navigate().back();
	}

}
