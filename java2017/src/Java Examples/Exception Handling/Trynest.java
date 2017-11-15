             public class Trynest
             {
             public static void main(String[]args)
             {
             int a=20;
             System.out.println("main");
             try
             {
             System.out.println("first try block");
             int j=131/a;
             try

           {
           int k;
             System.out.println("second try block");
             if(a==1)
              k=145/a-a;
             System.out.println("hello");
             int X[]={5};
             X[5]=32;
             System.out.println("array bound test");
             }
            
             catch(ArrayIndexOutOfBoundsException e)
             {
             System.out.println("ArrayException"+e);
             }
             }
             catch(ArithmeticException e)
             {
             System.out.println("ArithmeticException"+e);
             }
             }
             }
             
