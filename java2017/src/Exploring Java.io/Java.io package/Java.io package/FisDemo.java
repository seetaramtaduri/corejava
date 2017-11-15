//read data from a file and display on the monitor
import java.io.*;
class FisDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("poem.txt");
		System.out.println("File contents are");
		int  ch;
        while((ch=fis.read())!=-1)
	    System.out.print((char)ch);
        fis.close();
	}
}
		
		
