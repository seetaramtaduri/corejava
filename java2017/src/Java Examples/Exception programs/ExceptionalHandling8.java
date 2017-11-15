package com.ocjp.sample;

public class ExceptionalHandling8 {
	// case 1
	
	/*
	static ArithmeticException e;
	public static void main(String[] args) {
		throw e;
	}
	*/
	
	// case 2
	
	static ArithmeticException e=new ArithmeticException();
	public static void main(String[] args) {
		throw e;
	}
}
