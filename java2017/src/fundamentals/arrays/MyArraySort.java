package fundamentals.arrays;
import java.util.Arrays;
 
public class MyArraySort {
 
    public static void main(String a[]){
         
        int[] myArr = {3,2,56,12,98,23,56};
        Arrays.sort(myArr);
        for(int str:myArr){
            System.out.println(str);
        }
    }
}