package com.tcs.hdfc.rxconnect.oopsmodelling;

public class HashingTest {

	public static void main(String[] args) {

		int a = 97;
		char aa = (char) a;
		System.out.println(aa);

		// a%97=0
		// b%97=1

		int hashVal = myHash('c');

		String[] names = { "Shohom", "Mohit", "Shubham", "Mandeep", "Jatin" };
		int[] namesHashTable = new int[5];
		myHash(names[0].charAt(0));

	}

	private static int myHash(char c) {

		return c % 97;
	}

}
