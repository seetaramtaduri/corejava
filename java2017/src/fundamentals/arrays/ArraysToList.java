package fundamentals.arrays;
import java.util.Arrays;
import java.util.List;
 
public class ArraysToList {
 
    public static void main(String a[]){
        String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        
        //convert Array to List using Arrays.asList() method
        List<String> strList = Arrays.asList(strArr);
       
        System.out.println("Created List Size: "+strList.size());
        System.out.println(strList);
    }
}