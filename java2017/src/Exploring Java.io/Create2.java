 //Write  a  program  to  improve  the  efficiency  of  writing  data  into  a  file  using 
//BufferedOutputStream.
//Creating a text file using byte stream classes
import java.io.*;
class Create2
{          public static void main(String args[]) throws IOException
{          //attach keyboard to DataInputStream
DataInputStream dis = new DataInputStream (System.in);
//attach file to FileOutputStream, if we use true then it will open in append mode
FileOutputStream fout = new FileOutputStream ("myfile", true);    
BufferedOutputStream bout = new BufferedOutputStream (fout, 1024);
//Buffer size is declared as 1024 otherwise default buffer size of 512 bytes is used. 
//read data from DataInputStream and write into FileOutputStream
char ch;
System.out.println ("Enter @ at end : " ) ;
while ( (ch = (char) dis.read() ) != '@' )
bout.write (ch);
bout.close ();
fout.close ();
}
}