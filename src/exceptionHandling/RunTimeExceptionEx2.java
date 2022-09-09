package exceptionHandling;

public class RunTimeExceptionEx2 {
	static int a=2;
	static int b=0;
	
	public static void main(String args [])
	{
		try 
		{
		 int c = a/b;
		 System.out.println(c);
	    }
	    catch(Exception e)
	    {  
	       int d = a+b;
	       System.out.println(d);
		   e.printStackTrace();
		}
		System.out.println("hi");
	}

}
