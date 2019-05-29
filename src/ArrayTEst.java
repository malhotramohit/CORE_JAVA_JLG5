
public class ArrayTEst {

	public static void main(String[] args) {
		int day1 = 23; // 124

		int[] prodarray = new int[5];
		// [0,1,2,3,4]
		// 124 , 128, 132, 136, 140
		// 0 0 0 0 0
		prodarray[0] = 23;
		prodarray[1] = 24;
		prodarray[2] = 25;

		System.out.println("array value at 0 is " + prodarray[0]);
		System.out.println("array value at 1 is " + prodarray[1]);

		int[] arr = new int[100];

		// array population
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("VAlues are " + arr[i]);
		}

		// for, while, do while

		//
		// //
		// *****
		// *****
		// *****
		// *****
		// *****//

		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int[] arr1 = { 23, 45, -25, 90, 100 };
		for (int k = 0; k < arr1.length; k++) {
			System.out.println("Values are " + arr1[k]);
		}

	}
}
