//ByteArrayOutputStream file
import java.io.*;
class ByteArrayOutputStr
{
public static void main(String a[])throws Exception
{
String tmp="abckjjjjkdkdsserk";
byte b[]=tmp.getBytes();
ByteArrayOutputStream o=new ByteArrayOutputStream();
o.write(b);
System.out.println("buffer as a string");
System.out.println(o.toString());
System.out.println("into an array");
byte b1[]=o.toByteArray();
int i=0;
while(i<b1.length)
{
System.out.println((char)b1[i]);
i++;
}
}
}
