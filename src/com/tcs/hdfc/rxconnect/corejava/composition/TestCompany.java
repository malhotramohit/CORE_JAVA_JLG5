package com.tcs.hdfc.rxconnect.corejava.composition;

class Employee {
	private long empId;
	private String empName;

	public Employee() {
	}

	public Employee(long empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String toString() {
		return "Employee[ empId=" + empId + ", empName=" + empName + "]";
	}
}

class Department {

	private long deptId;
	private String deptName;
	// has a relationship : composition
	private Employee employee;

	public Department() {
	}

	public Department(long deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Department(long deptId, String deptName, Employee employee) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.employee = employee;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public String toString() {
		return "Department[deptId =" + deptId + ", deptName =" + deptName + ", employee = " + employee.toString() + "]";
	}

}

public class TestCompany {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "Abhishek");
		Department HR = new Department(1, "HR", employee1);
		System.out.println(employee1);
		System.out.println(HR);
	}

}
