
class ThreadPgm1 extends Thread{  
	public void run(){  // start from here
		System.out.println("thread is running...");  
	}  
	public static void main(String args[]){  
		ThreadPgm1 t1=new ThreadPgm1(); //  just a sitting duck 
		t1.start();  // where to start
	 }  
}  