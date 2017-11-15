import java.io.*;
class chararraywriter{
public static void main(String a[])throws IOException
{
CharArrayWriter f=new CharArrayWriter();
String s="vaagdevi college";
char buf[]=new char[s.length()];

s.getChars(0,s.length(),buf,0);
f.write(buf);
System.out.println("buffer as a string");
System.out.println(f.toString());
System.out.println("into array ");

 char c[]=f.toCharArray();
 for(int i=0;i<c.length;i++)
 {
 System.out.println(i);
 }
 System.out.println("\n to a FileWriter()");
 FileWriter f2=new FileWriter("test.txt");
 f.writeTo(f2);
 f2.close();
 System.out.println("doing a reset");
 f.reset();
 for(int i=0;i<3;i++)
 f.write('x');
 System.out.println(f.toString());
 }
 }
