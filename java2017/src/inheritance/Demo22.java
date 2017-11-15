// Program to Demo Inheritance
import java.lang.*;
import java.io.*;
class One
{
int x,y;
}

class Two extends One
{
int z;
void show()
{
System.out.println(" Value of x = "+x);
System.out.println(" Value of y = "+y);
System.out.println(" Value of z = "+z);
}
}

class Demo22
{
public static void main(String args[])
{
Two t=new Two();
t.x=10;
t.y=20;
t.z=30;
t.show();
}
}
