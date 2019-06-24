package com.tcs.hdfc.rxconnect.corejava.statickeyword;

import java.util.Scanner;

public class MathUtility {
	public static void main(String[] args) {
		System.out.println("Given some num");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean res = checkIfOdd(num);
		if (res) {
			System.out.println("The num is odd");
		} else {
			System.out.println("The num is even");
		}

	}

	// this method will return true if the given num is odd
	public static boolean checkIfOdd(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

}
