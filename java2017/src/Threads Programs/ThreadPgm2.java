
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Child Thread");
		}
	}
}

public class ThreadPgm2 {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<=10;i++){
			System.out.println("Main Thread");
		}
	}
}


/*
 * class Thread{
 * 		start(){
 * 			1. Register this thread with thread schedular and perform initialization activites
 * 			2. run()
 * 		}
 * }
 * 
 */

