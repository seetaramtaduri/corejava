class myexception extends  Exception
{
private int detail;
my exception(int a)
{
detail=a;
}
public String to String()
{
return"myexception [" +detail+"]";
}
}
class exceptiondemo
{
static void compute(int a) throws myexception;
{
System.out.println("called compute("+a+"));
if (a>10)
throw new myexception(a);
System.out.println("exiting normally from compute");
}
public static void main(String a[])
{
try
{
compute(1);
compute(20);
}
catch(myexception me)
{
System.out.println("caught" +me);
}
}
}
