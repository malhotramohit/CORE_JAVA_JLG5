package com.tcs.hdfc.rxconnect.corejava.flowcontrol;

public class ArrayMys1 {
	public static void main(String[] args) {
		
		

	}
	
	
	
	public static void mystery(int[] a, int[] b) {
	    for (int i = 0; i < 5; i++) {
	        //a[i] += b[4- i];
	        a[i] = a[i]+b[4-i];
	    }
	}
//	What are the values of the elements in array a1 after the following code executes?
//a+=2;
	//a=a+2;
//	int[] a1 = {26, 19, 14, 11, 10};
//	int[] a2 = {1, 4, 9, 16, 25};
//	mystery(a1, a2);
	
	//3+
}
