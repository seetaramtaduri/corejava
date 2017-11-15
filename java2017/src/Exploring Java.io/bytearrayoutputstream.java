import java.io.*;

class bytearrayoutputstream 
{
    public static void main(String args[]) throws IOException 
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte data[] = "Here is a string".getBytes();

        bytearrayoutputstream.write(data);

        System.out.println(bytearrayoutputstream.toString());

        byte buffer[] = bytearrayoutputstream.toByteArray();
        for (int loop_index = 0; loop_index < data.length; loop_index++) {
            System.out.print((char) buffer[loop_index]);
        }

        OutputStream fileoutputstream = new FileOutputStream("file.txt");
        bytearrayoutputstream.writeTo(fileoutputstream);
        fileoutputstream.close();
    }
}
