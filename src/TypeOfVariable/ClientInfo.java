package TypeOfVariable;

public class ClientInfo {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Sean", "Murphy", 30,'M');
		Employee employee2 = new Employee("Joya", "Bingel", 25, 'F');
		System.out.println("Values in object employee - " + employee1.getAge()+ "\t" + employee1.getFirstName()+
				"\t" + employee1.getLastName()+ "\t" + employee1.getGender() + "\t" + Employee.COMPANY);
		System.out.println("Values in object employee - " + employee2.getAge()+ "\t" + employee2.getFirstName()+
				"\t" + employee2.getLastName()+ "\t" + employee2.getGender() + "\t" + Employee.COMPANY);

	}

}
