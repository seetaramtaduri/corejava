class ArrayExec
{
 public static void main(String args[])
 {
  int arr[]=new int[4];
  try
  {
   arr[0]=25;
   arr[1]=50;
   arr[2]=75;
   arr[3]=100;
   arr[50]=125;
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("you have made an error");
  }
  for(int i=0;i<3;i++)
  {
   System.out.println(""+arr[i]);
  }
 }
}
