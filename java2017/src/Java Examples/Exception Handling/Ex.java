//wap which tells the use of try,catch and finally block;
class Ex
{
public static void main(String args[])
{
try
{
System.out.println("open files");
int n=args.length;
System.out.println("n="+n);
int a=45/n;
System.out.println("a="+a);
}
catch(ArithmetecException ae)
{
System.out.println(ae);
System.out.println("please pass data while running this prog");
}
finally{
System.out.println("close files");
}
}
}
