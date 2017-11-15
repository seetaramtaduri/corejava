class A 
{
	
	int x;
	B b;
	
	A(B b) //constructor that receives b's refrence
	{
       this.b=b; //copy B's refernce into b
	   x=10;
	}
	
	void disp()
	{
		System.out.println("x val in A="+x);
	    System.out.println("y val accessed from A"+b.y);
	}
}

class B
{

    int y;

	B(int y)
	{
		this.y=y;
	}

	void disp2()
	{

		System.out.println("y val in B"+y);
	}
}

class ObjRefRel
{
	public static void main(String[] args) 
	{
		
		B bobj = new B(22);
		
		A aobj = new A(bobj);

		aobj.disp();

		bobj.disp2();
		
		System.out.println("Hello World!");
	}
}
