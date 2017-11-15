
import java.io.*;

public class StringWriterDemo 
{
   public static void main(String args[]) throws IOException 
   {
       
		StringWriter sw = new StringWriter();
        
		String s = "Seeta Ram";
        for(int i=0;i<s.length();++i)
	    {
			 sw.write(s.charAt(i));
	    }
        //display the contents
		System.out.println("sw: "+sw);
        
		//finds length of the String
		System.out.println("size: "+sw.toString().length());
  
        StringReader sr= new StringReader(sw.toString());
        int ch=0;
       
	    StringBuffer sb = new StringBuffer("");
       
	    while((ch = sr.read()) != -1)
        {
		   sb.append((char) ch);
       }
	   
	   s = sb.toString();
       
	   //reading characters 
	   
	   System.out.println(s.length()+" characters were read");
       
	   System.out.println("They are: "+s);
  }
}
