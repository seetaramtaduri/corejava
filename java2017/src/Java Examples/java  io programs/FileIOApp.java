import java.lang.System;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileIOApp {
 public static void main(String args[]) throws IOException {
  FileOutputStream outStream = new FileOutputStream("test.txt");
  String s = "This is a test.";
  for(int i=0;i<s.length();++i)
   outStream.write(s.charAt(i));
  outStream.close();
  FileInputStream inStream = new FileInputStream("test.txt");
  int inBytes = inStream.available();
  System.out.println("inStream has "+inBytes+" available bytes");
  byte inBuf[] = new byte[inBytes];
  int bytesRead = inStream.read(inBuf,0,inBytes);
  System.out.println(bytesRead+" bytes were read");
  System.out.println("They are: "+new String(inBuf));
  inStream.close();
  File f = new File("test.txt");
  f.delete();
 }
}
