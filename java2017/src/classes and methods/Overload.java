// Demonstrate method overloading.
class OverloadDemo 
{
  void test() 
  {
    System.out.println("iam in test method");
  }

  void sum(int a,int b) 
  {
    System.out.println("integer sum=" +( a+b));
  
  }

  void sum(double a, double b) 
  {
    System.out.println("double sum= " +( a + b));
  }

}
 class Overload 
 {
    public static void main(String args[]) 
	{
      OverloadDemo ob = new OverloadDemo();
      
    // call all versions of test()
    ob.test(); 
    ob.sum(10,20);
    ob.sum(10.5, 20.6);
    
  }
}
