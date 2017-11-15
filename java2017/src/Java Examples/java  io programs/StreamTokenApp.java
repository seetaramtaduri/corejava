import java.lang.System;
import java.io.StreamTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StreamTokenApp {
 public static void main(String args[]) throws IOException {
  BufferedReader inData =
   new BufferedReader(new InputStreamReader(System.in));
  StreamTokenizer inStream = new StreamTokenizer(inData);
  inStream.commentChar('#');
  boolean eof = false;
  do {
   int token=inStream.nextToken();
   switch(token){
   case inStream.TT_EOF:
    System.out.println("EOF encountered.");
    eof = true;
    break;
   case inStream.TT_EOL:
    System.out.println("EOL encountered.");
    break;
   case inStream.TT_WORD:
    System.out.println("Word: "+inStream.sval);
    break;
   case inStream.TT_NUMBER:
    System.out.println("Number: "+inStream.nval);
    break;
   default:
    System.out.println((char) token+" encountered.");
    if(token=='!') eof=true;
   }
  } while(!eof);
 }
}
