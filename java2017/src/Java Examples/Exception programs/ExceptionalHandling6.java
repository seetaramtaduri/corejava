package com.ocjp.sample;

public class ExceptionalHandling6 {
	public static void main(String[] args) {
		try{
			System.out.println("Try");
			System.exit(0);
		}catch(ArithmeticException e){
			System.out.println("Catch");
		}finally{
			System.out.println("Finally");
		}
	}

}
