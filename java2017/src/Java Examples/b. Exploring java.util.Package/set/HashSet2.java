import java.util.*;

public class HashSet2
{
 public static void main(String args[])
{
    HashSet set = new HashSet();
    set.add("This");
    set.add("is");
    set.add("is");
    set.add("a");
    set.add("a");
    set.add(null);
    set.add("test");
  System.out.println("The size of the set is: "+set.size());
  Iterator i = set.iterator();
  while(i.hasNext())
  {
     Object o = i.next();
     if(o == null) 
		 System.out.println("null");
     else
		System.out.println(o.toString());
  }
 }
}
