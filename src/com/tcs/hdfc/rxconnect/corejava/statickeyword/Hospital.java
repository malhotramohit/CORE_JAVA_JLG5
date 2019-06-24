package com.tcs.hdfc.rxconnect.corejava.statickeyword;

// static : fields
// static  : methods
// static block 
class Patient {

	// block
	static {
		System.out.println("Welocome to "+HosiptalConstants.HOSPITAL_NAME);
	}

	// to be binded with class rather than object
	static String category = "A"; // fields

	private long pid;
	private String name;

	public Patient(long pid, String name) {
		System.out.println("Param cons is called");
		this.pid = pid;
		this.name = name;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// This method will convert object values into a string
	public String toString() {
		return "Patient[pid = " + pid + " , name=" + name + "]";
	}

	// block
	static {
		System.out.println("Static block 2");
	}

}

public class Hospital {

	public static void main(String[] args) {
		Patient patient1 = new Patient(1, "Test");
		System.out.println(patient1);

		patient1.category = "B";
		System.out.println("Category of patient 1 --> " + patient1.category);

		Patient patient2 = new Patient(2, "Test2");
		System.out.println(patient2);
		System.out.println("Category of patient 2 --> " + patient2.category);

		System.out.println("Category of Patient class is " + Patient.category);

	}
}
