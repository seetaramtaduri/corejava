import java.io.*;
class ArrayDemo3
{
	public static void main(String[] args) throws Exception
	{
		int a[]=new int[10];
        DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter Elements into Array");
        for(int i=0;i<a.length;i++)
		{
                 a[i]=Integer.parseInt(dis.readLine());
	    }
		System.out.println("Elements in  the  Array ");
        for(int i=0;i<a.length;i++)
		{
                if(a[i]>0)
					System.out.println(a[i]+"is +ve" );
	            else
					System.out.println(a[i]+"is -ve" );
		}
		
		
		}
}
