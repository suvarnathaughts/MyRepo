package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionExample {
	
	// compile time exception or checked exception
	
	public static void main(String args [])
	{
		try 
		{
			FileInputStream fis = new FileInputStream("C:/mno.txt");
			
		
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
			
			System.out.println("Compile Time or Checked Exception Handled");
		}
		System.out.println("Hi I am able to execute program after exception");
	}

}
