class FinallyDemo
{
  static int arr[];
  public static void main(String args[])
  {
   try
   {
      arr=new int[3];
   }
   catch(NegativeArraySizeException e)
   {
    System.out.println("Negative subscript used");
   }
  finally
  {
   System.out.println("inside Finally");
  }
 }
}  
