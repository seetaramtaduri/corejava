class A{
void f() throws ArithmeticException{}
}

public class MyClass1 extends A
{
  public static void main(String args[])
  {
    A obj=new MyClass1();
    try{
        obj.f();
       }
       catch(ArithmeticException e)
       {
         return;
       }
       catch(Exception e)
       {
         System.out.println(e);
         throw new RuntimeException("something wrong here");
       }
       void InterruptedException{}
   }

