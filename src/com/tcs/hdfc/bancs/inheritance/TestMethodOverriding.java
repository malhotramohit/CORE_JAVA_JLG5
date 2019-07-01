package com.tcs.hdfc.bancs.inheritance;

class Parent {

	String girlName = "Some girl 2";

	// Parent(){
	//
	// }
	// if your class is having atleast one param cons then java will not create any
	// no args or default cons
	Parent(String girlName) {
		this.girlName = girlName;
	}

	void doMarriage() {
		System.out.println("Marry with parent's choice with " + girlName);
	}
}

class Child extends Parent {

	String girlName = "Some girl 3";
	
	
	
	Child(String girlName){
		super(girlName);
	}

	// Child(){
	//
	// }
	// Rule 1: if you want to override parent's method then create same method in
	// the child class
	// with def
	// same method : name and signature should be same
	// signature : both name and parameters

	void doMarriage() {
		// super.doMarriage();
		System.out.println("Parents selected girl : " + super.girlName);
		System.out.println("I will marry acc to my choice " + girlName);
	}

	void playing() {
		System.out.println("Playing");
	}
}

public class TestMethodOverriding {
	public static void main(String[] args) {
		Child child = new Child("testing");
		child.doMarriage();
	}
}
