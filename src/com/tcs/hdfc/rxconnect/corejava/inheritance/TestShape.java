package com.tcs.hdfc.rxconnect.corejava.inheritance;

abstract class Shape {
	protected String color;
	protected boolean filled;

	public Shape() {

	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}

}

class Circle extends Shape {

	protected double radius;

	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}

}

public class TestShape {

	public static void main(String[] args) {
		// Shape shape = new Shape(); // -10 marks
		Shape circle = new Circle(10.90, "Blue", true);
		System.out.println(circle);
		System.out.println(circle.getArea());
	}

}
