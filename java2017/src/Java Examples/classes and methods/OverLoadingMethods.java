class OverLoad
{
	void Show()
	{
                System.out.println("No Parameters");
	}

	void Show(int a)
	{
                System.out.println("One Parameter"+a);
	}

	void Show(int a,int b)
	{
                System.out.println("Two Parameters");
                System.out.println(a);
                System.out.println(b);
	}

        double Show(double a,double d,double i)
	{
                System.out.println("double as Return Type");
                return a ;
	}
}


class OverLoadingMethods
{
	public static void main(String a[])
	{
		OverLoad ov = new OverLoad();
		double res;

		ov.Show();
		ov.Show(5);
		ov.Show(5,10);
                res = ov.Show(100.90,10.43,5.43);
		System.out.println("OutPut = "+res);
	}
}
