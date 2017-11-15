//program to demo super class constructor

class Area
{
  int dim1;
  int dim2;

  Area( ) //def constructor
  {
   dim1=0;
   dim2=0;
  }
  Area(int a1, int a2)//parameterized constructor
  {
    dim1=a1;
    dim2=a2;
  }
  Area(Area obj)//object as an argument 
  {
    dim1=obj.dim1;
    dim2=obj.dim2;
 }

 Area(int side) //constructor used when square is created
 {
  dim1=dim2=side; 
 }

 int findArea()
 {
  return dim1*dim2;
 }

}

class SuperDemo extends Area
{
 String color;
 SuperDemo(int d1,int d2,String col)
 {
  super(d1,d2);//calls Area class parameterized constructor
               //and pass 20 30 values
  color=col;
 
 }

 SuperDemo()
 {
  super();//calls def constructor of Area class
  color="none";
 }

 SuperDemo(SuperDemo obj)
 {
  super(obj);
  color=obj.color;
 }
}

class SuperKeyDemo
{
 public static void main(String args[])
 {
  SuperDemo area1=new SuperDemo(); //invloes def constructor
  
  SuperDemo area2=new SuperDemo(20,30,"black");
  
  SuperDemo area3=new SuperDemo(20,20,"white");
  
  SuperDemo area4=new SuperDemo(area2); //passing object
  
  int garea;

  garea=area1.findArea(); //calculate prod of dimension value
  System.out.println("Area of the solid is : " +garea);
  System.out.println("Color of the solid is : "+ area1.color);
  System.out.println();

  garea=area2.findArea();
  System.out.println("Area of the solid is : " +garea);
  System.out.println("Color of the solid is : "+ area2.color);
  System.out.println();

  garea=area3.findArea();
  System.out.println("Area of the solid is : " +garea);
  System.out.println("Color of the solid is : "+ area3.color);
  System.out.println();

  garea=area4.findArea();
  System.out.println("Area of the solid is : " +garea);
  System.out.println("Color of the solid is : "+ area4.color);
  System.out.println();
 }
}
