import java.lang.System;
import java.io.PushbackInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class PushbackIOApp {
 public static void main(String args[]) throws IOException {
  ByteArrayOutputStream outStream = new ByteArrayOutputStream();
  String s = "This is a test.";
  for(int i=0;i<s.length();++i)
   outStream.write(s.charAt(i));
  System.out.println("outstream: "+outStream);
  System.out.println("size: "+outStream.size());
  ByteArrayInputStream inByteArray;
  inByteArray = new ByteArrayInputStream(outStream.toByteArray());
  PushbackInputStream inStream;
  inStream = new PushbackInputStream(inByteArray);
  char ch = (char) inStream.read();
  System.out.println("First character of inStream is "+ch);
  inStream.unread((int) 't');
  int inBytes = inStream.available();
  System.out.println("inStream has "+inBytes+" available bytes");
  byte inBuf[] = new byte[inBytes];
  for(int i=0;i<inBytes;++i) inBuf[i]=(byte) inStream.read();
  System.out.println("They are: "+new String(inBuf));
 }
}
