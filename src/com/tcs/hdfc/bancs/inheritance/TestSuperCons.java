package com.tcs.hdfc.bancs.inheritance;

class Human {
	String color = "brown";

	Human(String color) {
		this.color = color;
	}

	// Human() {
	//
	// }
}

class Boy extends Human {
	Boy() {
		super("test");
	}

	// Boy() {
	// super();
	// }
}

public class TestSuperCons {

}
