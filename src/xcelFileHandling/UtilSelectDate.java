package xcelFileHandling;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UtilSelectDate {
	static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.redbus.in/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rb-calendar_onward_cal']")));
	} 
	public static  String[] getMonthYear(String monthYearValue)
    {
		return monthYearValue.split(" ");
	}
	
	public static  void selectDate(String exDay, String exMonth, String exYear)
	{
		if(exMonth.equals("Feb")&& Integer.parseInt(exDay)>29)
		{
			
			System.out.println("wrong date: "+exMonth+" : "+exDay);
			return;
		}
		if(Integer.parseInt(exDay)>31)
		{
			System.out.println("wrong date: "+exMonth+" : "+exDay);
			return;
		
		}
		
		
		String monthYearValue=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		 
		while(!(getMonthYear(monthYearValue)[0].equals(exMonth) && getMonthYear(monthYearValue)[1].equals(exYear)))
				{
			         driver.findElement(By.xpath("//td[@class='next']")).click();
			         monthYearValue=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			         
				}
		
		 driver.findElement(By.xpath("//td[contains(text(),'"+exDay+"')]")).click();
		
	}
	
	
	

}
