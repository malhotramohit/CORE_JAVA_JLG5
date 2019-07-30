package com.tcs.hdfc.rxconnect.oopsmodelling;

import java.util.*;

class Employee {
	private int id;
	private String fName;
	private String lName;

	public Employee(int id, String fName, String lName) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public boolean equals(Object obj) {
		boolean isSame = false;

		Employee addObj = (Employee) obj;

		if ((addObj.id == this.id) && (addObj.fName.equals(this.fName)) && (addObj.lName.equals(this.lName))) {
			isSame = true;
		}

		return isSame;

	}

	public int hashCode() {
		return Objects.hash(id, fName, lName);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + "]";
	}

}

public class TestHashmapCustomObjects {
	public static void main(String[] args) {
		HashMap<Employee, Employee> empMap = new HashMap<>(10);

		Employee employee1 = new Employee(1, "mohit", "malhotra");
		Employee employee2 = new Employee(2, "rohit", "malhotra");
		Employee employee3 = new Employee(3, "sumit", "malhotra");
		Employee employee4 = new Employee(4, "amit", "malhotra"); // 134

		Employee employee44 = new Employee(4, "amit", "malhotra"); // 145

		empMap.put(employee1, employee1); // 121
		empMap.put(employee2, employee2); // 122
		empMap.put(employee3, employee3);
		empMap.put(employee4, employee4); // 134

		Set<Employee> employee = empMap.keySet();
		for (Employee ee : employee) {
			System.out.println(ee);
		}

		System.out.println("hashcode of emp4 " + employee4.hashCode());
		System.out.println("hashcode of emp44 " + employee44.hashCode());

		System.out.println("get ope");
		System.out.println(empMap.get(employee44));
	}

}
