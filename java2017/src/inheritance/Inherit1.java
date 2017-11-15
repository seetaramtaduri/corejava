// Program to Demo on Single level Inheritance
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
class Inherit1
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
