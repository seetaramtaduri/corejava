/*Re-throwing exception:---when an exception occurs in a try block,it is 
caught by a catch block.this means that the thrown exception is available
to the catch block.
syn:---
	try{
	      throw exception;
	}	
	catch(Exception obj)
	{
	throw exception;   //rethrow the exception out	
	}
*/
//wap for rethrow an exception
class t1
{
public t1()
{
try
{
throw new NullPointerException("demo");
}
catch(NullPointerException e)
{
System.out.println("caught");
throw e;
}
}
}
class throwex1
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
