import java.io.*;
public class FisDemo{
public static void main(String[] args) throws IOException{
File f;
f=new File("myfile.txt");
if(!f.exists()&& f.length()<0)
System.out.println("The specified file is not exist");
else{
FileInputStream finp=new FileInputStream(f);
byte b;
do{
b=(byte)finp.read();
System.out.print((char)b);
}
while(b!=-1);
finp.close();
}
}
}