import java.io.*;

class bytearrayinputstream 
{
    public static void main(String args[]) throws IOException 
    {
        byte data[] = "Here is a string".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        int character;
        while((character = in.read()) != -1){
            System.out.print((char) character);
        }
    }
}
