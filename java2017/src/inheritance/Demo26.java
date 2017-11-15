// Program to Demo Inheritance with Employee data
import java.lang.*;
import java.io.*;
class Employee
{
  int eno;
  String name;
  float basic;

void store()
  throws IOException
  {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print(" Enter No : "); 
eno=Integer.parseInt(br.readLine());
System.out.print(" Enter Name : "); 
name=br.readLine();
System.out.print(" Enter Basic : "); 
basic=Float.parseFloat(br.readLine());
}
}

class Salary extends Employee
{
float ta,da,pf,net;

void cal()
{
ta=basic*10/100;
da=basic*10/100;
pf=basic*10/100;
net=basic+ta+da-pf;
}

void show()
{
System.out.println(" No : "+eno);
System.out.println(" Name : "+name);
System.out.println(" Basic : "+basic);
System.out.println(" TA : "+ta);
System.out.println(" DA : "+da);
System.out.println(" PF : "+pf);
System.out.println(" Net : "+net);
}
}

class Demo26
{
public static void main(String args[])
throws IOException
{
Salary s=new Salary();
s.store();
s.cal();
s.show();
}
}
