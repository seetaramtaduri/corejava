//program to Demo ByteArrayInputStream
import java.io.*;
class  ByteArrayISDemo
{
	public static void main(String[] args)  throws IOException
	{
		byte[]b={10,20,30,40,50};
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
         int c;
		 for(int i=0;i<3;i++)
		 { 
			  while((c=bis.read())!=-1)
			  {
				   System.out.println(c);
			  }
			  bis.reset();
		}
		     bis.close();
	}
}

		
		