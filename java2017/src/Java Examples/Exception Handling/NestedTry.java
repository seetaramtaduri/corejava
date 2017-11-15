

class NestedTry 
{
	public static void main(String ar[])
	{
		try
		{
			int n,res;

			n = ar.length;
		
			for(int i=0;i<n;i++)
			System.out.println(ar[i]);
			

			     res = 55/n;



				 System.out.println(" N = "+n);

				 try
				 {
					 if(n == 1)
						 n = n/(n-n);


					 if(n == 2)
					 {
						 int a[] = {55};
					      a[42] = 77;
					 }
				 }
				 catch(ArithmeticException e)
				 {
		           System.out.println("Divide by ZERO Inner "+e);
				 }
		         catch(ArrayIndexOutOfBoundsException e)
				 {
			       System.out.println("Array index out-of-bounds : "+e);
				 } 


				 
				  finally
				  {
				     System.out.println("In Inner Try");
				  }



		}
		
	     catch(ArrayIndexOutOfBoundsException e )//ArithmeticException e)
		 {
		   System.out.println("Divide by ZERO Outer "+e);
		 }

		 finally
				  {
				     System.out.println("In Outer Try");
				  }

    }
}