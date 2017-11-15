/*

A try and catch statement form a UNIT .

The scope of the catch clause is RESTRICTED to those statments specified
by the immediately preceding try statement.

A catch statement cannot catch an exception thrown by another try 
statement (Except in the case of nested try statements )


*/
	  


class Ex2
{
        public static void main(String arg[])
		{
	       int d,r= 5;
	       try
		   {
		       d = 0;
		       r = 100/d;
			   System.out.println("Val =  "+r);
		       System.out.println("This will not be Printed ");
		   }
                catch(ArithmeticException ae)
			    {
				   
		          System.out.println("In Catch \n Division By Zero is Not Possible");
                          System.out.println(ae);
			    } 
                    finally
                     {
                        System.out.println("Finally Will alwaysget Executed ");
                     } 
				
	           System.out.println("After Catch Statement");
		}
}
	



                     /*finally
                     {
                     System.out.println("Finally");
                     } */
