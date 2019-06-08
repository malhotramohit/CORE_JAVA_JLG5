package com.tcs.hdfc.rxconnect.corejava.flowcontrol;

import java.util.Scanner;

/**
 
 Problem 1: 
 Area of triangle: 
 1) scan 3 sides (a,b,c)
 2) write code to check the type of triangle : 1) comparing sides : eq, right, isco , scalene : herons formula
 3) circle area
 
 p2 :Calculator : Add 2 operands
 			  Sub
 			  Mul
 			  Div
 			  Modulo
 
 */

public class AreaCalculator {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// 1) To calculate Area of Square enter 1
		// 2) To calculate Area of Rectangle enter 2
		// 3) To calculate Area of Circle enter 3
		int choice = 0;

		do {

			System.out.println("***MENU***");
			System.out.println("To calculate Area of Square enter 1");
			System.out.println("To calculate Area of Rectangle enter 2");
			System.out.println("To calculate Area of Circle enter 3");
			System.out.println("To calculate Area of Tiangle enter 4");
			System.out.println("Press -1 to exit");
			choice = input.nextInt();

			switch (choice) {

			case 1: {
				calculateSquareArea();
			}
				break;
			case 2: {
				calculateRetangleArea();
			}
				break;

			case -1: {
				System.out.println("Bye Bye");
			}
				break;
			default: {
				System.out.println("Invalid Operation");
			}

			}
		} while (choice != -1);

	}

	static void calculateSquareArea() {
		System.out.println("Please enter the side ");
		int side = input.nextInt();
		int area = side * side;
		System.out.println("Area is " + area);
	}

	static void calculateRetangleArea() {
		int len;
		int breadth;
		System.out.println("Please enter the len ");
		len = input.nextInt();
		System.out.println("Please enter the breadth ");
		breadth = input.nextInt();
		int area = len * breadth;
		System.out.println("Area is " + area);
	}
}
