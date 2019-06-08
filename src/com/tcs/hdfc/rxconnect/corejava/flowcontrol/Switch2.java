package com.tcs.hdfc.rxconnect.corejava.flowcontrol;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// mon tues we thurs : boring its a weekday
		// frid : yo!! near weekend
		// sat and sun : WOW its a weekend !!!
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day ");
		String day = input.next();
		// String day = Mon : {'M','o','n'} // 1020
		// input = "Mon" : {'M','o','n'} //1030
		/*
		 * if (day.equals("Mon") || day.equals("Tue") || day.equals("Wed") ||
		 * day.equals("Thurs")) { System.out.println("boring its a weekday"); } else if
		 * (day.equals("Fri")) { System.out.println("yo!! near weekend"); } else if
		 * (day.equals("Sat") || day.equals("Sun")) {
		 * System.out.println("WOW its a weekend !!!"); } else {
		 * System.out.println("Invalid Day"); }
		 */

		switch (day) {

		case "Mon":
		case "Tue":
		case "Wed":
		case "Thurs": {
			System.out.println("boring its a weekday");
		}
		case "Fri": {
			System.out.println("yo!! near weekend");
		}
		case "Sat":
		case "Sun": {
			System.out.println(" WOW its a weekend !!!");
		}
		default: {
			System.out.println("Invalid operation ");
		}

		}

	}

}
