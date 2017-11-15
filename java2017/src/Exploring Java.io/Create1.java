 //Write a program to read data from the keyboard and write it to a text file using byte  stream classes.
//Creating a text file using byte stream classes
import java.io.*;
class Create1
{          
public static void main(String args[]) throws IOException
{          
	//attach keyboard to DataInputStream
DataInputStream dis = new DataInputStream (System.in);
//attach the file to FileOutputStream
FileOutputStream fout = new FileOutputStream ("myfile");    
//read data from DataInputStream and write into FileOutputStream
char ch;
System.out.println ("Enter @ at end : " ) ;
while( (ch = (char) dis.read() ) != '@' )
fout.write (ch);
fout.close ();
}
}