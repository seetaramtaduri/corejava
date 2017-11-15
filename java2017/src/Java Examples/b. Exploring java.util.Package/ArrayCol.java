//rpogram to store group  of objects into Array

import java.io.*;
class Emp
{
      String name;
	  int age;
	  Emp(String name,int age)
	  {
		  this.name=name;
		  this.age=age;
	  }
	  void display()
	  {
		 
	     System.out.println(name+"\t"+age);
	  }
}
class ArrayCol
{
	public static void main(String[] args)  throws Exception
	{
		Emp e[]=new Emp[3]; //creating a collection of objects
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++)
		{
            
			  System.out.print("Enter age and name" );
			  int a=Integer.parseInt(br.readLine());
              String b=br.readLine();
		      e[i]= new Emp(b,a); //storing objects into Array
		 }
        System.out.println("Name   \tAge");
		System.out.println("----------------------");
		for(int i=0;i<e.length;i++)
		 {
			
			e[i].display();
         }
    }
		
}