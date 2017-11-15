// Checking for the End of a Text File with hasNextLine (part 1 of 2)
 import java.util.Scanner;
 import java.io.FileInputStream;
  import java.io.PrintWriter;
 import java.io.FileOutputStream;

  public class HasNextLineDemo
  {
      public static void main(String[] args)
     {
          Scanner s = null;
          PrintWriter out = null;
         try
         {
            s = new Scanner(new FileInputStream("original.txt"));
            out = new PrintWriter(new FileOutputStream("numbered.txt"));
         }
          catch(Exception e)
         {
             System.out.println("Problem opening files.");
             System.exit(0);
         }
         String line = null;
          int count = 0;
          while (s.hasNextLine( ))
          {
             line = s.nextLine( );
             count++;
             out.println(count + " " + line);
          }
              System.out.println("sucessfully written to numberd.txt file open it");
		      s.close( );
              out.close( );
      }
  }