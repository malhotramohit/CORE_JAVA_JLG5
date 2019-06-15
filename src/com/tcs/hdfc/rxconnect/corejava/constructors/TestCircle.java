package com.tcs.hdfc.rxconnect.corejava.constructors;

public class TestCircle {
	// aggregation
	public static void main(String[] args) {
		Circle circle1 = new Circle(34.6);
		double rad = circle1.getRadius();
		System.out.println(rad);

		// circle1.radius=5.0;

		Circle circle2 = new Circle(10);
		double area = circle2.getArea();
		System.out.println(area);

		Circle circle3 = new Circle(12, "blue");

		System.out.println("Radius is " + circle3.getRadius());
		System.out.println("Area is " + circle3.getArea());

		System.out.println("Color is " + circle3.getColor());

		System.out.println("Color of circle 2 is " + circle2.getColor());

		Circle circle4 = new Circle();
		circle4.setRadius(11.5);
		System.out.println(circle4.getRadius());

		circle4.setColor("black");
		System.out.println(circle4.getColor());

		// System.out.println(circle4.setColor("yellow")); CTE: Compile time error
		System.out.println(circle4.toString());// explicit call
		System.out.println(circle4);// implicit call circle4.toString()
		System.out.println(circle3);// implicit call circle4.toString()

	}

}
