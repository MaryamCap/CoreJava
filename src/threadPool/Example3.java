package threadPool;

public class Example3 implements Runnable {

	String s;

	public Example3(String s) {
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "start and message is: " + s);
		publishMessage();
		System.out.println(Thread.currentThread().getName() + "end and message is : " + s);

	}

	public void publishMessage() {
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
}