import java.io.*;

class fileinputstream 
{
    public static void main(String args[]) throws Exception 
    {
        int size;
        FileInputStream fileinputstream = new FileInputStream("fileinputstream.java");

        System.out.println("Available bytes: " + (size = fileinputstream.available()));
        System.out.println("Reading 50 bytes....");

        byte bytearray[] = new byte[50];
        if (fileinputstream.read(bytearray) != 50) {
          System.out.println("Could not get 50 bytes");
        }

        System.out.println(new String(bytearray, 0, 50));

        System.out.println("Skipping 50 bytes...");

        fileinputstream.skip(50);

        System.out.println("Reading 50 bytes....");
        if (fileinputstream.read(bytearray) != 50) {
          System.out.println("Could not get 50 bytes");
        }
        System.out.println(new String(bytearray, 0, 50));

        fileinputstream.close();
  }
}
