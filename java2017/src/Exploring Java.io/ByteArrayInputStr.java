//ByteArrayInputStream file
import java.io.*;
class ByteArrayInputStr
{
public static void main(String a[])throws Exception
{
String tmp="abc";
byte b[]=tmp.getBytes();
ByteArrayInputStream i=new ByteArrayInputStream(b);
int c;

while((c=i.read())!=-1)
{
System.out.println((char)c);

}
System.out.println();
i.reset();
while((c=i.read())!=-1)
{System.out.println(Character.toUpperCase((char)c));

}
}
}
