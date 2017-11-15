import java.lang.System;
import java.io.LineNumberReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class LineNumberIOApp {
 public static void main(String args[]) throws IOException {
  FileReader inFile = new FileReader("LineNumberIOApp.java");
  LineNumberReader inLines = new LineNumberReader(inFile);
  String inputLine;
  while ((inputLine=inLines.readLine()) != null) {
   System.out.println(inLines.getLineNumber()+". "+inputLine);
  }
 }
}
