// Program to Demo Pallandrome Testing
import java.lang.*;
import java.io.*;
class Demo21
{
public static void main(String args[])
 throws IOException
 {
   String str;
   String rev;
StringBuffer sb=new StringBuffer(50);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a String : ");
str=br.readLine();
sb.append(str);
sb.reverse();
rev=sb.toString();
if(str.equalsIgnoreCase(rev))
System.out.println(str+" is Pallandrome");
else
System.out.println(str+" is Not Pallandrome");
}
}

