// Automatic type casting will be   applied when overloading occurs.
class OverloadDemo 
{
   void test() 
   {
      System.out.println("No parameters");
   }

   // Overload test for two integer parameters.
   void test(int a, int b) 
   {
     System.out.println("int res" + (a + b));
   }
   // overload test for a double parameter and return type
   void test(double a,double b) 
   {
     System.out.println("double res="+(a+b));
   }
}
  
class Overload2 
{
   public static void main(String args[])
   {
      OverloadDemo ob = new OverloadDemo();
      int i = 88;
      
      ob.test(1.5, 200);
      ob.test(1, 2.5);

     }
}
