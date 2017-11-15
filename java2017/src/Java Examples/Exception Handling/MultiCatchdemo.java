class MultiCatchdemo
{
 public static void main(String args[])
 {
  int arr[];
  int a=0,b=10;
  float result=0f;

   try
   {
     
       try
	   {
		 arr=new int[-10];
         result=b/a;
	   }
       catch(NegativeArraySizeException e2)
       {
         System.out.println("Using negative subscripts");
       }
    }
    catch(Exception e1)
    {
         System.out.println("Trying to divide by zero");
    }
 

   
   finally
   {
    System.out.println("The finally block is executed whether or not Exception is thrown");
  }
 }
}
