package fundamentals.arrays;
import java.util.Arrays;
 
public class MyArrayRangeCopy {
     
    public static void main(String a[]){
         
        int[] myArr = {2,4,2,4,5,6,3};
        System.out.println("My array elements:\n");
        for(int num:myArr){
            System.out.print(num+"  ");
        }
        int[] newArr = Arrays.copyOfRange(myArr, 1, 4);
       
        System.out.println("\nMy new array elements:\n");
        for(int num:newArr){
            System.out.print(num+"  ");
        }
    }
}