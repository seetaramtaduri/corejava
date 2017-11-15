// Program to Demo Dynamic Polymorphism with 'reference' variable
import java.lang.*;
import java.io.*;
class One
{

public void display()
{
System.out.println("It is class One Method");          
} 

}

class Two extends One
{

public void display()
{
System.out.println("It is class Two Method");          
} 

}

class Demo29
{
public static void main(String args[])
throws IOException
{
One ref;
One o=new One();
Two t=new Two();
ref=o;
o.display();
ref=t;
t.display();
}
}


