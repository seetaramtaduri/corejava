import java.text.DecimalFormat;
class dec
{
public static void main(String args[])
{
try
{
double x=25.678;
DecimalFormat d=null;
System.out.println(d.format(x));
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());
System.out.println(e.toString());
e.printStackTrace();
}
}
}
