import java.io.*;

class inputstreamreader 
{
    public static void main(String args[]) {
        try {
            int character;
            InputStreamReader inputstreamreader = new InputStreamReader(System.in);
            while ((character = inputstreamreader.read()) != -1) {
                System.out.print((char) character);
            }
        } 
        catch (IOException e) {}
    }
}