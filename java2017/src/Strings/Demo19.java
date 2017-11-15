// Program to Demo Password Testing
import java.lang.*;
import java.io.*;
class Demo19
{
public static void main(String args[])
throws IOException
{
String spwd="Seetaram";
String upwd;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Password : ");
upwd=br.readLine();
if(spwd.equals(upwd.trim())) //f(spwd.equalsIgnoreCase(upwd))
System.out.println("Welcome To JAVA");
else
System.out.println("Wrong Password !Try Again ");
}
}
