package com.tcs.hdfc.rxconnect.corejava.constructors;

public class Doctor {

	int doctorId;
	String doctorName;

	// Rule 1 : It should have same name as class name
	// Rul2 3 : no return type
	// Doctor() {
	// System.out.println("I am no args construvtor");
	// }

	Doctor() {
		System.out.println("I am no args construvtor");
	}

	Doctor(int docId, String docName) {
		System.out.println("I am two args construvtor");
		doctorId = docId;
		doctorName = docName;
	}
	

	Doctor(int docId) {
		System.out.println("I am one args construvtor");
		doctorId = docId;
	}

	public static void main(String[] args) {

		Doctor doc1 = new Doctor(1, "mohit");

		Doctor doc2 = new Doctor(2, "Rohit");

		Doctor doctor3 = new Doctor(12);

	}

}
