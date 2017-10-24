package com.srr.basics;

public class FindTwoMissingNumbers {
	static int getSum(int arr[],int n)
	{
	    int sum = 0;
	    for (int i = 0; i < n; i++)
	        sum += arr[i];
	    return sum;
	};
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,6,7,8,9};
		int n = arr.length;
		
		// Sum of 2 Missing Numbers1
	    int sum = (n*(n + 1)) /2 - getSum(arr, n-2);
		
		
		// Find average of two elements
	    int avg = (sum / 2);
		
	 // Find sum of elements smaller than average (avg)
	 // and sum of elements greater than average (avg)
	    
	    int small = 0, bigger = 0;
	    for (int i = 0; i < n-2; i++)
	    {
	        if (arr[i] <= avg)
	            small += arr[i];
	        else
	            bigger += arr[i];
	    }
	    
	    System.out.println("Two Missing Numbers are");
	 
	    // The first (smaller) element = (sum of natural numbers upto avg) - (sum of array elements
	    // smaller than or equal to avg)
	    
	    int smallTotal = (avg*(avg + 1)) / 2;
	    System.out.print (smallTotal - small + " and ");
	 
	    // The first (smaller) element = (sum of natural numbers from avg+1 to n) - (sum of array elements
	    // greater than avg)
	   System.out.println (((n*(n+1))/2 - smallTotal) - bigger);
	}
	
	
	
}
