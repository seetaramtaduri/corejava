import java.lang.System;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class CharFileIOApp {
 public static void main(String args[]) throws IOException {
  FileWriter outStream = new FileWriter("test.txt");
  String s = "This is a test.";
  for(int i=0;i<s.length();++i)
   outStream.write(s.charAt(i));
  outStream.close();
  FileReader inStream = new FileReader("test.txt");
  StringBuffer sb = new StringBuffer("");
  int ch=0;
  while((ch = inStream.read()) != -1)
   sb.append((char) ch);
  s = sb.toString();
  System.out.println(s.length()+" characters were read");
  System.out.println("They are: "+s);
  inStream.close();
  File f = new File("test.txt");
  f.delete();
 }
}
