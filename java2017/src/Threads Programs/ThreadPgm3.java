
class MyThread1 extends Thread{
	public void run(){
		System.out.print("run ()");
	}
	public void run(int i){
		System.out.print("run (int i)");
	}
}

public class ThreadPgm3 {
	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();
	}
}


