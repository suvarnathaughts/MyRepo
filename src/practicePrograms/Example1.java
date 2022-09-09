package practicePrograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import screenshotEX.UtilClass;

public class Example1 {
	
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		UtilClass.setProp("chrome");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		UtilClass.takeSS(driver, "loginPage");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys("arna");
		
		WebElement surname = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstname));
		
		surname.sendKeys("Deo");
		
		WebElement mobileNumber = driver.findElement(RelativeLocator.with(By.tagName("input")).below(surname));
		
		mobileNumber.sendKeys("9881925367");
		
		WebElement newpassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		newpassword.sendKeys("bha34567k*&");
		
		WebElement dayDD= driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(dayDD);
		s.selectByVisibleText("15");
		
		WebElement monthDD= driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(monthDD);
		s1.selectByValue("8");
		
		WebElement yearDD= driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2 = new Select( yearDD);
		
		s2.selectByVisibleText("2015");
		
		WebElement radiobutton = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		
		radiobutton.click();
		
		UtilClass.takeSS(driver, "signupPage");
		
		WebElement signupButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		signupButton.click();
		
		UtilClass.takeSS(driver, "acountCreatedPage");
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
