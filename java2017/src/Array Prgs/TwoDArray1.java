import java.io.*;
public class TwoDArray1 
{
   public static void main(String args[]) 
  {
      
	 int a[][]=new int[3][3];
	 
	   a[0][0]=10;
	   a[0][1]=20;
	   a[0][2]=30;
	   a[1][0]=40;
	   a[1][1]=50;
	   a[1][2]=60;
	   a[2][0]=70;
	   a[2][1]=80;
	   a[2][2]=90;
	    
	 int i, j;
    //printing Elememnts in the matrix
	 System.out.println("The matrix is");
     for(i=0; i<3; i++) 
	 {
        for(j=0; j<3; j++)
		 {
			 System.out.print(a[i][j] + " ");
         }
	  System.out.println();
    }
  }
}
