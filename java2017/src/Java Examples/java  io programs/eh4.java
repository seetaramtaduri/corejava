//NumberFormatException
class eh4
{
public static void main(String args[])
{
int invalid=0,number,count=0;
for(int i=0;i<args.length;i++)
{
try
{
number=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid=invalid + 1;
System.out.println("\nInvalid Number= " +args[i]);
continue;
}
count=count +1;
}
System.out.println("\nValid Number= " +count);
System.out.println("\nInvalid Number= " +invalid);
}
}