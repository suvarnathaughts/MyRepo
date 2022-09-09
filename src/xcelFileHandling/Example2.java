package xcelFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Example2 {
	public static void main(String args[]) throws IOException
	{  
		
		String path= "C:\\Users\\bhama\\OneDrive\\Desktop\\TestData.xlsx";
		
		//create object of file class
		
		File file = new File(path);
		
		//create object of FileInputStream
		FileInputStream fis = new FileInputStream(file);
		
		//create an object of workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//create an object of sheet by using wb
		XSSFSheet sheet = wb.getSheetAt(0);
		
//		String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(data00);
//		String data01 = sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data01);
		int lRNum = sheet.getLastRowNum();
		System.out.println(lRNum );
		XSSFRow row = sheet.getRow(lRNum);
		short cellNumber = row.getLastCellNum();
		System.out.println(cellNumber);
		
		for(int i=0; i<=lRNum; i++)
		{
			for(int j=0; j<cellNumber; j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(" "+data+"     ");
				
			}
			System.out.println("  ");
		}
		
		wb.close();
		

}
}