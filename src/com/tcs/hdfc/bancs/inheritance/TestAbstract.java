package com.tcs.hdfc.bancs.inheritance;

// abstract  method : method with only dec , without defn
// methods and class
// abstract field

// Rule 1: If your class if having atleast one abstract method then
// your class should be abstract
// Rule 2: If your class is abstract then it can or cannot have abstract methods
// Rule 3: Can't create objects of Abstract class

abstract class Shape {

	 int i = 0;

	abstract void getArea();

	abstract double getPerimeter();

	void printSomething() {
		System.out.println("Something");
	}
}

class Triangle extends Shape {
	void getArea() {
		System.out.println("Triangle area");
	}

	double getPerimeter() {
		System.out.println("Triangle peri");
		return 0;
	}
}

class Parabola extends Shape {

	@Override
	double getPerimeter() {
		System.out.println("Shape area");
		return 0;
	}

	@Override
	void getArea() {

	}
}

public class TestAbstract {
	public static void main(String[] args) {

		Triangle triangle = new Triangle();
		triangle.getArea();
	}

}
