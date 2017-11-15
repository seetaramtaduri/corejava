import java.lang.System;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.IOException;

public class SequenceIOApp {
 public static void main(String args[]) throws IOException {
  SequenceInputStream inStream;
  FileInputStream f1 = new FileInputStream("ByteArrayIOApp.java");
  FileInputStream f2 = new FileInputStream("FileIOApp.java");
  inStream = new SequenceInputStream(f1,f2);
  boolean eof = false;
  int byteCount = 0;
  while (!eof) {
   int c = inStream.read();
   if(c == -1) eof = true;
   else{
    System.out.print((char) c);
    ++byteCount;
   }
  }
  System.out.println(byteCount+" bytes were read");
  inStream.close();
  f1.close();
  f2.close();
 }
}
