class StringTest
{
	static String name[]={"Madras","Delhi","Cg","Ahmadad","Calccutta","Bombay"};
	public static void main(String args[])
	{
		int s=name.length;
		String t=null;
		for(int i=0;i<s;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(name[j].compareTo(name[i])<0)
				{
					t=name[i];
					name[i]=name[j];
					name[j]=t;
					
				}
			}
		}
		for(int i=0;i<s;i++)
		System.out.println(name[i]);
	}
}