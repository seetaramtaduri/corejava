// Program to Demo Inheritance with Student data
import java.lang.*;
import java.io.*;
class Student
{
int rno;
String name;
}

class Dob extends Student
{
String dt;

void store()
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print(" Enter Roll No : "); 
rno=Integer.parseInt(br.readLine());
System.out.print(" Enter Name : "); 
name=br.readLine();
System.out.print(" Enter Date of Birth : "); 
dt=br.readLine();
}

void show()
{
System.out.println(" Roll No : "+rno);
System.out.println(" Name : "+name);
System.out.println(" Date of Birth :  "+dt);
}
}

class Demo25
{
public static void main(String args[])
throws IOException
{
Dob d=new Dob();
d.store();
d.show();
}
}

