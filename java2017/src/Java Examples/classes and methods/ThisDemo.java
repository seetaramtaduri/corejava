//pogram to demo this Keyword
class  Sample
{
	
	//name and age are instance varaibles
     private String name;
	 private int age;
	
	//default constructor
    Sample()
	{
		this("seetaram",23);
		//calls present class parameterized constructor 
		//and passes values to it
		this.access();//calls present class method
	}
	
	//parameterized constructor
	
	Sample(String name,int age)
	{
		this.name=name;
		this.age=age;
	    
	}
	//method

	void access()
	{
		 System.out.println("name="+name);
         System.out.println("age="+age);

	}
}

class ThisDemo
{

  public static void main(String[] args) 
  {

      Sample s=new Sample();
  
  }
}