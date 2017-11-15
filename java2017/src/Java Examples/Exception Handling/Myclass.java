public class Myclass
{
  public static void main(String args[]) throws A
  {
    try
    {
      f();
    }
    finally
    {
      System.out.println("done");
    }catch(A e)
    {
      throw e;
    }
  }
  public static void f() throws B
  {
    throw new B();
  }
  class A extends Throwable{}
  class B extends A{}


