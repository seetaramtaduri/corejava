//Reading Input from a Text File Using Scanner (part 1 of 2)
  import java.util.Scanner;
  import java.io.*;
 

  public class TextFileScannerDemo
  {
      public static void main(String[] args)
      {
        System.out.println(" read three numbers and a line from morestuff.txt file");
         
		 Scanner s=null ;
         
		 try
         {
            FileInputStream fis= new FileInputStream("morestuff.txt");
		    s = new Scanner(fis);
         }
         catch(FileNotFoundException e)
         {
             System.out.println("File morestuff.txt was not found");
             System.out.println("or could not be opened.");
             System.exit(0);
         }
             int n1 = s.nextInt( );
             int n2 = s.nextInt( );
             int n3 = s.nextInt( );

             s.nextLine(); //To go to the next line

             String line = s.nextLine( );

             System.out.println(" three numbers are:");
             System.out.println(n1 + ", " + n2 + ", and " +  n3);

             System.out.println(" string   is:");
             System.out.println(line);

             s.close( );
      }
  }