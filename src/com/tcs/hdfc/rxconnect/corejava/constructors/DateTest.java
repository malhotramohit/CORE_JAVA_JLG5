package com.tcs.hdfc.rxconnect.corejava.constructors;

class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		String dd = String.valueOf(day);
		String mm = String.valueOf(month);
		if (day <= 9) {
			dd = "0" + day;
		}
		if (month <= 9) {
			mm = "0" + month;
		}
		return dd + "/" + mm + "/" + year;
	}

}

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(31, 11, 1193);
		System.out.println(date1);
	}

}
