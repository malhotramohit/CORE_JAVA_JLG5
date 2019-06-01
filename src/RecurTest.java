
public class RecurTest {

	static int count = 0;

	public static void main(String[] args) {
		method();

	}

	static void method() {
		if (count < 5) {
			count++;
			System.out.println("Count is " + count);
			method();
		}
	}

}
