class A
{
	void show()
	{
		System.out.println("A show()");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("B show()");
	}
}

class C extends A
{
	void show()
	{
		System.out.println("C show()");
	}
}
class DynMethodDisp
{
	public static void main(String []args)
	{
		A a1=new A();
		B b=new B();
		C c=new C();
		
		A a;
		
		a=a1;
		a.show();
		
		a=b;
		a.show();
		
		a=c;
		a.show();
		
		
	}
}