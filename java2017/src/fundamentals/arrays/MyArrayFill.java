package fundamentals.arrays;
import java.util.Arrays;
 
public class MyArrayFill {
     
    public static void main(String a[]){
         
        String[] myArr = new String[10];
        Arrays.fill(myArr, "seetaram");
        for(String str:myArr){
            System.out.println(str);
        }
    }
}