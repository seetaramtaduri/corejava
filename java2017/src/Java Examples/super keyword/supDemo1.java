//Example to demo super keyword to invoke constructors
class Abc 
{
	
	String name;
	int age;

	Abc()
	{
		name="";
		age=0;
	}
	Abc(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	Abc(Abc obj)
	{
		obj.name="pavan";
		obj.age=23;
	}
    public void display()
	{
	   System.out.println("Name="+name);
	   System.out.println("Age="+age);
	}

}
class Xyz extends Abc
{

    Xyz()
	{
	   
	   super();
	   System.out.println("call made to Abc");
	 
    }

    Xyz(String name,int age)
	{
		super(name,age);
	}

    Xyz(Xyz ob)
	{
		super(ob);
	}


}

class supDemo1
{

 public static void main(String[] args) 
  {
		
	Xyz  obj1=new Xyz();
    Xyz  obj2=new Xyz("ramana",25);
    Xyz  obj3=new Xyz(obj1);

    obj1.display();
    obj2.display();
    obj3.display();


  }
}
	
	
	
	
	
	
	
	
	
