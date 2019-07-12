package com.tcs.hdfc.rxconnect.corejava.interfaces;

interface Movable {
	public void moveUP();

	public void moveDown();

	public void moveRight();

	public void moveLeft();

}

class MovablePoint implements Movable {

	int x;
	int y;
	int xSpeed;
	int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUP() {
		y = y - ySpeed;// y-=ySpeed
	}

	@Override
	public void moveDown() {
		y = y + ySpeed;
	}

	@Override
	public void moveRight() {
		x = x - xSpeed;
	}

	@Override
	public void moveLeft() {
		x = x + xSpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

}

class MovableCircle implements Movable {

	private int radius;
	MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;

	}

	@Override
	public void moveUP() {

	}

	@Override
	public void moveDown() {

	}

	@Override
	public void moveRight() {

	}

	@Override
	public void moveLeft() {

	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

}

public class TestMovableInterface {

	public static void main(String[] args) {

		Movable m1 = new MovablePoint(10, 20, 2, 5);
		System.out.println(m1);
		m1.moveUP();
		System.out.println(m1);

	}

}
