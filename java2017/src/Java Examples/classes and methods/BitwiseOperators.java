public class BitwiseOperators {
   public BitwiseOperators( ) {
  int a = 11; //1 0 1 1
  int b = 12; //1 1 0 0

      System.out.println("a & b : "+(a & b));
      System.out.println("a | b : "+(a | b));
      System.out.println("a ^ b : "+(a ^ b));
      System.out.println("~a : "+(~a));
      System.out.println("a << b : "+(a << b));
      System.out.println("a >> b : "+(a >> b));
      System.out.println("a >>> b : "+(a >>> b));
        }
   public static void main(String args[]){
	   new BitwiseOperators();
   }
}
