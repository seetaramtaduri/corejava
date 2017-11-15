class Multicatch
{
    public static void main(String args[])
    {
       try
       {
         int a=args.length;
         System.out.println("value of a: "+a);
         int b=10/a;
         int c[]={1};
         c[10]=90;
       }
       catch(ArithmeticException e)
       {
          System.out.println("error: divided by zero"+e);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("this is an array index out of bounds"+e);
       }
       System.out.println("this is after catch");
    }
 }


