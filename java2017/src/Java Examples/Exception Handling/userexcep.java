/* types of exceptions:--
built-in exceptions----ArithmeticException,ClassNotFoundException and etc

user-defined exceptions:--
the user can also create his own exceptions which are called user-defined
exceptions.
the following steps are followed in creation of user-defined exceptions,
---the user should create an exception class as a subclass to Exception class.
Since all exceptions are subclasses of Exception class,the user should also
make his class a subclass to it
syn:--   class MyException extends Exception
----the user can write  a default contructor in his own exception class.
He can use it,in case he does not want to store any exception details.if 
the user does not want to create an empty object to his exception class.
he can eliminate writing the default constructor.
             MyEXception() {    }
--- the user can create a parameterized constructor with a string as a 
parameter. He can use this to store exception details. he can call super
class(Exception) constructor from this and send the string there.
          MyException(String str)
	{
	super(str);
	}
--when the user wants to raise his own exception,he should create an 
object to his exception class and throw it using throw clause, as
	MyException me=new MyException("exception details");
	throw me;
*/


//wap for user defined exception

class own extends Exception
{
own(String msg)
{
super(msg);
}
}
class userexcep
{
public static void main(String args[])
{
try
{
int mark=Integer.parseInt(args[0]);
if(mark>100)
{
throw new own("greater than 100");
}                         
System.out.println("marks="+mark);
}
catch(own e)
{
System.out.println("exception caught");

System.out.println(e.getMessage());
}
finally
{
System.out.println("completed");
}
}
}
