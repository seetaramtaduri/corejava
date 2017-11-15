// Program to Demo Division by Zero Exception
import java.lang.*;
import java.io.*;
class Excep1
{
public static void main(String args[])
throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("Enter 2 Values : ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a/b;
System.out.println("Result =  "+c);
}
catch(ArithmeticException ae)
{
System.out.println("Division By zero is Not Possible"); 
System.out.println(ae); 
}
finally
{
System.out.println("Exception Handelled"); 
}
}
}

