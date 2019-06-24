package com.tcs.hdfc.rxconnect.corejava.statickeyword;

public class A {
	
	int a =40; // non static
	
	public static  void main(String[] args) {
		A obj =  new A();
		System.out.println(obj.a);
	}
	
	//A.main()
	//A ab  =  new A()
	// ab.main()

}
