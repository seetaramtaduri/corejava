//program to demo constructor overloading

class Box 
{
    double width;
    double height;
    double depth;

  // constructor used when all dimensions specified
  Box(double w, double h, double d) 
  {
    width = w;
    height = h;
    depth = d;
  }

  // constructor used when no dimensions specified
  Box() 
  {
    width = 20;  // use -1 to indicate
    height = 30; // an uninitialized
    depth = 45;  // box
  }

  // constructor used when cube is created
  Box(double len) {
    width = height = depth = len;
  }

  // compute and return volume
  double volume() 
  {
    return width * height * depth;
  }
}
  
class OverloadCons
{
    public static void main(String args[])
	{
      // create boxes using the various constructors
      Box box1 = new Box(10, 20, 15);//dimensions are specified
      Box box2 = new Box();//no dimensuions specified
      Box cube = new Box(7);

    double vol;

    // get volume of first box
    vol = box1.volume();
    System.out.println("Volume of mybox1 is " + vol);

    // get volume of second box
    vol = box2.volume();
    System.out.println("Volume of mybox2 is " + vol);

    // get volume of cube
    vol = cube.volume();
    System.out.println("Volume of mycube is " + vol);
  }
}
