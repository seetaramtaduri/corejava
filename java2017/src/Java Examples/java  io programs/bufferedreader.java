import java.io.*;
class BuffReadDemo
{
    public static void main(String args[]) throws Exception 
    {
        FileReader filereader = new FileReader("file.txt");
        BufferedReader BuffReadDemo= new BufferedReader(filereader);
        String instring;

        while((instring = bufferedreader.readLine()) != null) {
            System.out.println(instring);
        }

        filereader.close();
    }
}
