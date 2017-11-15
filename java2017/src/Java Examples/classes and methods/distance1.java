class Distance 
{
int feet;
int inches;
Distance(int f,int i)
{
feet=f;
inches=i;
}
void displayDistance()
{
System.out.println(feet+"feet"+inches+"inches");
}
}
class main
{
public static void main(String s[])
{
Distance d1=new Distance(10,9);
System.out.println("the first distance is :");
d1.displayDistance();
Distance d2=new Distance(9,10);
System.out.println("the second distance is :");
d2.displayDistance();
addTwoDistances a=new addTwoDistances();
Distance sum=a.add(d1,d2);
System.out.println("the sum of two distances is ");
sum.displayDistance();
}//main
}
class addTwoDistances
{
Distance add(Distance one,Distance two)
{
int i=one.inches+two.inches;
int f=one.feet+two.feet;
if(i>=12)
{
i=i-12;
f++;
}
Distance d=new Distance(f,i);
return d;
}
}