/* once a string obj is created then its contents cannot be   
   changed they are immutable(nochange)

   but this StringBuffer objects can be changed(they are mutable");

*/

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		//String class objects are immutable(not changed)
        String s=new String("raghu");
	    System.out.println(s);
        String s1="data";
		String s2="base";
		s1=s1+s2;
        System.out.println("now s1="+s1);
	     //s=ram;//cannot find symbol
         System.out.println("now s="+s);
         
		StringBuffer sb1,sb2,sb3;
		sb1=new StringBuffer();	
		sb2=new StringBuffer("helloVaagdevi");
		sb3=new StringBuffer(45);
    
	    //initial capacity is 16
	    System.out.println(sb1.capacity()+"\t"+sb2.capacity()+"\t"+sb3.capacity());
	    System.out.println(sb1.capacity()+sb1.capacity()+sb1.capacity());
	    //capacity specifies the no of bytes a StringBuffer object can store
        System.out.println("sb2 length is"+sb2.length());
	   
	    //allows a min cpapcity which specifies size of buffer
        sb2.ensureCapacity(45);
	    
		System.out.println(sb2.capacity());
		
		//it increases or decreases the length of the sb
		sb2.setLength(5);
		System.out.println(sb2);
	    StringBuffer sb4=new StringBuffer("Trees");
		
		System.out.println("trees capacity"+sb4.capacity());
        sb4.ensureCapacity(45);
        System.out.println("new trees capacity"+sb4.capacity());
		System.out.println(sb2.charAt(1));
		//string sb2 will be changed
		sb4.setCharAt(0,'w');
		System.out.println(sb4);
        //getChars
		char ch[]=new char[sb4.length()];
		sb4.getChars(3,sb4.length(),ch,0);
		for(int i=0;i<ch.length;i++)
		 System.out.println(ch[i]);
		 //reverse
         System.out.println(sb4.reverse());
	    
	     //append

		 String a="Seetaram";
		 sb4.append(a);
	     System.out.println(sb4);

		 sb2.delete(2,4);
		 System.out.println(sb2);

		 sb2.deleteCharAt(2);
         System.out.println(sb2);
	    
	
	
	}
}
