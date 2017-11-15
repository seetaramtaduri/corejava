// A simple example of recursion.
import java.util.*;

class Recursion 
{
  public static void main(String args[]) throws Exception
  {
   
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=s.nextInt();
	Factorial f = new Factorial();
    System.out.println("Factorial is " + f.fact(n));
  }
}
class Factorial 
{
  // this is a recusive function
  int fact(int n) 
  {
    int result;
    if(n==1) 
	{
		return 1;
    }
    result = fact(n-1) * n;
    return result;
  }
}
