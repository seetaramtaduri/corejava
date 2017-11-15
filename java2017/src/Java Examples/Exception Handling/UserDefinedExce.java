class MyException extends Exception
{
     private int data;

     MyException(int n)
     {
        data = n;
		//System.out.println("In MyException ");
     }

     public String toString()
     {
        return "  Exception raised... low bal ["+data+"]";
     } 
}




class UserDefinedExce
{
   static void check(int no) throws MyException
   {
      System.out.println("In Check("+ no +")");

        if( no <500 )
           throw new MyException(no);


           System.out.println("Normal Exit");
   }



   public static void main(String ar[])
   {
        try
        {
             check(1000);
             check(350);
        }
        catch(MyException me)
        {
         System.out.println(me);
        }
        
   }
}
