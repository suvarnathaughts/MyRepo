package exceptionHandling;

public class TryAndMultipleCatchBlock {
	
	
	public static void main(String args[])
	{
		int a = 10;
		int b = 0;
		int c;
		try 
		{
		  c =  a/b;
		  
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Exception handled by child catch block");
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			System.out.println("Exception handled by parent catch block");
		}
		
	}

}
