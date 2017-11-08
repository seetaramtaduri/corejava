package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		System.out.println("Enter the search element: ");
		int s = in.nextInt();

		Arrays.sort(array); // binary search will work on sorted array only so
							// sort first
		int first, last, middle;
		first = 0;
		last = size - 1;
		middle = (first + last) / 2;
		int i = 0;
		for (; i < size; i++) {
			if (s > array[middle]) {
				first = middle + 1;
			} else if (s < array[middle]) {
				last = middle - 1;
			} else {
				printArray(array);
				System.out.println("Element " + s + " found in the array.");
				break;
			}
			middle = (first + last) / 2;
		}
		if (i == size) {
			printArray(array);
			System.out.println("Element " + s + " is not found in the array");
		}
	}

	public static void printArray(int[] a) {
		System.out.println("Array of elements: ");
		System.out.print("{");
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println("}");
	}
}