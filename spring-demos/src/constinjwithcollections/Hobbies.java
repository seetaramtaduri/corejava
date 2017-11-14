package constinjwithcollections;

import java.util.Iterator;
import java.util.List;

public class Hobbies {
	private int id;  
	private String name;  
	private List<String> hobbies;
	public Hobbies(int id, String name, List<String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}  
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Hobbies are:");  
	    Iterator<String> itr=hobbies.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
