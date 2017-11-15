import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.FileNotFoundException;
  import java.io.IOException;
 public class TextFileInputDemo
 {
    public static void main(String[] args)
     {   
       try
         {
            BufferedReader br= 
              new BufferedReader(new FileReader("morestuff2.txt"));
             String line = br.readLine();
            System.out.println(
                              "The first line read from the file is:");
            System.out.println(line);
        
           line = br.readLine();
             System.out.println(
                             "The second line read from the file is:");
           System.out.println(line); 
             br.close();
      }
         catch(FileNotFoundException e)
        {
           System.out.println("File morestuff2.txt was not found");
           System.out.println("or could not be opened.");
        }
         catch(IOException e)
       {
            System.out.println("Error reading from morestuff2.txt.");
        }
     }
 }