// Program to Demo  User Defined Exceptions
import java.lang.*;
import java.io.*;
class Excep3 extends Exception
{
public Excep3() {}

public Excep3(String s)
{
super(s);	
}   

public static void main(String args[])
throws IOException,Excep3
{
int age;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

try
{
System.out.print("Enter Age = ");
age=Integer.parseInt(br.readLine());
if(age<=18)
{
Excep3 ex=new Excep3("Minors are Not Eliginle");
throw ex; 
}
System.out.println("You are a Major.Your Age =  "+age);
}

catch(Excep3 ex)
{
System.out.println("User Defined exception"); 
System.out.println(ex); 
}

finally
{
System.out.println("Exception Handelled"); 
}
}
}

