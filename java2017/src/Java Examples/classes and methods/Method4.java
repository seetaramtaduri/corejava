//program to demo on Methods with return type and with out arguments. 
//(And calculate the simple interest)
import java.io.*;
class Method4
{
        public static void main(String args[])
        throws IOException
        {
        Method4 x=new Method4();
        float result=x.simple();
        System.out.println("Simple interest is"+result);
        }
 float simple() throws IOException
       {
        int p,t;
        float s,r;
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter amount and time");
        p=Integer.parseInt(dis.readLine());
        t=Integer.parseInt(dis.readLine());
        System.out.println("Enter rate of intrest");
        r=Float.parseFloat(dis.readLine());
        s=(float) p*t*r/100;   /*type casting*/
        return s;
      }
}

