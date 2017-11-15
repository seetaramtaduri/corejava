/*throw Clause:---there is also a throw statement available in java to 
throw an exception explicitly and catch it.
syn:--throw new NullpointerException("exception data");
*/
//wap for throw clause for throwing the ArithmeticException
class throwex
{
public static void main(String args[])
{
try
{
throw new ArithmeticException("hello");
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
}
}
