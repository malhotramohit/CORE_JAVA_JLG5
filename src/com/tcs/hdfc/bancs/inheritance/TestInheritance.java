package com.tcs.hdfc.bancs.inheritance;

class Person {
	String color;
}

// emp is a person
class Emp extends Person {
	String name;
	int age;
	double salary;
	double exp;

	void processSalary() {
		System.out.println("Emp is processing salary");
	}
}


// programmer is a emp
class Programmer extends Emp {
	String[] langKnown;

	void writeCode() {
		System.out.println("Writing code");
	}
}

class Manager extends Emp {
	int teamSize;

	void reportProjectStatus() {
		System.out.println("Ready !!");
	}

	void processSalary() {
		System.out.println("Manager is processing salary");
	}
}

public class TestInheritance {

	/**
	 * This is my main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		// classname ref = new classname
		Manager man1 = new Manager();
		man1.age = 23;
		man1.salary = 5435435.5435;
		man1.teamSize = 10;

		man1.reportProjectStatus();

		// System.out.println("The age is ");
		System.out.println("The age is " + man1.color);
		
		man1.processSalary();
	}

}
