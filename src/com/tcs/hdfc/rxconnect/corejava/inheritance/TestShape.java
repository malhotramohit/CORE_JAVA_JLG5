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

	@Override
	public boolean equals(Object obj) {
		boolean isSame = false;
		if (obj instanceof Circle) {
			Circle circle = (Circle) obj;
			if (this.radius == circle.radius && this.color.equals(circle.color) && this.filled == circle.filled) {
				isSame = true;
			} else {
				isSame = false;
			}
		}
		return isSame;
	}

}

class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}

}

class Square extends Rectangle {
	Square() {

	}

	Square(double side) {
		super(side, side);
	}

	Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return length; // return width
	}

	public void setSide(double side) {
		length = side;
		width = side;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}

}

public class TestShape {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		// Because ref var is of parent and object is of child
		//
		// System.out.println(s1.getRadius());

		Circle c1 = (Circle) s1;
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		// we cannot create objects of abstarct class
		// Shape shape2 = new Shape(); //
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		// System.out.println(s3.getLength());

		Rectangle r1 = (Rectangle) s3;
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		Shape s4 = new Square(6.6);
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		// System.out.println(s4.getSide());

		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		// System.out.println(r2.getSide());
		System.out.println(r2.getLength());

		Square sq1 = (Square) r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());

		// down casting
		// instanceOf
		if (s1 instanceof Rectangle) {
			Rectangle r5 = (Rectangle) s1; // s1 : circle
			System.out.println(r5);
		} else {
			System.out.println("Not possible");
		}

		Circle circle1 = new Circle(1.2, "red", true);
		Circle circle2 = new Circle(1.2, "red", true);
		if (circle1.equals(circle2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

	}

}
