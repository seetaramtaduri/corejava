// Demonstrate a two-dimensional array [Transpose].
import java.io.*;
public class TwodTranspose
{
   public static void main(String args[]) throws Exception
  {
      
	  DataInputStream dis=new DataInputStream(System.in);
	  int a[][]= new int[3][3];
      int i, j, k = 0;
      //reading Elements into matrix
	  System.out.println("Enter Elements into Array");
	  for(i=0; i<3; i++) 
      {
		   for(j=0; j<3; j++) 
		  {
                a[i][j] = Integer.parseInt(dis.readLine());
          }
      }
	 //printing the Matrix
	 System.out.println("The matrix is");
     for(i=0; i<3; i++) 
	 {
        for(j=0; j<3; j++)
		 {
			 System.out.print(a[i][j] + " ");//a[j][i] for transpose
         }
	  System.out.println();
    }
      
	 //finding the transpose of the given matrix
	 System.out.println("The Transpose of the above matrix is");
     for(i=0; i<3; i++) 
	 {
        for(j=0; j<3; j++)
		 {
			 System.out.print(a[j][i] + " ");
         }
	  System.out.println();
    }
  
  
  
  }
}
