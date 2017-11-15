import java.io.*;
public class matadd
{
public static void main(String args[]) throws IOException
{
int a[][]=new int [5][5];
int b[][]=new int [5][5];
int res[][]=new int[5][5];
BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the number of rows and coln for a matrix");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
System.out.println("enter the number of rows and coln for b matrix");
int x=Integer.parseInt(br.readLine());
int y=Integer.parseInt(br.readLine());
if((m==x)&&(n==y))
{
  System.out.println("enter the a elements");
  for(int i=0;i<m;i++)
  {  
   for(int j=0;j<n;j++)
   {
   a[i][j]=Integer.parseInt(br.readLine());
   }
  }
 System.out.println("enter the  b elements");
    for(int i=0;i<x;i++)
    {
     for(int j=0;j<y;j++)
      {  
        b[i][j]=Integer.parseInt(br.readLine());
      }
    }
    
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{

 res[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("the matrix addition is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{

System.out.print(+res[i][j]+" ");
}
System.out.println("\n");
}
}
else
System.out.println("connot  perform addition");

}
}
