 import java.io.*;

 public class ObjectInputStreamDemo
 {
   public static void main(String[] args)
    {
       try
       {
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream("numbers.dat"));
           System.out.println("Reading the file numbers.dat.");
           int n1 = ois.readInt();
           int n2 = ois.readInt();
		   int n3 = ois.readInt();
           System.out.println("Numbers read from file:");
           System.out.println(n1);
           System.out.println(n2);
		   System.out.println(n3);
           ois.close();
      }
       catch(FileNotFoundException e)
       {
           System.out.println("Cannot find file numbers.dat.");
       }
       catch(IOException e)
       {
          System.out.println("Problems with input from numbers.dat.");
       }
       System.out.println("End of program.");
   }
 }