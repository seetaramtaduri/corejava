//Program to Demo on functions with arguments and with out return type. (And perform all binary operations)
import java.io.*;
class Method3
{
        public static void main(String args[])
        throws IOException
        {
        int a,b;
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter any 2 nubmers");
        a=Integer.parseInt(dis.readLine());
        b=Integer.parseInt(dis.readLine());
        Method3 x=new Method3();
        x.sum(a,b);
        x.sub(a,b);        
        x.mul(a,b);
        x.div(a,b);
        }
  void sum(int x,int y)
  {
   System.out.println("Sum="+(x+y));
  }
  void sub(int x,int y)
  {
   System.out.println("Sub="+(x-y));
  }
  void mul(int x,int y)
  {
   System.out.println("Mul="+(x*y));
  }
  void div(int x,int y)
  {
   System.out.println("Div="+(x/y));
  }
}
