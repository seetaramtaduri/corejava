import java.io.*;
class BufferedInputStreamDemo2
{
public static void main(String s[])throws IOException
{

    DataInputStream dis=new DataInputStream(System.in);
   
	BufferedInputStream bis=new BufferedInputStream(dis);
    
	System.out.println("enter text. enter 'q' to stop");

   int i=bis.read();

   while(i!='q')
   {
      System.out.println((char)i);
      i=bis.read();
   }
  bis.close();
  dis.close();
}
}