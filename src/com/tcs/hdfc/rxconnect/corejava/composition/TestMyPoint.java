package com.tcs.hdfc.rxconnect.corejava.composition;

import java.util.Arrays;

// (x1,y1) and (x2,y2) 
// sqrt(x2-x1)
// Math.sqrt
class MyPoint {

	private int x;
	private int y;

	MyPoint() {
		x = 0;
		y = 0;
	}

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		// way 1
		// int[] arr = { x, y };
		// way 2
		int[] arr = new int[2];
		arr[0] = x;
		arr[1] = y;
		return arr;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double distance(int x2, int y2) {
		int x1 = this.x;
		int y1 = this.y;
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public double distance(MyPoint another) {
		// int x1 = this.x;
		// int y1 = this.y;
		// int x2 = another.getX();
		// int y2 = another.getY();
		// return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance(another.getX(), another.getY());

	}

	public double distance() {
		return distance(0, 0);
	}

}

class MyCircle {
	private MyPoint center;
	private int radius;

	MyCircle() {
		center = new MyPoint();
		radius = 1;
	}

	MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
		this.radius = radius;
	}

	MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		center.setX(x);
	}

	public int getCenterY() {
		return center.getY();
	}

	public void setCenterY(int y) {
		center.setY(y);
	}

	public int[] getCenterXY() {
		return center.getXY();
	}

	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}

	public String toString() {
		return "MyCircle[radius = " + radius + ", center = " + center.toString() + "]";
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getCircumference() {
		return 2 * 3.14 * radius;
	}

	public double distance(MyCircle another) {
		return center.distance(another.getCenter());
	}
}

public class TestMyPoint {

	public static void main(String[] args) {

		MyPoint p1 = new MyPoint();
		System.out.println(p1);
		p1.setX(0);
		p1.setY(4);
		System.out.println("x is " + p1.getX());
		System.out.println("y is " + p1.getY());
		p1.setXY(4, 5);
		int[] arr = p1.getXY();
		System.out.println(Arrays.toString(arr));

		///
		MyPoint p2 = new MyPoint(1, 1);
		System.out.println(p2);

		double dis1 = p1.distance(p2);
		System.out.println(dis1);

		double dis2 = p1.distance(23, 56);
		System.out.println(dis2);

		double dis3 = p2.distance();
		System.out.println(dis3);

		System.out.println("testing circle--------");

		MyCircle circle1 = new MyCircle();
		System.out.println(circle1);

		MyCircle circle2 = new MyCircle(2, 3, 45);
		System.out.println(circle2);

		MyCircle circle3 = new MyCircle(p1, 90);
		System.out.println(circle3);

		double disc = circle2.distance(circle3);
		System.out.println("dis is " + disc);
		
		System.out.println(circle2.getArea());
		
		System.out.println(circle1.getCircumference());


	}
}
