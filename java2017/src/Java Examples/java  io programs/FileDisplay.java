
/* JAVA PROGRAM THAT READS A FILE AND DISPLAYS A FILE AND DISPLAYS THE 
FILE  
ON THE SCREEN WITH A LINE NUMBER BEFORE EACH LINE*/ import java.io.*; 
class FileDisplay 
{ 
  public static void main(String[] args) throws IOException 
  { 
    int i,line_no=1; 
    String s=new String(); 
    FileInputStream fin; 
    try 
    { 
      fin=new FileInputStream("FileDisplay.java"); 
    } 
    catch(FileNotFoundException e) 
    { 
        System.out.println("file not found"); 
        return; 
    } 
         while((i=fin.read())!=-1) 
         {                
             if((char)i=='\n') 
              {     
                 System.out.print(line_no+" : "+s); 
                  System.out.print((char)i); 
                    line_no++;  
                    s=" "; 
                  } 
               else 
                   s=s+(char)i; 
       
        }   
       System.out.print(line_no+" : "+s); 
       fin.close(); 
   } 
} 