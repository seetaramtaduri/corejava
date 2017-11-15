// Program to Demo Static Polymorphism with addition of 2,3 values and strings
import java.lang.*;
import java.io.*;
class Sample
{
public void add(int a,int b)
  {
System.out.println(" Aaddition of 2 values  : "+(a+b));          
} 

public void add(int a,int b,int c)
{
System.out.println(" Aaddition of 3 values  : "+(a+b+c));          
} 

public void add(String s1,String s2)
{
System.out.println(" Aaddition of 2 Strings  : "+s1+" "+s2);          
} 

}

class Demo28
{
public static void main(String args[])
throws IOException
{
Sample s=new Sample();
s.add(10,20);
s.add(10,20,30);
s.add("Seetaram","Taduri");
}
}

