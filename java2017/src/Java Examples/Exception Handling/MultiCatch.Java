/*
 
   After one catch statement executes the others are BY PASSED and Execution 
   CONTINUES after try/catch block 

*/   




class MultiCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			

			System.out.println("No of Command Line Arguments  = "+a);

			int b = 10/a;

			System.out.println("After Div");
			
			int c[] = {0,1,2,3,4,5};
			
			c[200] = 789;
		}

		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero "+e);
		}


		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Voilation "+e);
		}

        finally{
		System.out.println("after Catch");
                }
	}
		
}

