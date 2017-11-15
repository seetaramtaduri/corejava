class A 
{
	public static void main(String[] args) 
	{
		A a=new A();

		System.out.println("Hello World!"+a.getClass().getSuperclass());
	}
}
class B extends A
{

B b=new B();
System.out.println(b.getClass().getSuperclass());



};