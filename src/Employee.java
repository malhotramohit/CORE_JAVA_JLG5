
public class Employee {

	int id; // 4 // instance variables
	String name; // 4
	int age; // 4
	static String company = "TCS"; // class level var

	public static void main(String[] args) {

		int someVar = 4; // local var

		// className emp1 = new // classname
		Employee emp1 = new Employee();

		// ref variable or instance

		emp1.id = 1;
		emp1.age = 25;
		emp1.name = "Mohit";

		System.out.println("EMp1 id is " + emp1.id);
		System.out.println("EMp1 age is " + emp1.age);
		System.out.println("EMp1 name is " + emp1.name);
		System.out.println("EMp1 company is " + emp1.company);

		emp1.company = "HDFC";

		Employee emp2 = new Employee();

		emp2.id = 2;
		emp2.age = 26;
		emp2.name = "Rohit";

		System.out.println("EMp2 id is " + emp2.id);
		System.out.println("EMp2 age is " + emp2.age);
		System.out.println("EMp2 name is " + emp2.name);
		System.out.println("EMp2 company is " + emp2.company);

		System.out.println("Company is " + Employee.company);

	}

}
