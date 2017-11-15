class exec
{
  void init(int n) throws Exception
   {
     int b=0;
     int c;

     c=n/b;
    }
  }

class Demo
{
  public static void main(String args[])
  {
   exec p=new exec();
   try
   {
     p.init(10);
   }
   catch(Exception e)
   {
     System.out.println("Error: Division by zero");
    }
  }
}
