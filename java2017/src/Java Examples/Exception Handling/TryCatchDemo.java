class TryCatchDemo
{
 public static void main(String args[])
 {
  int a=0,b=10;
  float result=0f;
  try
  {
   result=b/a;
  }
  catch(ArithmeticException e)
  {
   System.out.println(e);
  }
  System.out.println("The result is " +result);
 }
}
