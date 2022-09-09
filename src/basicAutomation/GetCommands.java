package basicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
	
	public static void main(String args[]) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();  //to launch chrome browser
       
      
       driver.get("http://tutorialsninja.com/demo/");   // to open url
       
       driver.manage().window().maximize();
       
       Thread.sleep(2000);
       
       driver.manage().window().minimize();  
       
       Thread.sleep(2000);
       
	   String s = driver.getCurrentUrl();	// it is used to get url of page
	   
	   Thread.sleep(2000);
	   
	   System.out.println(s);
	   String title = driver.getTitle(); // it is used to get title of the page
	   
	   System.out.println(title);
	   
	   Thread.sleep(2000);
	   
	   String pageSource = driver.getPageSource();
	   System.out.println(pageSource);
	   
	   
	   
	   
	   //driver.close();       //it is used to close specific window     
	   driver.quit();         // it is used to close all open tabs/windows
	}

}
