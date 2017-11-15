class  str
{
	public static void main(String[] args) 
	{     
		 String str="Vaagdevi";
		 String s1=new String(str);
		
		 System.out.println(s1.replace('a', 'o'));
		
	     System.out.println(s1.toUpperCase());
	     String s3=s1.concat("College");
	     System.out.println(s3);
	
	     System.out.println(s3.substring(2,5));
	     System.out.println(s3.hashCode());
	     System.out.println(s3.replaceFirst("Vaagd","srid"));
	     System.out.println(s3.endsWith("e"));
	     System.out.println(s3.startsWith("s"));
	}
}