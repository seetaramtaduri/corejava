import java.lang.System;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputConversionApp {
 public static void main(String args[]) throws IOException {
  InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader inStream = new BufferedReader(in);
  System.out.println("Encoding: "+in.getEncoding());
  String inputLine;
  do {
   System.out.print(">");
   System.out.flush();
   inputLine=inStream.readLine();
   System.out.println(inputLine);
  } while (inputLine.length() != 0);
 }
}
