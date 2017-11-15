 // 1. program to demo writing data to a text file
 import java.io.*;

 public class TextFileOutputDemo
 {  
	   public static void main(String[] args) throws Exception
       {
         FileOutputStream fos= new FileOutputStream("morestuff2.txt",true);//appends data to the already existing data
         
		 PrintWriter out  =  new PrintWriter(fos);
		
		 System.out.println("Writing to file.");
         
		 out.println("good night");
		 
		 out.close();
         
		 System.out.println("End of program.");
      }  
}