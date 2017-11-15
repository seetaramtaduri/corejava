//to read data from any text file
import java.io.*;
class ReadAnyFile
{
public static void main(String a[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter any file name:");
String fname=br.readLine();
//FileInputStream fin=null;
FileReader fr=null;

try
{
//fin=new FileInputStream(fname);
fr=new FileReader(fname);

}catch(FileNotFoundException fe){
System.out.println("file not found");
return;
}
//BufferedInputStream bin=new BufferedInputStream(fin);
BufferedReader b=new BufferedReader(fr);
System.out.println("file contents:");
int ch;
while((ch=b.read())!=-1)
System.out.print((char)ch);
b.close();
}
}

