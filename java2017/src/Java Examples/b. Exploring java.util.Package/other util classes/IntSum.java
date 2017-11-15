import java.io.*; 
import java.util.*; 
public class IntSum
 { 
  public static void main(String args[])
  { 
    StringTokenizer st=new StringTokenizer("1 2 3 4 5" ,  " "); 
    int sum=0; 
    System.out.println("Integers are :"); 
    
	while(st.hasMoreTokens()) 
    { 
      int i=Integer.parseInt(st.nextToken()); 
      System.out.println (i); 
      sum=sum+i;
   } 
    System.out.println("No of tokens "+st.countTokens());
   System.out.println("sum of integers="+sum); 
 
   } 
}  