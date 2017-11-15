// Program to Demo StringBuffer class
import java.lang.*;
import java.io.*;
class Demo20
{
public static void main(String args[])
throws IOException
{
String fn="T ";
String mn="Seetaram";
String ln="Rao";
StringBuffer sb=new StringBuffer(50);
sb.append(fn);
sb.append(ln);
sb.insert(2,mn);
System.out.println(sb);
sb.reverse();
System.out.println(sb);
}
}


