// Program to Demo Inheritance with super keyword(method overiding)
import java.lang.*;
import java.io.*;
class One
{
int a;
void show()
{
System.out.println(" Value of a in Super class = "+a);
}
}

class Two extends One
{
int a;
void store()
{
super.a=10;
a=20;
}
void show()
{
super.show(); 	// Method Overriding
System.out.println(" Value of a in Sub class = "+a);
}
}

class Demo24
{
public static void main(String args[])
{
Two t=new Two();
t.store();
t.show();
}
}
