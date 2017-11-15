/* Week 4 : b) Write a Java program that reads a file and displays the file on the screen, with a line number before each line. */ 
import java.io.*;
import java.util.*;
public class  week4b
{
public static void main(String args[])
{
try
{
	FileInputStream f=new FileInputStream("week4b.java");
	LineNumberReader lr=new LineNumberReader(new InputStreamReader(f));
    String data;
    while((data=lr.readLine())!=null)
   {
       System.out.println(lr.getLineNumber()+":"+data);
   }
        System.out.println("total lines"+lr.getLineNumber());
        f.close();
}
catch(Exception e)
{
	   System.out.println("err"+e);}
}
}
