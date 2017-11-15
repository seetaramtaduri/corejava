class Example
{
   public static void main(String args[])
   {
      int d,a=10;
      try
      {
         d=0;
         a=a/d;
         System.out.println("this will not be printed");
      }
      catch(ArithmeticException e)
      {
        System.out.println("error: division by zero");
      }
      System.out.println("this is after catch");
   }
}



