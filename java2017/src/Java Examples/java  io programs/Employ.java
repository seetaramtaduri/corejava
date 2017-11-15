Write a program to create Employ class whose objects is to be stored into a file.
//Employ information 
import java.io.*;
import java.util.*;
class Employ implements Serializable
{          private int id;
private String name;
private float sal;
private Date doj;
Employ (int i, String n, float s, Date d)
{          id = i;
name = n;
sal = s;
doj = d;
}
void display ()
{
System.out.println (id+ "\t" + name + "\t" + sal + "\t" + doj);
}
static Employ getData() throws IOException
{          BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
System.out.print ("Enter employ id : ");
int id = Integer.parseInt(br.readLine());
System.out.print ("Enter employ name : ");
String name = br.readLine ();
System.out.print ("Enter employ salary : " );
float sal = Float.parseFloat(br.readLine ());
Date d = new Date ();
Employ e = new Employ (id, name, sal, d);
return e;
}
}