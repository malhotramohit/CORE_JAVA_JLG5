package com.tcs.hdfc.rxconnect.corejava.interfaces;

interface UserInterface {
	void defaultFunc();
}

// abstract all methods
interface Android extends UserInterface {
	// rule : a method with only dec without any df
	void installPlayStore();

	void m1();

}

interface Windows {
	String name = "nokia9990";

	void installMSWord();

	void m1();
}

class Mobile implements Windows, Android {

	public void installMSWord() {
	//	name="htc4565";
		System.out.println("ms word it is");
	}

	@Override
	public void installPlayStore() {
		System.out.println("android installed");
	}

	@Override
	public void m1() {

	}

	@Override
	public void defaultFunc() {

	}

}

public class InterfaceTest {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile();
		mobile1.installMSWord();
		mobile1.installPlayStore();
	}

}
