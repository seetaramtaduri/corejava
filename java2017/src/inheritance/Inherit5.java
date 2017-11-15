// Program to Demo on Hierarchical inheritance 
import java.util.*;
class Parent
{
   int n;
   void read() 
   {
         Scanner s=new Scanner(System.in);
		 System.out.println("\nEnter n number");
         n=s.nextInt();
     }
}
class sub1 extends Parent
{
       void even()
       {
       System.out.println("Even Numbers:");
       for(int i=0;i<=n;i+=2)
       System.out.print(i+"\t");
       }
}
class sub2 extends Parent
{
       void odd()
       {
         System.out.println("Odd Numbers:");
         for(int i=1;i<=n;i+=2)
         System.out.print(i+"\t");
       }
}
class Inherit5
{
	public static void main(String ar[]) throws Exception
   {
       sub1 s1=new sub1();
       sub2 s2=new sub2();
       s1.read();
       s1.even();
       s2.read();
       s2.odd();
   }
}

