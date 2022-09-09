package exceptionHandling;

public class TryCatchFinally {
	
	public static void main(String args[])
	{
		int a = 10;
		int b = 0;
		int c ;
		try 
		{
			 c =a/b;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("exception handled");
			
		}
		finally
		{
			
			System.out.println("I am finally block");
			System.out.println("I will get executed wether exception ocurred or not");
		}
		
		System.out.println("we are remaining lines of program");
		
	}

}
