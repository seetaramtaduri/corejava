import java.lang.System;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class DataIOApp {
 public static void main(String args[]) throws IOException {
  File file = new File("test.txt");
  FileOutputStream outFile = new FileOutputStream(file);
  DataOutputStream outStream = new DataOutputStream(outFile);
  outStream.writeBoolean(true);
  outStream.writeInt(123456);
  outStream.writeChar('j');
  outStream.writeDouble(1234.56);
  System.out.println(outStream.size()+" bytes were written");
  outStream.close();
  outFile.close();
  FileInputStream inFile = new FileInputStream(file);
  DataInputStream inStream = new DataInputStream(inFile);
  System.out.println(inStream.readBoolean());
  System.out.println(inStream.readInt());
  System.out.println(inStream.readChar());
  System.out.println(inStream.readDouble());
  inStream.close();
  inFile.close();
  file.delete();
 }
}
