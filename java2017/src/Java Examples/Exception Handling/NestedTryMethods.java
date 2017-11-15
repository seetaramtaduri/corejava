

class NestedTryMethods
{

	static void nestedtry(int no)/////Method
	{

				
				 try
				 {
					 System.out.println("\n NESTED TRY METHOD");
					 
					 
					 if(no == 1)
						 no = no/(no-no);


					 if(no == 2)
					 {
						 int a[] = {55};
					      a[42] = 77;
					 }
				 }
		         catch(ArrayIndexOutOfBoundsException e)
				 {
			       System.out.println("Array index out-of-bounds : "+e);
				 }   
	}

		

    public static void main(String ar[] )
	{
	  try
	  {
		int n,res;
		   
		  n = ar.length; 
		  
		   System.out.println(" No of Command Line Arguments  = "+n);
		     res =  55/n;
			 System.out.println(" Result  = "+res);

		  System.out.println("Before Invloking nestedtry(n) Value of  N = "+n);
		  nestedtry(n);  //  
	  }
	   catch(ArithmeticException e)
	   {
		System.out.println("From Main Divide By ZERO "+e);
	   }
	}
}
	   
	   
	   


