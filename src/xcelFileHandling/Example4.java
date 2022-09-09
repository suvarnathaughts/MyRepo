package xcelFileHandling;

import java.io.IOException;

public class Example4 {

	
	public static void main(String args[]) throws IOException
	{
		
		//String path = " C:\\Users\\bhama\\eclipse-workspace\\AutomationTestingSelenium\\src\\xcelFileHandling\\Data\\TestData.xlsx";
	    UtilExcel util = new UtilExcel();
	    util.writeInExcel("Sheet2", 2, 1, "hi");
	    
	    
	    
	    
	
	}
}
