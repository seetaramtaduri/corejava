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
  public class FlowerList
  {
	public static void main(String[] args) 
	{
		 Flowers h1[]=Flowers.values();
		 //display  descriptions of all flowers  
		 System.out.println(" Flowers....");
		 for(int i=0;i<h1.length;i++)
		 {
			   System.out.println(h1[i].getDesc());
		}
		 
		    Flowers h=Flowers.WHITE;
		    System.out.println(h+" \tis\t "+h.getDesc());
		 
	           //using switch also we can get the description of a flower
		      switch(Flowers.YELLOW)
		      {
		           case  YELLOW: System.out.println("Sun FLOWER");
			       break;
		          case RED : System.out.println("ROSE ");
              }   
     }
}
