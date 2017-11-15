 Write a program showing deserialization of objects.
//ObjectInputStream is used to read objects from a file
import java.io.*;
class ObjRead
{          public static void main(String args[]) throws Exception
{
FileInputStream fis = new FileInputStream ("objfile");
ObjectInputStream ois = new ObjectInputStream (fis);
try
{          Employ e;while (  (e  = (Employ) ois.readObject() ) != null)
e.display ();
}
catch(EOFException ee)
{
System.out.println ("End of file Reached...");
}
finally
{          ois.close ();
fis.close ();
}
}
}