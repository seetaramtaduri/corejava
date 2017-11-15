class A
{
  void disp()
  {
    try
    {
      String s="seetaram";
      char ch=s.charAt(50);//at 5 index there are is no char
  
    }
    catch(StringIndexOutOfBoundsException siob)
    {
      System.out.println("this is not my job");
      throw siob;
    }
  }
 }
 public class rethrowExpDemo 
 { 
   public static void main(String ar[])
   {
       A a=new A();
	   try
       {
         a.disp();
       }
   //the rethrown Exception is caught here
      catch(StringIndexOutOfBoundsException siob)
      {
        System.out.println("yeah i caught Exception and Exception is");       
		System.out.println(siob.getMessage());

	  }
   }
}