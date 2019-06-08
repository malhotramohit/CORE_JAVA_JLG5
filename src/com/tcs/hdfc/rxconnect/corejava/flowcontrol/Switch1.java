package com.tcs.hdfc.rxconnect.corejava.flowcontrol;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {

		// A, B, C,D , NA
		// String grade = "B";
		Scanner input = new Scanner(System.in);

		// if (grade.equals("A")) {
		// System.out.println("The grade is A : Range is 90-100");
		// } else if (grade.equals("B")) {
		// System.out.println("The grade is B : Range is 80-90");
		// } else if (grade.equals("C")) {
		// System.out.println("The grade is C : Range is 70-80");
		// } else if (grade.equals("D")) {
		// System.out.println("The grade is D : Range id 60-70");
		// } else {
		// System.out.println("Invalid option");
		// }

		// fall through :
		//
		System.out.println("Please enter some grade to get the range");
		String grade = input.next(); // C address: 1020;

		while (null != grade && !grade.equals("X")) {

			switch (grade) {

			case "A": {
				System.out.println("The grade is A : Range is 90-100");

			}
				break;

			case "B": {
				System.out.println("The grade is B : Range is 80-90");

			}
				break;
			case "C": {
				System.out.println("The grade is C : Range is 70-80");
			}
				break;
			case "D": {
				System.out.println("The grade is D : Range is 60-70");

			}
				break;

			case "X": {
				System.out.println("Bye bye");
				grade = "X";
			}
				break;

			default: {
				System.out.println("Invalid operation");

			}

			}

			System.out.println("Please enter some grade to get the range");
			grade = input.next(); // C address: 1020

		}

	}
}
