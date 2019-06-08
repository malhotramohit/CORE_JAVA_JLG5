package com.tcs.hdfc.rxconnect.corejava.flowcontrol;

public class DoWhileTest {

	public static void main(String[] args) {

		// int i = 5;
		// do {
		// System.out.println(i);
		// i--;
		// } while (i > 0);

		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * int k = 0; for (; k < 5;) { System.out.print("*"); k++; }
		 */
		System.out.println("After do while....");

		int i = 0;
		do {
			int k = 0;
			do {
				System.out.print("*");
				k++;
			} while (k < 5);

			System.out.println();
			i++;
		} while (i < 5);

	}

}
