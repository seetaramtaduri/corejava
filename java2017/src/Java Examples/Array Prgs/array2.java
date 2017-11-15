class array
{
  int a[][]={{1,2},
           {2,1}
           };
  int b[][]={{2,3},
           {2,1}
           };
  int c[][]=new int[2][2];
 

void show()
{
 for(int i=0;i<2;i++)
  {
     for(int j=0;j<2;j++)
     {
       c[i][j]=a[i][j]-b[i][j];
     }
  } 


  for(int i=0;i<2;i++)
   {
     for(int j=0;j<2;j++)
      {
        System.out.print("  "+c[i][j]);
      } System.out.println("\n");
   }
 }
}
class array2
{
 public static void main(String arr[])
  {
  array a=new array();
a.show();
  }
}