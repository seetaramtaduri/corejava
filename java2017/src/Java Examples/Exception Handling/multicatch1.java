//wap for multiplecatch.
class multicatch1
{
public static void main(String args[])
{
try
{
int a=0;
int b=42/a;
 }
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
//System.out.println(e.getMessage());
}
}

}
