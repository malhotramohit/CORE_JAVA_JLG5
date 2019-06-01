
import java.util.Scanner;

public class ArrayProblems {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter some value");
		int num = input.nextInt();
		System.out.println("Value entered by user is " + num);

		System.out.println("Please enter name");
		String name = input.next();
		System.out.println("name  is " + name);

		doLS();

	}

	public static void doLS() {

		int[] array = { -9, 55, 78, 23, 89 };
		int size = array.length;
		int num = 90;
		int index = 0;
		boolean isPresent = false;
		// Big oh N O(n)
		for (int i = 0; i < size; i++) {
			index++;
			if (num == array[i]) {
				isPresent = true;
				break;
			}
		}
		if (isPresent) {
			System.out.println("Present " + index);
		} else {
			System.out.println("Not Found");
		}

	}

}
