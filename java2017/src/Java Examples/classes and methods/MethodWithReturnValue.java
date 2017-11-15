class Box
{
	double width;
	double height;
	double depth;

	double volume()
	{

		 return(width*height*depth);
	}

}

class MethodWithReturnValue
{
	public static void main(String a[])
	{
		Box boxone= new Box();
		Box boxtwo = new Box();
		double vol;

		boxone.width = 10;
		boxone.height = 10;
		boxone.depth = 10;

		vol = boxone.volume();// = boxone.width * boxone.height * boxone.depth;

		System.out.println("Volume of BoxOne= "+vol);

		boxtwo.width = 5;
		boxtwo.height = 5;
		boxtwo.depth = 10;

		vol = boxtwo.volume();// = boxtwo.width * boxtwo.height * boxtwo.depth;

		System.out.println("Volume of Boxtwo= "+vol);
	}
}

