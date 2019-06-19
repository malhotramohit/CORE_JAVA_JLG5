package com.tcs.hdfc.rxconnect.corejava.composition;

// POJO L plain old java object /// bean // model
class Student {

	// attributes /: encapsulation : attributes should be directly accessible
	private String name;
	private int age;
	private String color;
	private char sex;

	// constructor : method :
	// 1) No return type
	// 2) Name should be same as class name
	// default constructor
	public Student() {

	}

	public void m1() {
		Student student = new Student();
	}

	Student(String name, int age, String color, char sex) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.sex = sex;
	}

	// beha
	void drinking() {
		System.out.println("Student can drink");
	}

	void running() {
		System.out.println("Student can run");
	}

	public String toString() {
		String objToString = "[ " + name + " , " + age + " , " + color + " , " + sex + "]";
		return objToString;
	}

	// public getter for name
	public String getName() {
		return name;
	}

	// public setter for name
	public void setName(String newName) {
		name = newName;
	}

	// public getter for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Age cannot be less than 0");
		} else {
			this.age = age;
		}

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}

// aggregation
public class School {

	public static void main(String[] args) {

		// classname std1= new classname();

		Student std1 = new Student();// new keyword : creaete new obj?
		// construct ?:
		// special ?
		// name is same as clas name
		// no return type

		System.out.println(std1.toString());
		std1.setName("John");//
		std1.setAge(-23);
		std1.setColor("Fair");
		std1.setSex('M');
		String name = std1.getName();
		System.out.println(name);
		System.out.println(std1.getAge());
		System.out.println(std1.toString());

		Student std2 = new Student("Sophia", 25, "Fair", 'F');
		System.out.println(std2.toString());
		System.out.println(std2);

	}

}
