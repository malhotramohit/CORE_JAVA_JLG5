package com.tcs.hdfc.bancs.inheritance;

import java.util.Arrays;

class MyFaceBookConstants {
	static final String USER_ADDRESS_MISSING_MSG = "Please enter address";
}

public class TestFinal {
	public static void main(String[] args) {
		// MyFaceBookConstants.USER_ADDRESS_MISSING_MSG = "hacked";

		System.out.println(MyFaceBookConstants.USER_ADDRESS_MISSING_MSG);

		final int[] arr = new int[2];// [0,0]
		arr[0] = 5; // arr : 1050 : [5,6]
		arr[1] = 6;
		arr[0] = 9; // arr : 1050 : [5,6]

		//arr = new int[3]; //[0,0,6]
		arr[2] = 6;
		
		final int k = 9;
		//k=90;
		
		
		System.out.println(Arrays.toString(arr));
	}

}
