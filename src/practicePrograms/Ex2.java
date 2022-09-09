package practicePrograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenshotEX.UtilClass;



public class Ex2 {
	
	
	public static void main(String args[]) throws IOException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
	    WebElement MyAccount =  driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	    Actions ac = new Actions(driver);
	    ac.moveToElement(MyAccount).click().build().perform();
	    WebElement Register =  driver.findElement(By.xpath("//a[text()='Register']"));
	    ac.moveToElement(Register).click().build().perform();
	    WebElement firstname = driver.findElement(By.id("input-firstname"));
	    ac.sendKeys(firstname, "Suvarn").build().perform();
	    ac.sendKeys(Keys.TAB).sendKeys("Bhmare")
	    .sendKeys(Keys.TAB).sendKeys("bcd@gmail.com")
	    .sendKeys(Keys.TAB).sendKeys("5678893929")
	    .sendKeys(Keys.TAB).sendKeys("gf5698gi8")
	    .sendKeys(Keys.TAB).sendKeys("gf5698gi8")
	    .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
	    .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
	    .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
	    .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	    UtilClass.takeSS(driver, "ResisterAccount.png");
	    driver.quit();
	  }
	

}
