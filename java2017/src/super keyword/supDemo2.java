//Example to demo super keyword to invoke constructors
//and access super class instance varaibles

class Abc 
{
	
	String name="raghu";
	int age=26;

	
	public void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is"+age);

	}
	
}
class Xyz extends Abc
{
    public void display()
	{
		super.display();
		System.out.println("iam in Xyz display() method");
        System.out.println("Name is"+super.name);
        System.out.println("Name is"+super.age);

	}

 }

class supDemo2
{

 public static void main(String[] args) 
  {
	Abc obj1=new Xyz();
    
    obj1.display();
    
  }
}
	
	
	
	
	
	
	
	
	
