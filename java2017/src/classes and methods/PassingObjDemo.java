//program to pass Objects(callbyref)

/** author:seetaram
    course:java(oops)
	
**/
class  Flower
{
	
	String name;
    String color;
	Flower(String name,String color)
	{
	    this.name=name;
		this.color=color;
	}
    
	void show()
	{
		System.out.println("Flower Name="+name);
        System.out.println("Flower color="+color);
	}
	void change(Flower f)
    {
     
	  f.name="jasmine";
      f.color="white";

    }
}
class PassingObjDemo
{
	public static void main(String[] args) 
	{
		Flower flow=new Flower("Rose","red");
		flow.show();
		flow.change(flow);//passing object
        System.out.println("now the flower changes");
		System.out.println("Flower Name="+flow.name);
        System.out.println("Flower color="+flow.color);
	}
}
