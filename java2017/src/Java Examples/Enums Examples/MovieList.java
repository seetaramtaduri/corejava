//declareing enum with methods and attributes

   enum Flowers
   {
	    RED("ROSE") , YELLOW("SUNFLOWER") , WHITE("LILLY");
	    
		String descr;
	   
		Flowers(String str)
	    {
		   descr=str;
	   }
	   public String getDesc()
	   {
		
	        return descr;
	   }
}
public class MovieList
{
	public static void main(String[] args) 
	{
		 Flowers h=Flowers.RED;
		  Flowers h1[]=Flowers.values();
		   System.out.println(" Flowers....");
		   for(int i=0;i<h1.length;i++)
		   {
			   System.out.println(h1[i].getDesc());
		   }
			 System.out.println(h+" \tis\t "+h.getDesc());
		     switch(Flowers.YELLOW)
		      {
		           case  YELLOW: System.out.println("Sun FLOWER");
			       break;
		           case RED : System.out.println("ROSE ");
              }   
     }
}
