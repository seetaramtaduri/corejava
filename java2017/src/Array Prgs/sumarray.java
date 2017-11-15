
import java.io.*;
public class sumarray
{
public static void main(String args[]) throws IOException
{
int sum=0;
int a[]=new int [5];
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("enter array elements");
for(int i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
sum=sum+a[i];
}
for(int i=0;i<5;i++)
{
System.out.println("the array is:" +a[i]+" ");
}
System.out.println("sum=" +sum);
}
}
