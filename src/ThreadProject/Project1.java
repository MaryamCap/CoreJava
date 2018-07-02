package ThreadProject;

public class Project1 implements Runnable{
	
	private String myName;
	private int count;
	private final long timeSleep;
	
	

	Project1(String myName, int count, long timeSleep) {
	
		this.myName = myName;
		this.count = count;
		this.timeSleep = timeSleep;
	}
	
	@Override
	public void run() {
		
		int sum = 0;
		for(int i = 1; i <= this.count; i++) {
			sum = sum + i;
		}
		System.out.println(myName + "thread has sum = " + sum +
				" and is going to sleep for" + timeSleep);
		try {
			Thread.sleep(this.timeSleep);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
