package screenshotEX;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonEX2 {
	public static void main(String args[]) throws IOException, InterruptedException 
	{   
		 UtilClass.setProp("chrome");
		 
		 WebDriver driver = new ChromeDriver();
		 
	     driver.get("https://www.amazon.in/");
	     
    	 driver.manage().window().maximize();
    	 
		 UtilClass.takeSS(driver, "amazon");
    	 
    	 Thread.sleep(2000);
		 
		 WebElement about_us_link = driver.findElement(By.xpath("(//a[@class='nav_a'])[1]"));
		 
		 Point location = about_us_link.getLocation();
		 System.out.println(location);
		 
		 Thread.sleep(2000);
		 int x = location.getX();
		 int y = location.getY();
		 
		 System.out.println("width: "+x);
		 
		 System.out.println("height: "+y);
		 
		
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
         js.executeScript("window.scrollBy(0,789)");
         
		 // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
        // js.executeScript("window.scrollTo(0,document.body.scrollTop)");
       // js.executeScript("window.scrollTo(0,document.body.scrollLeft)");
         
		 UtilClass.takeSS(driver, "amazon1");
		  
		 Thread.sleep(2000);
		 
		 about_us_link.click();
		 
		 UtilClass.takeSS(driver, "amazon2");		 
		 
		 
}

	
}