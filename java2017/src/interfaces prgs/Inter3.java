// Program to Demo Interface with constants and methods
import java.lang.*;
import java.io.*;
interface MyInt
{
int INCH=12;
int CM=30;
int foot_inch(int f);
int foot_cm(int f);
}

class Cls implements MyInt
{
public int foot_inch(int f)
{
return (f*INCH);
}

public int foot_cm(int f)
{
return (f*CM);
}

}

class Inter3
{
public static void main(String args[])
throws IOException
{
Cls c=new Cls();
int n,r;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Value in Foot : ");      
n=Integer.parseInt(br.readLine());
r=c.foot_inch(n);
System.out.println("Foot in Inches : "+r);         
r=c.foot_cm(n);
System.out.println("Foot in Centi meters : "+r);         
}
}


