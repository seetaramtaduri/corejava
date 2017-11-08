package fundamentals.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortWithComparator {
 
    public static void main(String a[]){
         
        String[] strArr = {"zamir", "chandu", "ajay", "reyansh", "bunnu"};
        Arrays.sort(strArr,new Comparator<String>(){
        @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }});
         
        for(String str:strArr){
            System.out.println(str);
        }
    }
}