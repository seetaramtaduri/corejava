import java.io.*;
class VotingException extends Exception
{
 int age;
 VotingException(int a) //provide a constructor
 {
  age=a;
 }
 public String toString() //ovevride toString() method
 {
  return "you age is very less to vote wait for some more years";
 }
}
public class ThrowDemo
{
 public static void main(String args[])
 {
   DataInputStream dis=new DataInputStream(System.in);
   String name;
   int age;
   System.out.println("Enter your name and age");
   try
   {
     try
	   {
		 name=dis.readLine();
         age=Integer.parseInt(dis.readLine());
	     if(age<=18)
         {
           System.out.println("Dear"+name);
           throw new VotingException(age);
         }
         else
         {
           System.out.println(name+"You are Eligible to Vote");
         }
       
        }//end of try2
       catch(VotingException v)
       {
         System.out.println(v);
       }
   }//end of try1
   catch(Exception e)
   {
       System.out.println("Exception is"+e);
   }
   
 }
}

