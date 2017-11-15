/*WRITE JAVA PRORAM TO RAISE AN EXCEPTION "invalid salary " IF THE USER CAN INPUT THE SALARY AS 0 OR GREATER THAN 10,000 TO GENERATE A PAYSLIP OF AN EMPLOYEE */


class InvalidSalary extends Exception
{
	private int detail;
        InvalidSalary(int a)
       	{
        	detail=a;
       	}

	public String toString()
       	{
        	return "Invalid Salary["+detail+"]";
       	}
}

class userInterface
{
	static void compute(int a) throws InvalidSalary
       	{      
	        System.out.println("Called computer("+a+")");

		if ((a<0) || (a>10000))
        		throw new InvalidSalary(a);

		System.out.println("Normal exit");
        }

	public static void main(String args[])
       	{
		try
	     	{
			compute(-340);
			compute(12000);
	     	}
	   	catch(InvalidSalary e)
	     	{
               		System.out.println("catch " +e);
	     	}
      	}
}
		
