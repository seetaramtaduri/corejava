/* TO DEMONSTRATE PREDEFINED EXCEPTIONS USING ALL EXCEPTION CLASSES*/

class xyz
 {
 }

class predefexcep extends xyz
  {
     public static void main(String args[])
	int i=50;
	int c[] = {3,4};
	
	try
	{
	  System.out.println(i/0);
	}
	catch(ArithmeticException e)
	{
	   System.out.println(e);
	}
	
	try
	{
	   c[6] = 30;
	   System.out.println(c[6]);
	}
	catch(ArrayIndexOutOfBoundsException el)
	{
	   System.out.println(el);
	}

	try
	{
	   throw new NullPointerException("demo");
	}
	catch(NullPointerException e2)
	{
	   System.out.println(e2);
	}

	try
	{
	   throw newIllegalAccessException("Demo");
	}
	catch(Exception e3)
	{
	   System.out.println(e3);
	}
     
     }

}
