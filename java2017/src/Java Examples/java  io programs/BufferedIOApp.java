import java.lang.System;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.IOException;

public class BufferedIOApp {
 public static void main(String args[]) throws IOException {
  SequenceInputStream f3;
  FileInputStream f1 = new FileInputStream("ByteArrayIOApp.java");
  FileInputStream f2 = new FileInputStream("FileIOApp.java");
  f3 = new SequenceInputStream(f1,f2);
  BufferedInputStream inStream = new BufferedInputStream(f3);
  BufferedOutputStream outStream = new BufferedOutputStream(System.out);
  inStream.skip(500);
  boolean eof = false;
  int byteCount = 0;
  while (!eof) {
   int c = inStream.read();
   if(c == -1) eof = true;
   else{
    outStream.write((char) c);
    ++byteCount;
   }
  }
  String bytesRead = String.valueOf(byteCount);
  bytesRead+=" bytes were read\n";
  outStream.write(bytesRead.getBytes(),0,bytesRead.length());
  inStream.close();
  outStream.close();
  f1.close();
  f2.close();
 }
}
