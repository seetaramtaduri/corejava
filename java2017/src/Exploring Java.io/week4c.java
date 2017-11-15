/* Week 4 : c) Write a Java program that displays the number of characters, lines and words in a text file. */ 

import java.io.*;
import java.util.*;
public class week4c
{
    public static void main(String args[])
     {
             try
             {    	   
                   FileInputStream f=new FileInputStream("week4c.java");
	      LineNumberReader lr=new LineNumberReader(new InputStreamReader(f));
	      String data;
	      StringTokenizer st;
	      int words=0,chars=0;
	     while((data=lr.readLine())!=null)
	     {
	           st=new StringTokenizer(data);
	           words+=st.countTokens();
	           chars+=data.length();
	     }
                  System.out.println("total words"+words);
	     System.out.println("total chars"+chars);
	     System.out.println("total lines"+lr.getLineNumber());
	     f.close();
           }
          catch(Exception e){ System.out.println("err"+e);  }
   }
}
