package TypeOfVariable;

public class LocalVariable {
	
	//class level variable
	private int x = 8;

	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.display();
		System.out.println("value of class level variable x " + obj.x);
		
	}

	private void display() {
		int x = 5;
		boolean flag = true;
		System.out.println("Value of local variable " + x);
		if(flag) {
			int y = 10;
			System.out.println("value of local variable y inside if " + y);
		}
		
	}

}
