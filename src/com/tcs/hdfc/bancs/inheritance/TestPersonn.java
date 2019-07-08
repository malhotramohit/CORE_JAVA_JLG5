package com.tcs.hdfc.bancs.inheritance;

class Personn {
	private String name;
	private String address;

	public Personn() {
		name = "skt";
		address = "asbp";

	}

	public Personn(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Personn [name=" + name + ", address=" + address + "]";
	}

}

class Student extends Personn {
	private String program;
	private int year;
	private double fee;

	Student() {
		super();
		program = "c++";
		year = 3;
		fee = 1400.500;
	}

	Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student[Personn [name=\" + name + \", address=\" + address + [program=" + program + ", year=" + year
				+ ", fee=" + fee + "]";
	}
}

class Staff extends Personn {
	private String school;
	private double pay;

	Staff() {
		super();
		school = "HMA";
		pay = 2.200;

	}

	Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		return "Staff Personn [name=\" + name + \", address=\" + address + [school=" + school + ", pay=" + pay + "]";
	}

}

public class TestPersonn {
	public static void main(String args[]) {
		Personn Personn = new Personn();
		System.out.println(Personn.getAddress());
		System.out.println(Personn.getName());

		Staff staff = new Staff();

		System.out.println(staff.getName());
		System.out.println(staff.getAddress());
		System.out.println(staff.getPay());
		System.out.println(staff.getSchool());
		
//		System.out.println(((Student) Personn).getFee());
//		System.out.println(((Student) Personn).getProgram());
//		System.out.println(((Student) Personn).getYear());
		System.out.println(Personn.toString());
	}
}