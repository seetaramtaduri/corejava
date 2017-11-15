class CommandLineDemo1 
{
   public static void  Sop(String s)
    {
	 System.out.println(s);
	 }

	public static void main(String[] args) 
	{
      if(args.length>0)
	   {
	    Sop("he no of arguments passed in the command line are="+args.length);
		Sop("the arguments are listed below");
		for(int i=0;i<args.length;i++)
		   Sop(args[i]);
		}   
	}

}
