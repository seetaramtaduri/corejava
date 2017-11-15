import java.io.*;
import java.util.*;
public class StrTok1 
{
  public static void main ( String[] args ) throws IOException
  {
     BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter a string:");
     String data = br.readLine();   
    
     StringTokenizer tok = new StringTokenizer( data );
     while ( tok.hasMoreTokens() )
      {
		 System.out.println( tok.nextToken() );
      }

     System.out.print("Enter an Equation:");
     String data2 = br.readLine();   
     StringTokenizer tok2 = new StringTokenizer( data2, " =+-" ,true);
     //StringTokenizer tok2 = new StringTokenizer( data2, " =+-" );
     while ( tok2.hasMoreTokens() )
      {
		 System.out.println( tok2.nextToken() );
      }
    //we can return the delimiters also

	
  
  
  }
}