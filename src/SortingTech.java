import java.util.Scanner;

public class SortingTech {

	public static void main(String[] args) {

		// int[] array = inputArray();// get the values from user and return one array
		// displayArray(array);
		int[] arr = { 123, 78, -90, 23, 9, 100 };
		int[] array = bubbleSort(arr);
		System.out.println("after 1 iteration of bubble sort");
		displayArray(array);

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
		
		//n + n-1 + n-2 + n-3 ..... 1
		// n(n+1)/2 
		// (n^2 + n)/2
		// n^2/2 +n/2 < n^2/2 < n^2
		
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] < array[j + 1]) {
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
