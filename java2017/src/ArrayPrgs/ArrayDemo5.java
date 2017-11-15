import java.io.*;
class ArrayDemo5
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
                for(int j=1;j<a.length;j++)
			    { 
					 if(a[i]>a[j])
					  {
						  System.out.println("Bigger No is"+a[i]);
	                       break;
					  }
				  
             }
		}
   }
}