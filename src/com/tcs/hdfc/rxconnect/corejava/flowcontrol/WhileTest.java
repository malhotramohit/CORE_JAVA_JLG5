package com.tcs.hdfc.rxconnect.corejava.flowcontrol;

public class WhileTest {
	public static void main(String[] args) {

		// 0 1 2 3 4
		// for (int i = 0; i < 5; i++) {
		// System.out.print(i);
		// }

		// for (int i = 0; i < 5; i++) {
		// System.out.println(i);
		// }

		int j = 0;
		while (j < 5) {
			System.out.println();
			j = j + 2;
		}

		// abh : 2 4 6 8 poor
		// sh: 0 2 4 6 8
		// krish: 0 2 4 6 8
		// kirti: 0 2 4 6 8
		// 000000000000000000000000000000000000000000000000000
		// j=0;
		// 0<5
		// 0
		// j--: j=j-1
		// j = 0-1; j =-1
		// -1
		// -1< 5
		// -1
		// j--
		// -2
		// -2<5

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
		System.out.println("After while....");

		// entry check loop
		int i = 0;
		while (i < 5) {
			int k = 0;
			while (k < 5) {
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();

		}

	}
}
