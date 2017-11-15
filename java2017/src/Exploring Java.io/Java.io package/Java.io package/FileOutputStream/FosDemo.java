//writing data to a file
import java.io.*;
class FosDemo 
{
	public static void main(String[] args)throws IOException 
	{
		DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fos=new  FileOutputStream("temp.txt");
		char ch;
		while((ch=(char)dis.read())!='@')
			 fos.write(ch);
		fos.close();
	}
}
		
	
