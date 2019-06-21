package com.tcs.hdfc.rxconnect.corejava.composition;

import java.util.Scanner;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}

	public Rectangle(float width, float length) {
		this.width = width;
		this.length = length;

	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length: ");
		float length = scan.nextFloat();

		System.out.println("Enter a width: ");
		float width = scan.nextFloat();

		Rectangle r = new Rectangle();
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());

		Rectangle r2 = new Rectangle(width, length);
		System.out.println(r2.getLength());
		System.out.println(r2.getWidth());
		System.out.println(r2.getArea());
		System.out.println(r2.getPerimeter());

	}
}
