import java.io.*;
class Method5
{
 static int  n;
  static void read() throws Exception
  {
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   System.out.println("Enter n Nubmer");
   n=Integer.parseInt(br.readLine());
   }
   static void square()
   {
   System.out.println("Square :"+(n*n));
   }
   static void cube()
   {
   System.out.println("Cube :"+(n*n*n));
   }
   public static void main(String args[]) throws Exception
   {
    read();
    square();
    cube();
    }
}

