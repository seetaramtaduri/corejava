import java.io.*;

class fileoutputstream 
{
    public static void main(String args[]) throws Exception 
    {
        byte data[] = "This is a string of text.".getBytes();

        FileOutputStream fileoutputstream1 = new FileOutputStream("file1.txt");
        for (int loop_index = 0; loop_index < data.length; loop_index++) {
            fileoutputstream1.write(data[loop_index]);
        }

        FileOutputStream fileoutputstream2 = new FileOutputStream("file2.txt");
        fileoutputstream2.write(data);

        FileOutputStream fileoutputstream3 = new FileOutputStream("file3.txt");
        fileoutputstream3.write(data, 5, 10);

        fileoutputstream1.close();
        fileoutputstream2.close();
        fileoutputstream3.close();
  }
}
