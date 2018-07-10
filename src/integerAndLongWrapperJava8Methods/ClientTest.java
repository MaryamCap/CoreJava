package integerAndLongWrapperJava8Methods;

public class ClientTest {

	public static void main(String[] args) {
		String unsingedString = Integer.toUnsignedString(10,2);
		System.out.println(unsingedString);
		//String unsignedString2 = Integer.toUnsignedString(10);
		//System.out.println(unsingedString2);
		
		
		int parseUnsignedInt = Integer.parseUnsignedInt("1010", 2);
		System.out.println(parseUnsignedInt);
		
		int divideUnsigned = Integer.divideUnsigned(100, 25);
		System.out.println(divideUnsigned);
		
		int reminderUnsigned = Integer.remainderUnsigned(100, 24);
		System.out.println(reminderUnsigned);
		
		int sum = Integer.sum(100, 200);
		System.out.println(sum);
	}

}
