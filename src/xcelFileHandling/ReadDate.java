package xcelFileHandling;

import java.io.IOException;
import java.util.Date;

public class ReadDate {
	
	public static void main(String args[]) throws IOException
	{
		UtilExcel us = new UtilExcel();
		
		String[] date = us.readDate("RedBusData", 1, 2);
			String date1 = date[2];
			String month = date[1];
			String year = date[5];
		System.out.println(date1);
		System.out.println(month);
		System.out.println(year);
		
		System.out.println(date);
		
	}
	

}
