//count words Lines in file

import java.io.*;
public class LWSCount
{
    public static void main(String[] args) throws IOException
	{
	
		 DataInputStream dis=new DataInputStream(System.in);
		 System.out.println("Enter file name to Read");
		 String fname=dis.readLine();
		 System.out.println(Character.LINE_SEPARATOR);
         FileInputStream fis=new FileInputStream(fname);
		 int i,l=0,w=0,ch=0;
		 while((i=fis.read())!=-1)
		 {
		 	  ch++;
             if(Character.isSpace((char)i))
				 w++;
			 if(i==Character.LINE_SEPARATOR)
				 l++;
		 }
		 System.out.println("No of Characters="+ch);
		 System.out.println("No of Words="+w);
		 System.out.println("No of Lines="+l);
	}
}
		 
