/*

    OVERRIDDEN METHODS allow JAVA to Support RUNTIME POLYMORPHISM

    OVERRIDDEN METHODS are another way that JAVA implements the ONE INTERFACE 
	MULTIPLE METHODS aspect of POLYMORPHISM

  DYNAMIC, RUN-TIME POLYMORPHISM is one of the most POWERFUL mechanisms
  that OOD brings to bear on CODE REUSE and ROBUSTNESS


*/

class Shape
{
	double d1;
	double d2;

	Shape(double a,double b)
	{
		d1 = a;
		d2 = b;
	}

	double Area()
	{
		System.out.println("Area for Nothing");
		return 0;
	} 

}

class Rectangle extends Shape
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}

	double Area()
	{
		
		return d1*d2;

	}
}

class Triangle extends Shape
{
	Triangle(double a,double b)
	{
		super(a,b);
	}

	double Area()
	{
		
		return d1*d2/2;

	}
}

public class RunTimePolym 
{
	public static void main(String ar[])
	{
		Shape s = new Shape(5,5);
		Rectangle r = new Rectangle(5,5);
		Triangle t = new Triangle(5,5);

		Shape sref;

		sref = r;
		System.out.println("Area is "+sref.Area() );
		System.out.println("Area is "+r.Area() );

		sref = t;
		System.out.println("Area is "+sref.Area() );

		sref = s;
		System.out.println("Area is "+sref.Area() ); 
	}
}



