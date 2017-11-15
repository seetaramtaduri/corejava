class CmdArray 
{
	public static void main(String[] args) 
	{
		
		int  a[] , i ;
	    int size = Integer.parseInt(args[0]);
		a = new int[size];

		for(i = 1 ; i < a.length ; i++)
		{
               a[i] = Integer.parseInt(args[i]);
		}
        System.out.prntln(" Array elements ");
        for(i=0; i<a.length ; i++)
		{
			System.out.println( a[i]);
		}
	}
}
