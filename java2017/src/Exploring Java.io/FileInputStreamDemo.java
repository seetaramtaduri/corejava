 //Write a program to read data from myfile using FileInputStream.
//Reading a text file using byte stream classes
import java.io.*;
class Read1
{          public static void main (String args[]) throws IOException
{          //attach the file to FileInputStream
FileInputStream fin = new FileInputStream ("myfile");    
//read data from FileInputStream and display it on the monitor
int ch;
while ( (ch = fin.read() ) != -1 )
System.out.print ((char) ch);
fin.close ();
}
}