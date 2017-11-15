package com.ocjp.sample;

public class ExceptionalHandling7 {
	public static void main(String[] args) {
		// case 1
		 System.out.print(10/0);
		 
		 /*In this case AE object created internally 
		  * and handover that object automatically by the main()
		  */
		 		 
		// case 2
		 throw new ArithmeticException("divide by zero");
		 
		 /*In this case we create AE and we handover it to the JVM 
		  * manually by using throw keyword
		  */
		
	}

}

