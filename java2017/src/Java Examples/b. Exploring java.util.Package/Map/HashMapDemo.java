//program to demo Hashtable

//we implement a telephone directory

import java.util.*;
import java.io.*;
class PhoneBook
{

		
		//create a HashMap
		
		HashMap<String,Long> hm=new HashMap<String,Long>();
		   
		String name;
		Long mobno;
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		
		public void insert() throws IOException
		{
            System.out.println("Enter Name");
            name=br.readLine();
            System.out.println("Enter mobile no");
		    mobno=Long.parseLong(br.readLine());

		   //store name and phone num into hashmap
		 
		    hm.put(name,mobno);

		}

		public void getNum() throws IOException 
		{

		    System.out.println("Enter Name");
            name=br.readLine();
			

			//pass name and get mobile  num

			mobno=hm.get(name);
			System.out.println("mobile no is"+mobno);
		}

        public void display()
	    {
			//use keySet() to display the names
			//create a HashSet  object to store names  and refer it by set reference

		    Set<String> set = new HashSet<String>();
            set=hm.keySet();
			System.out.println(set);
		}
	}

public class HashMapDemo
{

	public static void main(String[] args) throws Exception
	{
		
		PhoneBook pb=new PhoneBook();

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		//menu 

			 
            while(true)
		    { 
			  
			 System.out.println("\n1. Enter Details");
             System.out.println("\n2. Lookup  Details");
 	         System.out.println("\n3. Display Details");
	         System.out.println("\n4. Exit");
             System.out.println("Your choice");
			 int ch=Integer.parseInt(br.readLine());
			  
			  switch(ch)
			  { 
				 case 1:pb.insert();
				        break;
				 case 2:pb.getNum();
				        break;
				 case 3:pb.display();
				        break;
				 case 4:System.exit(0);
				 
				 default:System.out.println("details not found");

			 }
		  }
  }  
}	