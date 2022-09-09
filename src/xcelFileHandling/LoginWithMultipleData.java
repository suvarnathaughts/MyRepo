package xcelFileHandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithMultipleData {
	
	
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		String ExpectedUrl= "https://www.saucedemo.com/inventory.html";
		
		
		UtilExcel util = new UtilExcel();
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<1;j++)
			{   try 
			   {
				String username = util.readStringExcel("sheet1", i, j);
			    String password =util.readStringExcel("sheet1", i, j+1);
			    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
		        String actual_url = driver.getCurrentUrl();
				if(ExpectedUrl.equals(actual_url))
				{
					util.writeInExcel("sheet1", i, 3,"pass" );
					driver.navigate().back();
					System.out.println("Entered  DataSet"+i+" successfully");
					
				}
				else
				{
					util.writeInExcel("sheet1", i, 3,"fail" );
					driver.navigate().refresh();
					System.out.println("Entered  DataSet"+i+" successfully");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		  }
			
		}
}
}