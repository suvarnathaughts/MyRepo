package javascriptExecutorEXs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshotEX.UtilClass;

public class Example1 {
	
	public static void main(String args[])
	{
		UtilClass.setProp("chrome");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//To click on  button
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		
		//js.executeScript("document.getElementById('').click();");
		
		js.executeScript("arguments[0].click();",button);
		
		//To type text without sendkeys
		
		js.executeScript("document.getElementById('email').value='bhamaresuvarna24@gmail.com';");
		
		//To refresh page 
		
		js.executeScript("history.go(0)");
		
		//To get height and width of page
		
		String height = js.executeScript("return window .innerHeight;").toString();
		
		System.out.println(height);
		
		String width = js.executeScript("return window.innerWidth;").toString();
		
		System.out.println(width);
		
		//To scroll
		
		//js.executeScript("window.scrollBy(0,700)");
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
		//To get inner text of entire page
		
	    String text =	js.executeScript("return document.documentElement.innerText;").toString();
	
	    System.out.println(text);
		
		//to scroll till element found
	    
	  //  js.executeScript("arguments[0].scrollIntoView();",button);
	    
	    
		
		
		
		
	}

}
