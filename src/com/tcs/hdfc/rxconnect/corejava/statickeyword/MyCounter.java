package com.tcs.hdfc.rxconnect.corejava.statickeyword;

public class MyCounter {

	static int count = 0;

	public void increment() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		MyCounter myCounter1 = new MyCounter();
		myCounter1.increment();

		MyCounter myCounter2 = new MyCounter();
		myCounter2.increment();

		MyCounter myCounter3 = new MyCounter();
		myCounter3.increment();

		System.out.println("Access this using class " + MyCounter.count);
		
		//way 1 : non static : need an object
		int max = myCounter3.getMaxOfTwo(5, 7);
		System.out.println("max is " + max);
		
		//way  2 : method to be binded with class rather than object
		int max1 = getMaxOfTwo(7,9);
		
		
		//JVM : MyCounter.main
	}

	// Non static
	public static int  getMaxOfTwo(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
