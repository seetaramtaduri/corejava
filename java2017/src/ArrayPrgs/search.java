import java.io.*;
public class search
{
public static void main(String args[]) throws IOException
{ 
   BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
   System.out.println("how many numbers do u want to insert");
   int n=Integer.parseInt(br.readLine());
   int a[]=new int [n];
  System.out.println("enter "+n+" elements");
  for(int i=0;i<n;i++)
  {
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("enter the element to search");
int num=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
   if(a[i]==num)
System.out.println(+num+"is found at "+i+" position");
}
}
}


