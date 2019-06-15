package com.tcs.hdfc.rxconnect.corejava.constructors;

//pojo bean model
public class Circle {

	// instance var or non static var
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double r) {
		radius = r;
		color = "red";
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

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public double getArea() {
		return Math.PI * radius * radius;

	}
	
	public String toString() {
		return "Circle[radius="+radius+" ,color="+color+"]";
	}

}
