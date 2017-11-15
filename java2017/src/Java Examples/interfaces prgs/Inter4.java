// Program to create a Package with Addition,Subtraction,Multiplication,Division
import java.lang.*;
import java.io.*;

interface Father
{
int FP=2000;
float FH=6.2F;
}

interface Mother
{
int MP=2000;
float MH=5.0F;
}

class Child implements Father,Mother
{
int cp;
float ch;

public void properties()
{
cp=FP+MP;
ch=(FH+MH)/2;
System.out.println(" Child Property : "+cp);         
System.out.println(" Child Height: "+ch);         
}

}

class Inter4
{
public static void main(String args[])
throws IOException
{
Child c=new Child();
c.properties();
}
}
