package exceptionHandling;

public class RunTimeExceptionHandlingEx {
	// runtime or unchecked exception 
	
	public static void main(String args[])
	
	{   
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try 
		{
		System.out.println(2/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
	
	
	}

}
