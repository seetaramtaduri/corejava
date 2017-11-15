import java.util.*;
public class VectorApp {
 public static void main(String args[]){
  Vector v = new Vector();
  v.addElement("one");
  v.addElement("two");
  v.addElement("three");
  v.insertElementAt("zero",0);
  v.insertElementAt("oops",3);
  v.insertElementAt("four",5);
  System.out.println("Size: "+v.size());
 Enumeration e=v.elements();
 while(e.hasMoreElements())
	 {
	       //System.out.println(e.hasMoreElements());
        System.out.println(e.nextElement()+"");
 }
 }
}
