package com.ocjp.sample;

public class ExceptionalHandling10{
	public static void main(String[] args) {
		try{
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
