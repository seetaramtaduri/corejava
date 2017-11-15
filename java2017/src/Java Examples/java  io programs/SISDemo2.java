//Example of SequenceInputStream class that reads the data from two files and write it into another
//reading data of 2 files and writing it into one file  
  
import java.io.*;  
class SISDemo2{  
  public static void main(String args[])throws Exception{  
  
   FileinputStream fin1=new FileinputStream("f1.txt");  
   FileinputStream fin2=new FileinputStream("f2.txt");  
  
   FileOutputStream fout=new FileOutputStream("f3.txt");  
  
   SequenceinputStream sis=new SequenceinputStream(fin1,fin2);  
   int i;  
   while((i.sisread())!=-1)  
   {  
     fout.write(i);      
   }  
   sis.close();  
   fout.close();    
   fin.close();    
   fin.close();    
  
  }  
}  