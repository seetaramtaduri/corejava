import java.util.*;

public class LinkedListDemo{
	public static void main(String[] args){
		LinkedList link=new LinkedList();
		link.add("a");
		link.add("b");
		link.add(new Integer(10));
		System.out.println("The contents of array is" + link);
		System.out.println("The size of an linkedlist is" + link.size());
		
		link.addFirst(new Integer(20));
		System.out.println("The contents of array is" + link);
		System.out.println("The size of an linkedlist is" + link.size());

		link.addLast("c");
		System.out.println("The contents of array is" + link);
		System.out.println("The size of an linkedlist is" + link.size());

		link.add(2,"j");
		System.out.println("The contents of array is" + link);
		System.out.println("The size of an linkedlist is" + link.size());

		link.add(1,"t");
		System.out.println("The contents of array is" + link);
		System.out.println("The size of an linkedlist is" + link.size());

		link.remove(3);
		System.out.println("The contents of array is" + link);
		System.out.println("The size of an linkedlist is" + link.size());
	}
}
