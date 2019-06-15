package com.tcs.hdfc.rxconnect.corejava.composition;

public class g {
	public static void main(String[] args) {
		print(new Integer(23));
		print("Mohit");
	}

	private static <T> void print(T obj) {
		System.out.println(obj);
	}

}
