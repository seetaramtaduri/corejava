/*
 Enumeration--> list of name constants
 Enum is a class in javasince from jdk1.5
*/

 
enum animals{lion,tiger,cow}; //enum constants
class EnumDemo2 
{
	public static void main(String[] args) 
	{
		animals c;
	    c=animals.cow;
	    System.out.println("value is "+c);
	    animals carr[]=animals.values();
        System.out.println("Enum contains ");

		for(animals i:carr)
		{
			System.out.println(i);
		}
		c=animals.valueOf("cow");
        System.out.println(c);
	
	
	
	}
	
	
}
