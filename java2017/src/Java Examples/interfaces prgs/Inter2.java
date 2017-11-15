// Program to Demo Interface with 2 implemented classes and reference variable
import java.lang.*;
import java.io.*;

interface MyInt
{
void show(int n);
}

class Square implements MyInt
{
public void show(int n)
{
System.out.println("Square Value = "+(n*n));      
}
}

class Cube implements MyInt
{
public void show(int n)
{
System.out.println("Cube Value = "+(n*n*n));      
}
}

class Inter2
{
public static void main(String args[])
throws IOException
{
MyInt ref;
Square s=new Square();
Cube c=new Cube();
ref=s;
ref.show(5);
ref=c;
ref.show(5);
}
}
