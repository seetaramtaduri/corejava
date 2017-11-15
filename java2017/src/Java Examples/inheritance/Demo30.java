// Program to Demo Abstract class with caliculating Area of different shapes and using constructors with super keyword
import java.lang.*;
import java.io.*;
abstract class Shape
{
  int l;
  Shape(int tl)
  {
       l=tl;
   } 
  
abstract void area();

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

class Demo30
{
public static void main(String args[])
throws IOException
{
Shape ref; 
Square s=new Square(10);
Rectangle r=new Rectangle(10,20);
Triangle t=new Triangle(10,20);
ref=s;
ref.area();
ref=r;
ref.area();
ref=t;
ref.area();
}
}

