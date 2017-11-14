package ciwithmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hobbies {
	private int id;  
	private String name;  
	private Map<String,String> hobbies;
	public Hobbies(int id, String name, Map<String, String> hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
	}  
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Hobbies are:");  
	  
	    Set<Entry<String, String>> set=hobbies.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    
	    while(itr.hasNext()){  
	    	 Entry<String,String> entry=itr.next();  
	    	 System.out.println(entry.getValue()+" likes " +entry.getKey());  
	    }  
	}  
}
