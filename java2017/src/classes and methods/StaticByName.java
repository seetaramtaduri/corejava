class StaticDemo 
{
    static String name = "seetaram";
    static int age = 19;
    static void callme(String n) 
    {
      System.out.println("u passed "+n);
	  System.out.println("name = " + name);
	  System.out.println("age="+age);
    }

    static
	{
		 System.out.println("iam in static block");
	}

    static
	{
		 System.out.println("iam in static block2");
	}
}
class StaticByName 
{
  public static void main(String args[])
  {
     StaticDemo.callme("raghu");
     StaticDemo.age=23;
	 System.out.println("name from main = " + StaticDemo.name);
     System.out.println("Age from main = " + StaticDemo.age);
  }
}
