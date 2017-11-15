import java.io.*;

public class chararrayreader 
{
    public static void main(String args[]) throws IOException 
    {
        char data[] = {'T','h','i','s',' ','i','s',' ','a',
            ' ','s','t','r','i','n','g',' ','o','f',
            ' ','t','e','x','t','.'};

        CharArrayReader chararrayreader = new CharArrayReader(data);

        int character;

        while((character = chararrayreader.read()) != -1) {
            System.out.print((char)character);
        }
    }
}
