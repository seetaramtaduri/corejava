package java8basics;

public class UseRunnable {
 public static void main(String[] args)  {
	/*Runnable r1 = new Runnable(){
		@Override
		public void run(){
			System.out.println("Running Thread 1");
		}
	};
	Runnable r2 = new Runnable(){
		@Override
		public void run(){
			System.out.println("Running Thread 2");
		}
	}; */
	 
   
	 //Lets use lambda expression 
	
	 Runnable r1= ()->{
		    try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running Thread 1 with lambda ");
		};
	 Runnable r2 = ()->{
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Running Thread 2 with lambda");
	 };
	 
	 
	 
	 
	new Thread(r1).start();
	new Thread(r1).start();
}
}
