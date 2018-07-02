package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 {

	public static void main(String[] args) {

		ExecutorService executors = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < 10; i++) {
			Example3 obj = new Example3("" + i);
			executors.execute(obj);
		}
		
		executors.shutdown();
		
		while(!executors.isTerminated()) {
			
		}
		System.out.println("all task finished");
	}
	

}
