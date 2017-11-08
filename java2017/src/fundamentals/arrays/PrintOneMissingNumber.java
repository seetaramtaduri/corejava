package fundamentals.arrays;

import java.util.Arrays;

/**
 * trick to solve this problem is to calculate sum of all numbers in the 
 * array and compare with expected sum, the difference would be the missing number.
 * @author seetaram
 *
 */

public class PrintOneMissingNumber {
public static void main(String[] args) {
	 // Only one missing number in array
    int[] iArray = new int[]{1, 2, 3, 5};
    int missing = getMissingNumber(iArray, 5);
    System.out.printf("Missing number in array %s is %d %n", 
                       Arrays.toString(iArray), missing);


}
private static int getMissingNumber(int[] numbers, int totalCount) { 
	int expectedSum = totalCount * ((totalCount + 1) / 2); 
	int actualSum = 0; 
	for (int i : numbers) { 
		actualSum += i; 
		} 
	return expectedSum - actualSum; 
}

}