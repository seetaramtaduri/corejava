
//Reading data from file using character (text) stream classes
import java.io.*;
class Read3
{          public static void main(String args[]) throws IOException
{          //attach file to FileReader
FileReader fr = new FileReader ("Read3.java");
//read data from fr and display
int ch;
while ((ch = fr.read()) != -1)
System.out.print ((char) ch);
//close the file
fr.close ();
}
}