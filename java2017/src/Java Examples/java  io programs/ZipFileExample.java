import java.io.*;
import java.util.zip.*;
public class ZipFileExample
  {
public static void main(String a[])
  {
  try
    {
    ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("outFile.zip")));
    byte[] data = new byte[1000];               
    BufferedInputStream in = new BufferedInputStream(new FileInputStream("profile.txt"));
    int count;
   out.putNextEntry(new ZipEntry("outFile.zip"));
   while((count = in.read(data,0,1000)) != -1)
   {      
   out.write(data, 0, count);
   }
   in.close();
   out.flush();
   out.close();
  System.out.println("Your file is zipped");
 }
 catch(Exception e)
  {
 e.printStackTrace();
  }        
 }
}