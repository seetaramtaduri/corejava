import java.io.*;
class  DemoArr1
{
	public static void main(String[] args)throws Exception 
	{
		
		int a[]=new int[5],i;
         DataInputStream dis=new DataInputStream(System.in);

		System.out.println("Enetr elements into array");
	
	    for(i=0;i<a.length;i++)
	
		{
			  a[i]=Integer.parseInt(dis.readLine());
		}

		System.out.println("the array elements are");

	    for(i=0;i<a.length;i++)
	
		{
			  if(a[i]>0)
			 
			 System.out.println(a[i]+"is positive");
		      else
              System.out.println(a[i]+"is Negative");
		}
	
	}
}
