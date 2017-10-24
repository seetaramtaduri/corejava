package com.srr.basics;


/*
 * 1. Get the sum of numbers 
       total = n*(n+1)/2
   2.  Subtract all the numbers from sum and
   you will get the missing number.
 */
public class FindOneMissingNumberInArray {
        public static void main(String args[])
	    {
	        int a[] = {1,2,3,4,5,6,7,8,10};
	        int n = a.length;
	        
	        int  total;
	        //find sum of array lements 
	        total  = (n+1)*(n+2)/2;   
	        
	       //Subtract all the numbers from sum and we  get missing no
	        for ( int i : a)
	           total  = total -  i;
	        
	        System.out.println("missing number is " + total);
	    }
}
