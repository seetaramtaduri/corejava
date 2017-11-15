class cloneex implements Cloneable
{
int i;
int j;
public Object create()
{
try
{
return super.clone();
}
catch(Exception e)
{
System.out.println(e);
return e;
}
}
}
class cloneexmain
{
public static void main(String args[])throws Exception
{
cloneex clex=new cloneex();
clex.i=10;
clex.j=20;
System.out.println("First Object Address:"+clex);
System.out.println("I value: For First:"+clex.i);
System.out.println("j value: For First:"+clex.j);
cloneex clex2=(cloneex)clex.create();
System.out.println("Second Object Address:"+clex2);
System.out.println("I value: For Second:"+clex2.i);
System.out.println("j value: For Second:"+clex2.j);

}
}