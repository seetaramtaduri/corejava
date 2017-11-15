import java.util.*;
class LinkedHashSetDemo 
{
  public static void main(String args[])
  {
    // Create a hash set.
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    // Add elements to the hash set.
		lhs.add("Baba");
		lhs.add("Amar");
		lhs.add("Devi");
		lhs.add("Eshwar");
		lhs.add("Chandu");
		lhs.add("Farhana");
		System.out.println("the elements are displayed in an order in which they are stored");
		System.out.println(lhs);
  }
}