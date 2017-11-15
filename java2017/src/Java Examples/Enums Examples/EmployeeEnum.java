import java.lang.*;


public class EmployeeEnum
{

   public enum Names  { raju, Amar, Arjun, Trilok }
  
    public static void main(String[] args)
    {

     System.out.println("enum objs are");
	 for (Names count : Names.values())
	 { 
		 System.out.println(count);
     }
   }//main
 }//class 