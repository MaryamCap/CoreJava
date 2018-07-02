package ThreadProject;

public class Example extends Thread {
	
	public void run() {
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		Example obj = new Example();
		Example obj1 = new Example();
		
		System.out.println("Name of first thread : " + obj.getName());
		System.out.println("Name of second thread : "  + obj1.getName());
		System.out.println("Id of second thread : "  + obj1.getId());
		
		obj.start();
		obj1.start();
		
		obj.setName("Mary");
		System.out.println("Name of first thread: " + obj.getName());

	}

}
