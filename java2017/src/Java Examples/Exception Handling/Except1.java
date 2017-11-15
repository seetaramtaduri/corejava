public class Except1
{
public static void main(String args[])
{
System.out.println("CHECKING");
try
{
int i=0;
int j=100;
int k=j/i;
System.out.println("EXCEPTION IS RAISED");
}
catch(ArithmeticException e)
{
System.out.println("EXCEPTION IS HANDLED " +e);
System.out.println("HELLO");

}
 }
  }

