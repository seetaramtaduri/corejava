import java.lang.*;
import java.io.*;
abstract class Base
{
  int l;
  Base(int l)
  {
    this.l=l;
   }
abstract void area();
};
class Square extends Base
{
  int a;                  
  Square(int sl)
  {
    super(sl); //calling Constructor of Base Class
   }      
  void area()
  {
    a=l*l;
    System.out.println(" Area of Square : "+a);      
  }
}      
class Rectangle extends Base
{
  int b,a;
  Rectangle(int rl,int rb)
  {
    super(rl); //calling Constructor of Base Class
    b=rb;  
   }  
  void area()
  {
    a=l*b;
    System.out.println(" Area of Rectangle : "+a);      
  }
}
class Cuboid extends Base
{
  int a,b,h;
  Cuboid(int cl,int cb,int ch)
  {
    super(cl); //calling Constructor of Base Class
    b=cb;
    h=ch;
   }  
  void area()
  {
    a=l*b*h;
    System.out.println(" Area of Cuboid : "+a);      
  }
}     
class Dpoli2
{
 public static void main(String args[])
 throws IOException
 {
   Base ref;
   Square s=new Square(10);
   Rectangle r=new Rectangle(10,20);
   Cuboid c=new Cuboid(10,20,30);
   ref=s;
   ref.area();
   ref=r;
   ref.area();
   ref=c;
   ref.area();
    }
}
