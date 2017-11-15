class Box
{
	double width;
	double height;
	double depth;

	Box()
	{
		System.out.println("Constructor Without Parameters");
		width  = 5;
	    height = 5;
	    depth  = 5;
	   System.out.println("vol is"+(width*height*depth));
	}

	Box(double w,double h,double d)
	{
		System.out.println("Constructor With Parameters");
		width  = w;
	    height = h;
	    depth  = d;
	 System.out.println("vol is"+(width*height*depth));
	
	}
    /*double volume()
	{
		 return(width*height*depth);
	}*/

}

class OverLoadingConstructors
{
	public static void main(String a[])
	{
		Box boxone= new Box();
		Box boxtwo = new Box(1,2,3);
		//double vol;

		//vol = boxone.volume();// = boxone.width * boxone.height * boxone.depth;

		//System.out.println("Volume of BoxOne= "+vol);

	    //vol = boxtwo.volume();// = boxtwo.width * boxtwo.height * boxtwo.depth;

		//System.out.println("Volume of BoxOne= "+vol);
	}
}

