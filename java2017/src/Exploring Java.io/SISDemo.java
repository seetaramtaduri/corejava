//Program of SequenceInputStream that reads data of 2 files  
  
import java.io.*;  
class SIsDemo{  
  public static void main(String args[])throws Exception{  
  
   FileinputStream fin1=new FileinputStream("f1.txt");  
   FileinputStream fin2=new FileinputStream("f2.txt");  
  
   SequenceinputStream sis=new SequenceinputStream(fin1,fin2);  
   int i;  
   while((i=sis.read())!=-1)  
   {  
    System.out.println((char)i);  
   }  
  }  
}  