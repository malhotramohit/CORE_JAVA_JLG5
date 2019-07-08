package com.tcs.hdfc.bancs.inheritance;

 class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public  double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}

class Cylinder extends Circle {
	private double height;

	Cylinder() {
		super();
		height = 1.0;
	}

	Cylinder(double radius) {
		super(radius);
	}

	Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
	}

	public double getCircleArea() {
		return super.getArea();
	}

	public double getVolume() {
		// way 1: //return getArea()*height;
		// way 2: // Math.PI * radius*radius*height
		return getArea() * height;
	}

}

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(2.0, 4.5, "Black");
		System.out.println("Radius is " + cylinder.getRadius());
		System.out.println("Height is " + cylinder.getHeight());
		System.out.println("Color is " + cylinder.getColor());
		System.out.println("Area of Circle is " + cylinder.getCircleArea());
		System.out.println("Area of Cylinder is " + cylinder.getArea());
		System.out.println("Volume is " + cylinder.getVolume());

	}
}
