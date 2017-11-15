class Box1 implements Cloneable 
{
		int value;
	public Box1()
	{value=0;}
	public void setValue(int v)
	{
		value=v;
	}
	public int getValue()
	{
		return value;
	}
	public Object Clonable()
	{
		Box1 b=new Box1();
		b.setValue(getValue());
		return b;
	}
}

public class ClonableDemo
{
	public static void main(String args[])
	{
		Box1 x=new Box1();
		x.setValue(3);
		System.out.println("value of x:"+x.getValue());
		Box1 y=new Box1();
		y.setValue(9);
		System.out.println("value of y:"+y.getValue());
	}		
}