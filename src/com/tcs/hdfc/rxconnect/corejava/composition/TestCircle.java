package com.tcs.hdfc.rxconnect.corejava.composition;

class Circle {
	private double radius; // encapsulation

	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return "Circle[radius=" + radius + "]";
	}

}

public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(24.67);
		System.out.println(circle.getArea());
		System.out.println(circle);//println implicit call to toString()
	}
}
