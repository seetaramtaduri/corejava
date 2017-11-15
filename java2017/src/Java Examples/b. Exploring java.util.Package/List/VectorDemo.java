//java.util.Vector and java.util.Enumeration;

import java.util.*;
public class VectorDemo
{
	public static void main(String[] args)
    {
		Vector<Object> v = new Vector<Object>();
		int i= 10;
		Integer wi = new Integer(20);
		String str = "Seeta Ram";
		v.add(i);
		v.add(wi);
		v.add(str);
		v.add(2, new Integer(30));
		System.out.println("the elements of v: " + v);
		System.out.println("The size of v are: " + v.size());
		System.out.println("The elements at position 2 is: " + v.elementAt(2));
		System.out.println("The first element of v is: " + v.firstElement());
		System.out.println("The last element of v is: " + v.lastElement());
		v.removeElementAt(2);
		Enumeration e=v.elements();
		System.out.println("The elements of v: " + v);
		while(e.hasMoreElements()){
			System.out.println("The elements are: " + e.nextElement());
		}	
	}
}
