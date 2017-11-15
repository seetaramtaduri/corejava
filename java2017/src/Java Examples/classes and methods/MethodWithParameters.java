class Box
{
	double width;
	double height;
	double depth;

	double volume()
	{
		 return(width*height*depth);
	}

	void SetDim(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}

}

class MethodWithParameters
{
	public static void main(String a[])
	{
		Box boxone= new Box();
		Box boxtwo = new Box();
		double vol;
		/*  
		  double i=10,j = 20, = 40;
		  */

		boxone.SetDim(10,10,10);//width = 10;
		

		vol = boxone.volume();// = boxone.width * boxone.height * boxone.depth;

		System.out.println("Volume of BoxOne= "+vol);  

		boxtwo.SetDim(5,5,10);//width = 5;
		

		vol = boxtwo.volume();// = boxtwo.width * boxtwo.height * boxtwo.depth;

		System.out.println("Volume of BoxOne= "+vol);
	}
}


