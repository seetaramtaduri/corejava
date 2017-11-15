   public enum flowers
   {
	  rose("red") , decflower("violet") , lilly("white") ,  sunflower("yellow");
	  
	  private String descr;
	  private  flowers(String descr)
	  {
		   this.descr=descr;
	  }
	   public String getDesc()
	   {
		   System.out.println("flowers colors are ....");
	        return descr;
	   }
}
public class FlowerList
{
	public static void main(String[] args) 
	{
		   flowers  f =flowers.red;
		    flowers  f1[]=flowers.values();
		    System.out.println("flowers ....");
		   for(int i=0;i<f1.length;i++)
		   {
			   System.out.println(f1[i].getDesc());
		   }
			 System.out.println(h+" \t  is a color  \t "+f.getDesc());
		     switch(flowers.yellow)
		      {
		           case  red : System.out.println("rose");
			       break;
		           case yelow : System.out.println("sunflower");
              }   
     }
}
