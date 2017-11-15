import java.io.*;
class ArrayDemo4
{
	public static void main(String[] args) throws Exception
	{
		int a[]=new int[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println( " Enter Elements into Array " );
        for(int i=0;i<a.length;i++)
		{
                 a[i]=Integer.parseInt(br.readLine());
	    }
		System.out.println( " Elements in  the  Array  " );
        for(int i=0;i<a.length;i++)
		{
                if(a[i]%2==0)
					System.out.println(a[i] + "is even.." );
	            else
					System.out.println(a[i] + "is  odd.." );
		}
  }
}
