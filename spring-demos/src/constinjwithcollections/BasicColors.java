package constinjwithcollections;

import java.util.Iterator;
import java.util.List;

public class BasicColors {
	private int id;  
	private String name;  
	private List<Colors> colors;
	public BasicColors(int id, String name, List<Colors> colors) {
		super();
		this.id = id;
		this.name = name;
		this.colors = colors;
	}  
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Favorite colors  are:");  
	    Iterator<Colors> itr=colors.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
