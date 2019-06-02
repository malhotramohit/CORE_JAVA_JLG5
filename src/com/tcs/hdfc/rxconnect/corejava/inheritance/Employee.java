package com.tcs.hdfc.rxconnect.corejava.inheritance;

public class Employee {

	private int id;
	private String name;
	private int salary;

	protected int attr1;
	public int attr2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
