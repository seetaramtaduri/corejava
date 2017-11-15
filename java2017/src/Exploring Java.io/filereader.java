import java.io.*;

class filereader 
{
    public static void main(String args[]) throws Exception 
    {
        FileReader filereader = new FileReader("file.txt");
        char data[] = new char[1024];

        int charsread = filereader.read(data);
        System.out.println(new String(data, 0 , charsread));

        filereader.close();
    }
}
