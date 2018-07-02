package ThreadProject;

public class Example2 extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("this thread is daemon thread");
		}
		else {
			System.out.println("This thread is not daemon thread");
		}
	}
	
	public static void main(String[] args) {
		
		Example2 obj  = new Example2();
		Example2 obj1 = new Example2();
		Example2 obj2 = new Example2();
		
		obj.setDaemon(true);
		obj.start();
		obj1.start();
		obj2.start();
	}

}
