package xcelFileHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusAssignment {
	static WebDriver driver;
	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.redbus.in/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 for(int i=1; i<=3;i++)
		 {
			 for(int j=0;j<1;j++ )
			 { 
				 
		 UtilExcel us = new UtilExcel();
		 String From = us.readStringExcel("RedBusData", i, j);//1 0   //1 1
		 String To = us.readStringExcel("RedBusData", i, j+1);    //1 1
		 String[] dateFormat = us.readDate("RedBusData", i, j+2);   // 1 2
		 String date = dateFormat[2];
		 String month = dateFormat[1];
		 String year = dateFormat[5];
		 driver.findElement(By.xpath("//input[@id='src']")).clear();
		 driver.findElement(By.xpath("//input[@id='src']")).sendKeys(From);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='dest']")).clear();
		 driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(To);
		 
		 Thread.sleep(2000);
		 
	     driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='rb-calendar_onward_cal']")));
		 selectDate(date,month,year);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		 Thread.sleep(2000);
		 WebElement BusesFound = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='f-bold busFound']")));
		 String BusCount = BusesFound.getText();
		 String count = BusCount.split(" ")[0];
		 us.writeInExcel("RedBusData", i, 3, count);
		 driver.navigate().back();
		 
		}
			 
		 } 
	}

    //Generic code for calender handling
	
	public static String[] getMonthYear(String monthYearValue)
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
