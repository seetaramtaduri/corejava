import java.io.*;
class Filecopy
{
public static void main(String a[]) throws IOException
{
int ch;
FileInputStream fin=new FileInputStream(a[0]);
FileOutputStream fout=new FileOutputStream(a[0]);
while((ch=fin.read())!=-1)
fout.write(ch);
fin.close();
fout.close();
System.out.println("1 file copied");
}
}
