package TypeOfVariable;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	final static String COMPANY = "IBM";
	
	public Employee(String firstName, String lastName, int age, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
