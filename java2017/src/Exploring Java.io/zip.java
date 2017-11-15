//compressing a file using a DeflaterOutputStream
import java.io.*;
import java.util.zip.*;
class zip
{
public static void main(String a[])throws Exception
{
FileInputStream fis=new FileInputStream("one.txt");
FileOutputStream fos=new FileOutputStream("file2");
DeflaterOutputStream dos=new DeflaterOutputStream(fos);
int data;
while((data=fis.read())!=-1)
dos.write(data);
fis.close();
dos.close();
}
}

