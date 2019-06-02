import java.util.Scanner;

public class SortingTech {

	public static void main(String[] args) {

		// int[] array = inputArray();// get the values from user and return one array
		// displayArray(array);
		int[] arr = { 128, 78, -90, 23, 9, 100 ,12,13,14,15,16,17,18,19,80,190};
		int[] array = bubbleSort(arr);
		// System.out.println("after 1 iteration of bubble sort");
		displayArray(array);
		int index = -1;

		index = binarySearch(array, 0, array.length - 1, 190);
		if (index != -1) {
			System.out.println("Present at " + index);
		}

	}

	//T(n) = number of slots of stack * running time in each slot
	// n=6 : s =3
	// n= 16  : s= log(16)+1
	// n =32 : s = log(32)+1
	// n = 64 : s = log(64)+1
	// n = : s = log(n)+1
	//	T(n) = log(n) * O(1) = O(log(n))
	// S(n) = 12+n+log(n) < O(n)
	// -90 9 23 78 100 128 : 128
	// 0 1 2 3 4 5
	// mid = 2 : array[mid] = 23
	// false
	// 128 > 23 ? yes
	// 78 100 128 : 128
	// 3 4 5
	// mid = 4 array[mid] == 128 ?
	// false
	// 128 > 100 ? yes
	// 128
	// 5
	// mid = 5+5 /2 = 5
	// array[mid] == num ? 128 == 128 ? mid = 5

	static int binarySearch(int[] array, int p, int q, int num) {
		int mid = (p + q) / 2; // 2/ calculate mid =
		if (array[mid] == num) {
			return mid;
		} else {

			if (num > array[mid]) {
				return binarySearch(array, mid + 1, array.length - 1, num);
			} else {
				return binarySearch(array, 0, mid - 1, num);
			}
		}
	}

	static int[] bubbleSort(int[] array) {
		// 0 1
		// 123,78,-90,23,9,100 : -9,23,34,78,123
		// 1 2
		// 78,123,-90,23,9,100
		// 2 3
		// 78,-90,128,23,9,100
		// 3 4
		// 78,-90,23,128,9,100
		// 4 5
		// 78,-90,23,9,128,100
		// 78,-90,23,9,100,128

		// 78,-90,23,9,100,128

		// O(n*n) , Big Oh n2

		// n + n-1 + n-2 + n-3 ..... 1
		// n(n+1)/2
		// (n^2 + n)/2
		// n^2/2 +n/2 < n^2/2 < n^2

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					// a = a+b;
					// b = a-b;
					// a = a-b;
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];
				}
			}

		}

		return array;

	}

	static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();

		int[] dummyArray = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please enter the value at index " + i);
			dummyArray[i] = sc.nextInt();
		}

		return dummyArray;
	}

	static void displayArray(int[] array) {
		System.out.println("Array is ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
