package exceptionHandling;

public class TryFinally {

	public static void main(String args [])
	{  
		int a =10;
	    int b= 0;
	    
	    try 
	    {
	    	int c = a/b;
	    	
	    }
	    finally
	    {
	    	System.out.println("I am finally block");
	    	
	    }
		System.out.println("we are reamining lines of program");
		System.out.println("we only get executed if exception gets handled");
		
		
	}
	
	

	
}
