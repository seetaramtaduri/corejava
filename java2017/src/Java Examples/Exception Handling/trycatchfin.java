//wap for try, catch and finally block

class trycatchfin
{
public static void main(String args[])
{
try
{
int a=args.length;
int b=42/a;
System.out.println("b="+b);
}

catch(ArithmeticException e)
{
System.out.println("Arithemetic exception:"+e);
}
finally
{
System.out.println("final block");

}

System.out.println("after try block");
}

}
