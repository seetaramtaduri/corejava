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
