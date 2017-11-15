// Program to Demo Inheritance with super keyword
import java.lang.*;
import java.io.*;
class One
{
protected int a;
public int b;
  int c;
private int d;
  One()
  {
a=10;
b=20;
c=30;
d=40;
}
void show()
{
System.out.println(" Value of d = "+d);
}
}

class Two extends One
{
void show()
{
System.out.println(" Value of a = "+a);
System.out.println(" Value of b = "+b);
System.out.println(" Value of c = "+c);
super.show(); 	// Method Overriding
}
}

class Demo23
{
public static void main(String args[])
{
Two t=new Two();
t.show();
}
}


