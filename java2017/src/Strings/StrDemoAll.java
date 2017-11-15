class  StrDemoAll
{
	public static void main(String[] args) 
	{
		//creating strings in 3 ways
		String s1="a Book on Java";
		String s2=new String("by Seeta Ram");
		char arr[]={'v','e','r','y','g','o','o','d'};
		String s3=new String(arr);

		//display all  three strings
		
		System.out.println("s1 contains\t"+s1);
    	System.out.println("s2 contains\t"+s2);
		System.out.println("s3 contains\t"+s3);
	
	    /************String methods*******************************/
        //length
		System.out.println(s1+"\tlength is\t"+s1.length());
		//concatenate with +
		System.out.println(s1+s2);
        //concatenate
		System.out.println(s1.concat(s3));
	    
		//printing char at specified pos
		String s4="vaagdevi Engg College";
        char c=s4.charAt(7);
		System.out.println("7th char is\t"+c);
	    
		//extract more than one char at a time

		String s5="We are at Vidyarthi";
	    char ch[]=new char[10];
		s5.getChars(3,8,ch,0);
        for(int i=0;i<(8-3);i++)
		  System.out.println(ch[i]);

	    //compare two Strings
        String str1=new String("India");
	    String str2="india";
	    if(str1.equals(str2))
		{
		  System.out.println(str1+"\tis same as\t"+str2);
		}
	    else
		{
			System.out.println(str1+"\t not same as\t"+str2);
		}

		//igonore case

	    if(str1.equalsIgnoreCase(str2))
		{
		   System.out.println(str1+"same as"+str2);
		}
	
	   // compare two strings
       str1="RAGHU";
       if(str1.compareTo(str2)>0)
		   System.out.println(str1+"greater than"+str2);
	   else
		   System.out.println(str2+"graeter than"+str1);
	  
	   //converting cases
	   System.out.println(s4.toLowerCase());
	   System.out.println(s1.toUpperCase());
	   
	   String sp="      Butter     ";
	   System.out.println(sp);
	   //remove spaces from the string
	   System.out.println(sp.trim());

       //reaplce a single character
	   System.out.println(sp.replace('u','i'));

	   //printing substring of a given string
	   String str3="we love java ";
       System.out.println(str3.substring(8));

	   //extract a portion of a given String
       System.out.println(str3.substring(3,7));

       //coverting a string into a char array
       String name="seetaram";
	   char myname[]=name.toCharArray();
	   System.out.println("char array contains");
	    for(int j=0;j<myname.length;j++)
		{
		   System.out.println("myname["+j+"]="+myname[j]);
        } 
	
	   //coverting integer to String
	   Integer i=new Integer(10);
	   int j=100;
	   System.out.println(i+100);
       System.out.println(i.toString()+100);
	  
	  /*
	     System.out.println(j.toString()+100);
	     Error!!!operator + cannot be applied to int
      */	
	


	
	}
}

