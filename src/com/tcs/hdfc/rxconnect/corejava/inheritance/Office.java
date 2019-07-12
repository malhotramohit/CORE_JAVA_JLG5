package com.tcs.hdfc.rxconnect.corejava.inheritance;

// Runtime polymorphism , method overriding, dynamic method dispatch
// 1) Parent : concrete class (not an abs) , abstract, interface

// 2) Parent par = new child();
// 3) par can access only those things of child which are also present in parent 
// 4) Use casting to get child obj out of parent ref var [ child ch =  (Child) par ]
// 5) use instanceOf before doing casting 
// if(par instanceOf Child){
// [ child ch =  (Child) par ]
// }
// 6) One parent can be inherited by multiple children, 

class Employe {
	String name;
	String address;
	String phoneNumber;
	float exp;

	// void processSalary() {
	// System.out.println("emp processing sal");
	// }
}

interface Interviewer {
	public void conductInterview();
}

class Programmer implements Interviewer {

	@Override
	public void conductInterview() {
		System.out.println("prog cond inter");
	}

}

class Manager extends Employe implements Interviewer {

	@Override
	public void conductInterview() {
		System.out.println("Manager is cond interview");
	}
}

class HRExecutive extends Employe implements Interviewer {
	String[] specialization;

	@Override
	public void conductInterview() {
		System.out.println("Hr conducting interview");
	}

	// @Override
	void processSalary() {
		System.out.println("hr processing sal");
	}

}

public class Office {
	public static void main(String[] args) {

		// way1 child c = new Child();
		HRExecutive executive = new HRExecutive();
		executive.address = "gyan"; // Employee
		executive.name = "Sahil";
		executive.specialization = new String[2];
		executive.specialization[0] = "Btech";
		executive.specialization[1] = "Mtech";
		executive.conductInterview();

		// Concrete par = new child();
		Employe employe = new HRExecutive();
		employe.name = "test";

		// Interface iter = new child();
		Interviewer interviewer = new HRExecutive();
		interviewer.conductInterview();

		HRExecutive hrExecutive = (HRExecutive) interviewer;
		hrExecutive.exp = 90.99f;
		System.out.println("--------");
		Interviewer[] interviewers = new Interviewer[3];
		interviewers[0] = new Manager();
		interviewers[1] = new HRExecutive();
		interviewers[2] = new Programmer();

		for (int i = 0; i < interviewers.length; i++) {
			interviewers[i].conductInterview();
			if (interviewers[i] instanceof HRExecutive) {
				HRExecutive executive2 = (HRExecutive) interviewers[i];
				executive2.processSalary();
			}
		}

	}

}
