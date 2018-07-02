package ThreadProject;

public class Example1 extends Thread{
	
	public void run() {
		System.out.println("Thread started");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.setPriority(Thread.MIN_PRIORITY);
		obj.start();
		
		Example1 obj1 = new Example1();
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		
		
		

	}

}
