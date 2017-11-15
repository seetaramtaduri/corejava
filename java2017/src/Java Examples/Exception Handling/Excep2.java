// Program to Demo  2 Exceptions
import java.lang.*;
import java.io.*;
class Excep2
{
public static void main(String args[])
 throws IOException
 {
int a,b,c;
int ar[]={10,20,30};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("Enter 2 Values : ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a/b;
System.out.println("Result =  "+c);
ar[5]=50;
}

catch(ArithmeticException ae)
{
System.out.println("Division By zero is Not Possible"); 
System.out.println(ae); 
}
catch(ArrayIndexOutOfBoundsException ai)
{
System.out.println("Array Size Already Intialized"); 
System.out.println(ai); 
}
finally
{
System.out.println("Exception Handelled"); 
}
}
}
