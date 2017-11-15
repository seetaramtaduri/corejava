 Write a program to show serialization of objects.
//ObjectOutputStream is used to store objects to a file
import java.io.*;
import java.util.*;
class StoreObj
{          public static void main (String args[]) throws IOException
{          BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
FileOutputStream fos = new FileOutputStream ("objfile");
ObjectOutputStream oos = new ObjectOutputStream ( fos );
System.out.print ("Enter how many objects : ");
int n = Integer.parseInt(br.readLine () );
for(int i = 0;i<n;i++)
{          Employ e1 = Employ.getData ();
oos.writeObject (e1);
}
oos.close ();
fos.close ();
}
}