import java.io.*;
class data
{public static void main(String args[])throws IOException
{
FileOutputStream fos=new FileOutputStream("on.txt");
BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
int ch;
while((ch=fos.readLine())!=-1)
{
System.out.println(ch);
//bos.close();
}
}
}
