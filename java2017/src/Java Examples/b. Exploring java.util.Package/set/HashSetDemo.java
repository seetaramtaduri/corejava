import java.util.*;
class HashSetDemo 
{
  public static void main(String args[])
  {
    // Create a hash set.
        HashSet<String> hs = new  HashSet<String>();
    // Add elements to the hash set.
		hs.add("Baba");
		hs.add("Amar");
		hs.add("Devi");
		hs.add("Eshwar");
		hs.add("Chandu");
		hs.add("Farhana");
		System.out.println("the elements are displayed  not in an order in which they are stored");
		System.out.println(hs);
  }
}