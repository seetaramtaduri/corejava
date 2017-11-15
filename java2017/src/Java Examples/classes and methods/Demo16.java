// Program to Demo Student Class with Constructors
import java.lang.*;
import java.io.*;
class Student
{
  int rno;
  String name;
  
Student()	// Default Constructor 
{
rno=101;
name="Seetaram";
}

Student(int tn,String tname)		//Parameter Constructor
{
rno=tn;
name=tname;
}

void store() 
throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("Enter Roll No : ");
rno=Integer.parseInt(br.readLine());
System.out.print("Enter Name : ");
name=br.readLine();
}

void display() 
{
System.out.println("Roll No : "+rno);
System.out.println("Name : "+name);
}

}

class Demo16
{
public static void main(String args[])
throws IOException
{
	Student s1=new Student();
	Student s2=new Student(102,"Kumar");
	Student s3=new Student();
	s3.store(); 
	s1.display();	
	s2.display();	
	s3.display(); 
}
}

