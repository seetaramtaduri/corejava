import java.io.*;
public class CreateFile1{
public static void main(String[] args) throws IOException{
File f;
f=new File("myfile.txt");
if(!f.exists()){
f.createNewFile();
System.out.println("file created sucessfully");
}
else
System.out.println("file already created sucessfully");

}
}