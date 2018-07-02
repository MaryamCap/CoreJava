package ThreadProject;

public class Join extends Thread{
	
	public void run()
	{
		for(int i = 0; i<6;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Join obj = new Join();
		Join obj1 = new Join();
		Join obj2 = new Join();
		
		obj.start();
		
		try {
			//thread one execute three times before other thread start executing
			obj.join(15000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		obj1.start();
		obj2.start();
	}
}
