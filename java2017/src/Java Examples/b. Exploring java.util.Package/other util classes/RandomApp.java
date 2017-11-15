import java.lang.System;
import java.util.Random;

public class RandomApp 
{
  public static void main(String args[])
  {
     Random r = new Random();
     System.out.print("Integers\t    Doubles   \t\tGaussian values \n");
	 System.out.println("-------\t\t  ----------  \t\t---------------");
	 
	 for(int i=0;i<4;++i) 
	 {
		 System.out.print(r.nextInt()+"\t");
		 System.out.print(r.nextDouble()+"\t");
		 System.out.println(r.nextGaussian());
     }
	
	 
 }
}