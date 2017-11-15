import java.util.*;

public class StringTokenizing
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("WE ARE AT ABHYAAS");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		System.out.println("The total no. of tokens generated:"+ st.countTokens());
		}
	  
	}
}
