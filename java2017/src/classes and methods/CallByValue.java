class Sample
{
	void Add(int m,int n)
	{
		m = m + 10;
		n = n + 5;
	}
}


public class CallByValue
{
	public static void main(String ar[])
	{
		Sample s = new Sample();

		int x = 10,y = 20;

		System.out.println("Before X and Y = "+x + "  " + y); //  10 20
		
		s.Add(x,y);

		System.out.println("After X and Y = "+x + "  " + y); // 10 20 
	}
}