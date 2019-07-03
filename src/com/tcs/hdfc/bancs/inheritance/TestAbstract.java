package com.tcs.hdfc.bancs.inheritance;

// abstract class : 
// rule 1: If any of the method is abstract then your class 
// should be abstract
abstract class Shape {

	// it will have no def , only decla
	public abstract void getArea();
}

class Triangle extends Shape {
	public void getArea() {
		System.out.println("herons formula");
	}
}

class Parabola extends Shape {
	public void getArea() {
		System.out.println("parabola rea");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		
		//Shape shape = new Shape();
		Triangle  triangle =  new Triangle();
		triangle.getArea();
	}

}
