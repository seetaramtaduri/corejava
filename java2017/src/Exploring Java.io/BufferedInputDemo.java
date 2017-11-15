 Write  a  program  to  improve  the  efficiency  while  reading  data  from  a  file  using 
BufferedInputStream.
//Reading a text file using byte stream classes
import java.io.*;
class Read2
{          public static void main(String args[]) throws IOException
{          //attach the file to FileInputStream
FileInputStream fin = new FileInputStream ("myfile");    
BufferedInputStream bin = new BufferedInputStream (fin);
//read data from FileInputStream and display it on the monitor
int ch;
while ( (ch = bin.read() ) != -1 )
System.out.print ( (char) ch);
fin.close ();
}
}