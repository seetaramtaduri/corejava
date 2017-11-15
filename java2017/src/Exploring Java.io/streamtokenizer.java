import java.io.*;

class streamtokenizer 
{
    public static void main(String args[]) throws Exception 
    {
        FileReader filereader = new FileReader("file.txt");
        StreamTokenizer streamtokenizer = new StreamTokenizer(filereader);

        String instring;

        while(streamtokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if(streamtokenizer.ttype == StreamTokenizer.TT_WORD)
                System.out.println(streamtokenizer.sval);
        }

        filereader.close();
    }
}
