import java.util.Scanner;

public class FactTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 4 bytes
		System.out.println("eneter num "); 
		int num = sc.nextInt(); // 4 bytes
		int res = fact(num); // 4 bytes 
		System.out.println("res is" + res);
		// T(n) = num of slots in stack * T(n) of one function call
		// T(5) = 5 * O(1) : 5
		// T(n) =  n * O(1)
		// T(n) = O(n)
		// S(n) = num of slots in stack * space of each slot
		// S(n) = n * 4 = 4n < c*n where c > 4 = O(n)
		
	}

	// 5! = 5*4*3*2*1
	// 5!= 5*4!
	// 4!=4*3!
	// 3!=3*2!
	// 2!= 2*1
	// 1! = 1* 0
	// 0!= 0*-1
	// n! = n*(n-1)!
	// fact(n) = n * fact(n-1);

	static int fact(int n) { // 4 bytes
		if (n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}

}
