package com.tcs.hdfc.rxconnect.corejava.problems;

public class TriangleProblem {

	public static void main(String[] args) {
		int num = 25;// 8 : 2^6: 64
		// 32 16 8 4 2 1
		//  0  1 1 0 0 1
		//  0  0 0 1 0 1
		// num=num/2: 32
		// 16
		// 8
		// 4
		// 2
		// 1
		// int count = 0;
		// while (num != 1) {
		// count++;
		// sqrt(num);
		// }

		//System.out.println(sqrt(num));
		System.out.println(num>>2);
	}

	private static int sqrt(int num) {
		int i = 1;
		int res = 1;
		if (num == 0 || num == 1) {
			return num;
		}
		while (res <= num) {
			i++;
			res = i * i;
		}
		return i - 1;

	}

}
