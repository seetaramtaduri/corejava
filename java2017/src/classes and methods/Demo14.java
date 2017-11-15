// Program to Demo Employee Class
import java.lang.*;
import java.io.*;
class Employee
{
  int eno;
  String name;
float sal,ta,da,net;
  
void store() 
  throws IOException
  {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("Enter No : ");
eno=Integer.parseInt(br.readLine());
System.out.print("Enter Name : ");
name=br.readLine();
System.out.print("Enter Salary : ");
sal=Float.parseFloat(br.readLine());
}

void calc() 
{
ta=sal*10/100;
da=sal*10/100;
net=sal+ta+da;
}

void display() 
{
System.out.println("Emp No : "+eno);
System.out.println("Emp Name : "+name);
System.out.println("Emp Salary : "+sal);
System.out.println("Emp TA : "+ta);
System.out.println("Emp DA : "+da);
System.out.println("Emp Net Salary : "+net);
}

}

class Demo14
{
public static void main(String args[])
throws IOException
{
Employee e=new Employee();
e.store(); 
e.calc(); 
e.display(); 
}
}
