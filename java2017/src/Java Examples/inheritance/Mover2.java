// wap to implement Method overloading by using difference in number of the Arguments
//(And find area of the square, rectangle and Cuboid)
import java.io.*;
import java.lang.*;
class Mover2
{
     public static void main(String a[])
     {
     area(5);
     area(9,3);
     area(10,30,5);
     }
     static void area(int x)
     {
     System.out.println("Area of Square Is"+(x*x));
     }
     static void area(int x,int y)
     {
     System.out.println("Area of Rectangle Is  "+(x*y));
     }
    static void area(int x,int y,int z)
     {
     System.out.println("Area of the Cuboid Is  "+(x*y*z));
     }
 };


