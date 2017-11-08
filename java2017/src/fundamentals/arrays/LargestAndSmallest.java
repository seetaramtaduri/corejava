package fundamentals.arrays;

import java.util.Arrays;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int[] numbers = {100,20,2,120,1000};
		largestAndSmallest( numbers);
	}
	
	private static void largestAndSmallest(int[] numbers) {
	int largest = numbers[0];
	int smallest = numbers[0];
	
	for (int i = 1; i < numbers.length; i++) {
	if(numbers[i]>largest){
		largest=numbers[i];
	}else if(numbers[i]<smallest){
		smallest=numbers[i];
	}
	}
	
	System.out.println("\nGiven integer array : " + Arrays.toString(numbers));
	System.out.println("Largest number in array is : " + largest);
	System.out.println("Smallest number in array is : " + smallest);
	}
	
}

