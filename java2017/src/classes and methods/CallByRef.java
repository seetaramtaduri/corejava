// Objects are passed by reference.
class Test 
{
  int a, b;
  Test(int i, int j) 
  {
    a = i;
    b = j;
  }

  // pass an object
  void meth(Test o) 
  {
    o.a = o.a* 2; //-->t1.a=15*2=30;--->a
    o.b = o.b/2;  //-->t1.b=20/2=10;--->b
  }
  void display( )
  {
	System.out.println("a  and b  after call: " + a + " " + b);
  }   

}

class CallByRef 
{
   public static void main(String args[])
   {
     Test t1 = new Test(15, 20);
     
  System.out.println("ob.a and ob.b before call: " + t1.a + " " + t1.b);

     t1.meth(t1); 
     t1.display();
    
   } 
}

