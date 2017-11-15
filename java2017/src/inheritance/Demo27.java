// Program to Demo Inheritance with caliculating Area of different shapes and using constructors
// with super keyword
import java.lang.*;
import java.io.*;
class Shape
{
int l;

Shape(int tl)
{
l=tl;
} 

}

class Square extends Shape
{
int a;

Square(int sl)
{
super(sl);
}  

void area()
{
a=l*l;
System.out.println(" Area of Square : "+a);      
}
}

class Rectangle extends Shape
{
int b,a;

Rectangle(int rl,int rb)
{
super(rl);
b=rb;  
}  

void area()
{
a=l*b;
System.out.println(" Area of Rectangle : "+a);      
}
}

class Triangle extends Shape
{
int a,h;

Triangle(int tb,int th)
{
super(tb);
h=th;
}  

void area()
{
a=(l*h)/2;
System.out.println(" Area of Triangle : "+a);      
}
}

class Demo27
{
public static void main(String args[])
throws IOException
{
Square s=new Square(10);
Rectangle r=new Rectangle(10,20);
Triangle t=new Triangle(10,20);
s.area();
r.area();
t.area();
}
}

