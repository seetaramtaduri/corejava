package com.ocjp.sample;

class TooYoungException extends RuntimeException  {
	TooYoungException(String s){
		super(s);
	}
}
class TooOldException extends RuntimeException  {
	TooOldException(String s){
		super(s);
	}
}
public class ExceptionalHandling12{
	public static void main(String args[]) {
		int age=Integer.parseInt(args[0]);
		if(age>60){
			throw new TooOldException(" over age ");
		}else if(age<18){
			throw new TooYoungException("under age");
		}else{
			System.out.print("Exact age");
		}
	}
}


