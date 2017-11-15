import java.util.*;
public class ArrayListDemo{
	public static void main(String[] args) {
		ArrayList<Object> arl=new ArrayList<Object>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		Integer i3=new Integer(30);
		Integer i4=new Integer(40);
		String s1="seetaram";
		System.out.println("The content of arraylist is: " + arl);
		System.out.println("The size of an arraylist is: " + arl.size());
		arl.add(i1);
		arl.add(i2);
		arl.add(s1);
		System.out.println("The content of arraylist is: " + arl);
		System.out.println("The size of an arraylist is: " + arl.size());
		arl.add(i1);
		arl.add(i2);
		arl.add(i3);
		arl.add(i4);
		Integer i5=new Integer(50);
		arl.add(i5);
		System.out.println("The content of arraylist is: " + arl);
		System.out.println("The size of an arraylist is: " + arl.size());
		arl.remove(3);
		Object a=arl.clone();
		System.out.println("The clone is: " + a); 
		System.out.println("The content of arraylist is: " + arl);
		System.out.println("The size of an arraylist is: " + arl.size());
	}
}
