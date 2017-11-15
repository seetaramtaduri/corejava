class Box
{
	double width;
	double height;
	double depth;
     Box() //default Constructor
	{
		System.out.println("Constructor without Parameters");
		width  = 5;
	    height = 5;
	    depth  = 5;
	}
    Box(double w,double h,double d) //parameterized Constructor
	{
			System.out.println("Constructors With Para");
			width  = w;
			height = h;
			depth  = d;
		}
     double volume() //A Method
	 {
		 return(width*height*depth);
	 }

}

class ParaConstructors
{
	public static void main(String a[])
	{
		Box boxone= new Box();
		Box boxtwo = new Box(3,3,3);
		double vol;

		vol = boxone.volume();

		System.out.println("Volume of BoxOne= "+vol);

		
		vol = boxtwo.volume();

		System.out.println("Volume of BoxOne= "+vol);
	}
}

