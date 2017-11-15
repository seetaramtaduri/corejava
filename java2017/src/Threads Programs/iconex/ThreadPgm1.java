package com.abhyaas.iconex;

class ThreadPgm1 extends Thread{  
	public void run(){  
		System.out.println("thread is running...");  
	}  
	public static void main(String args[]){  
		ThreadPgm1 t1=new ThreadPgm1();  
		t1.start();  
	 }  
	}  