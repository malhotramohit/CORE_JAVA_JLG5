package com.tcs.hdfc.rxconnect.corejava.inheritance;

// concerte parent
// abstract class as parent
// interface as parent

interface Movable {

	public int getArea();
}

class Pentagon implements Movable {

	int side = 90;

	public int getArea() {
		return 90;
	}
}

abstract class APar2 {

	abstract void m1();

	void m2() {
		System.out.println("I am abs m2");
	}
}

class Par1 {
	int a = 3;

	void m1() {
		System.out.println("From parent 1");
	}
}

class Child1 extends Par1 {
	int b = 9;

	void m1() {
		System.out.println("From child 1");
	}

	void m2() {
		System.out.println("From child 1 m2");

	}
}

class Child2 extends APar2 {
	int f = 90;

	void m1() {
		System.out.println("from child2 m2");
	}
}

public class TestInheritancePitfalls {
	public static void main(String[] args) {

		// creatin parents object calling parents members
		Par1 par1 = new Par1();
		System.out.println(par1.a);
		par1.m1();

		// creating child objecs and calling child members
		Child1 child1 = new Child1();
		System.out.println(child1.a); // parent
		System.out.println(child1.b);
		child1.m1();
		child1.m2();

		// runtime binding
		// parent's reference var can refer to childs object
		//
		System.out.println("concrete pare as ref and obj of child");
		Par1 child2 = new Child1();
		System.out.println(child2.a);
		child2.m1();

		// CTE
		// APar2 aPar2 = new APar2();
		APar2 aPar2 = new Child2();
		aPar2.m1();
		
		
		//
		Movable movingPentagon =  new Pentagon();
		movingPentagon.getArea();
		
		Pentagon pentagon2 =  new Pentagon();
		System.out.println(pentagon2.side);
		pentagon2.getArea();
		
		
		Pentagon pentagon3 = (Pentagon) movingPentagon;
		
		

	}

}
