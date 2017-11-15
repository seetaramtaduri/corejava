 Write a program to create a text file using character or text stream classes.
//Creating a text file using character (text) stream classes
import java.io.*;
class Create3
{          public static void main(String args[]) throws IOException
{          String str = "This is an Institute" + "\n You are a student"; // take a String
//Connect a file to FileWriter
FileWriter fw = new FileWriter ("textfile");
//read chars from str and send to fw
for (int i = 0; i<str.length () ; i++)
fw.write (str.charAt (i) );
fw.close ();
}
}