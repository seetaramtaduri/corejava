/*
 Enumeration--> list of name constants
 Enum is a class in javasince from jdk1.5
*/

 
enum Colors{red,green,blue}; //enum constants
class EnumSwitch
{
	public static void main(String[] args) 
	{
		Colors c;
	    c=Colors.red;
	    System.out.println("value of c is "+c);
	    c=Colors.green;
		switch(c)
		{
			case red: System.out.println("color is red");
			          break;
					 
            case green: System.out.println("color is green");

			          break;
			case blue: System.out.println("color is blue");
			          break;
			
		}
	
	  System.out.println("Enum contains ");
	  Colors carr[]=Colors.values();

	  for(Colors i:carr)
		  System.out.println(i);
	  c=Colors.valueOf("green");
          System.out.println(c);
	
	
	
	}
	
	
}
