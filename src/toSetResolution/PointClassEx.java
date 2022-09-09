package toSetResolution;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointClassEx {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Point s= driver.manage().window().getPosition();
		System.out.println(s);
		driver.manage().window().maximize();
		Point s1= driver.manage().window().getPosition();
		System.out.println(s1);
		
		
		Point p = new Point(500,200);
		driver.manage().window().setPosition(p);
		
	}
}
