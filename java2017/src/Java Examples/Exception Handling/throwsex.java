/*throws Clause:--Even if the programmer is not handling runtime exceptions,
the java compiler will not give any error related to runtime exception.
But the rule is that the programmer should handle checked exceptions.
In case the programmer does not want to handle the checked exceptions,
he should throw them out using throws clause.
*/
//wap which shows the use of throws clause.

class t1
{
   public t1()throws NullPointerException
    {
           System.out.println("caught");
           throw new NullPointerException("demo");
	}

}
class throwsex
{
	public static void main(String args[])
	{
		try
		{
			t1 obj=new t1();
		}
		catch(NullPointerException e)
		{
			System.out.println("recaught");
		}
	}
}
