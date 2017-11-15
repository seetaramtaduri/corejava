//showing de-serialization of objects
//ObjectInputStream is used to read objects from a file.
import java.io.*;
class Getobj
{
public static void main(String a[])throws Exception
{
FileInputStream fis=new FileInputStream("objfile");
ObjectInputStream ois=new ObjectInputStream(fis);
try
{
Employee e;
while((e=(Employee)ois.readObject())!=null)
{

e.display();
}
}catch(EOFException ee){
System.out.println("end of file reached");
}
finally{
ois.close();
}
}
}
