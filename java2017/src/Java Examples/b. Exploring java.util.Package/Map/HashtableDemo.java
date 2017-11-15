//program to demo Hashtable
import java.util.*;
public class HashtableDemo
{

	public static void main(String[] args) 
	{
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("sachin",200);
		ht.put("Dhoni",183);
		ht.put("gambhir",153);
		ht.put("yousuf",123);

		//display names of all player names using Enumeration

		System.out.println("PLAYER LIST");
		System.out.println("-----------");
		Enumeration e=ht.keys();
		while(e.hasMoreElements())
		  System.out.println(e.nextElement());
	   //accept player name from keyboard

	   Scanner s=new Scanner(System.in);
	   System.out.println("enter player name");
	   String name=s.nextLine();
	   name=name.trim();//removes unnecessary spaces
  
	  //get score of the player
	  Integer score=ht.get(name);

	  if(score!=null)
		{
		   //convert score from Integer object to int value

		   int sc=score.intValue();
		   System.out.println(name+"\tscored\t"+sc);
		}
		else
			System.out.println("player not found");
	}
}
	