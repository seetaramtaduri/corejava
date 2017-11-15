//uncompressing a file using an InflaterinputStream
import java.io.*;
import java.util.zip.*;
class unzip
{
public static void main(String a[])throws Exception
{
FileInputStream fis=new FileInputStream("file2");
FileOutputStream fos=new FileOutputStream("file3");
InflaterInputStream iis=new InflaterInputStream(fis);
int data;
while((data=iis.read())!=-1)
//dos.write(data);
fos.write(data);
fos.close();
iis.close();
}
}

