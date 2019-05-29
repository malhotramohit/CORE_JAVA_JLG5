
public class MethodExample {

	public static void main(String[] args) {

		MethodExample example = new MethodExample();

		int res = example.getSquare(5);
		System.out.println("The square is " + res);

		String fname = "mohit";
		String lname = "Malhotra";

		String fullName = getFullName(fname, lname);
		System.out.println(fullName);

	}

	// this will return the square of a given num
	int getSquare(int num) {
		int res = num * num;
		return res;
	}

	static String getFullName(String fname, String lname) {
		return fname + " " + lname;
	}

}
