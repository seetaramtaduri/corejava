//to read data from one.txt file
import java.io.*;
class ReadFile
{
public static void main(String a[])throws IOException
{
FileInputStream fin=new FileInputStream("one.txt");
System.out.println("file contents:");
int ch;
while((ch=fin.read())!=-1)
System.out.print((char)ch);
fin.close();
}
}

