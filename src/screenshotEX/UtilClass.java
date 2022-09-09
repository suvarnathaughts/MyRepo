package screenshotEX;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilClass {
	
public static void takeSS(WebDriver driver,String filename ) throws IOException
	{
	
	TakesScreenshot sh = (TakesScreenshot)driver;
    File src = sh.getScreenshotAs(OutputType.FILE);
    String path = "C:\\Users\\bhama\\eclipse-workspace\\AutomationTestingSelenium\\screenshots\\" ;
    File dest = new File(path + filename +".png");
    FileHandler.copy(src, dest);
	
	}
public static void setProp(String BrowserName)
   { if(BrowserName.equals("chrome"))
	 { 
	   System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	 }
     else if(BrowserName.equals("firefox"))
     {
  	     System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
     }
     else
     {
    	 System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver.exe");
     }	 
       
   }
}
