import java.io.*;
class FIsDemo
{
 public static void main(String args[]) throws Exception
 {
//---------------------------First way-------------------------//
 FileInputStream fin=new FileInputStream("ReadAndPrintFile.java");
  // Create a byte array
 byte[] b=new byte[fin.available()];
  // Read data into the array
 fin.read(b);
    for(int i=0;i<b.length;i++)
  {
  System.out.print((char)b[i]);
  }
//---------------------------Second way-------------------------//
 int k=0;
 FileInputStream fin1=new FileInputStream("ReadAndPrintFile.java");
 System.out.println("\n\nSecond way\n");
  // Read till the end of file
  while((k=fin1.read())!=-1)
  {
   System.out.print((char)k);
  }
//---------------------------Third way-------------------------//
 FileInputStream fin2=new FileInputStream("ReadAndPrintFile.java");
 byte b1[]=new byte[fin2.available()];
 fin2.read(b1,0,b1.length);
 System.out.println("\n\nThird way\n");
  for(int i=0;i<b1.length;i++)
  {
  System.out.print((char)b1[i]);
  }
  
 // Close the document
 fin.close();
 fin1.close();
 fin2.close();
 }
}