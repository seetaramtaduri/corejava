// Program to Demo to Interface to display Date
import java.lang.*;
import java.io.*;
import java.util.*;
interface MyInt
{
void display();
}
class Cls implements MyInt
{
public void display()
{
Date d=new Date();
System.out.println("System Date : ");      
System.out.print(d);      
}
}

class Demo31
{
public static void main(String args[])
throws IOException
{
Cls c=new Cls();
c.display(); 
}
}

