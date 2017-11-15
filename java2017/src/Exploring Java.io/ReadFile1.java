//to read data from the 'two.txt' file using FileReader
import java.io.*;
class ReadFile1
{
public static void main(String a[])throws IOException
{
int ch;
FileReader fr=null;
try{
fr=new FileReader("two");
}
catch(FileNotFoundException fe)
{
System.out.println("file not found");
return;
}
while((ch=fr.read())!=-1)
System.out.print((char)ch);
fr.close();
}
}

