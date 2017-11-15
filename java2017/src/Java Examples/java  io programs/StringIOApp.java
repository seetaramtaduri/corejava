import java.lang.System;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class StringIOApp {
 public static void main(String args[]) throws IOException {
  StringWriter outStream = new StringWriter();
  String s = "This is a test.";
  for(int i=0;i<s.length();++i)
   outStream.write(s.charAt(i));
  System.out.println("outstream: "+outStream);
  System.out.println("size: "+outStream.toString().length());
  StringReader inStream;
  inStream = new StringReader(outStream.toString());
  int ch=0;
  StringBuffer sb = new StringBuffer("");
  while((ch = inStream.read()) != -1)
   sb.append((char) ch);
  s = sb.toString();
  System.out.println(s.length()+" characters were read");
  System.out.println("They are: "+s);
 }
}
