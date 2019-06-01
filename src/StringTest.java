
public class StringTest {

	public static void main(String[] args) {

		// way 1
		String name = "Mohit"; // 'Mohit'

		// way 2
		String name1 = new String("Rohit");

		// way 1
		String str1 = "Cat"; // 1020
		String str2 = "Cat"; // 1020

		if (str1 == str2) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}

		// way 2
		String str3 = new String("Dog"); // 1030
		String str4 = new String("Dog"); // 1050

		if (str3 == str4) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}

		if (str3.equals(str4)) {

			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}

		String fname = "MohotMalhotra";

		int size = fname.length();
		System.out.println("Size of string is " + size);

		char anyChar = fname.charAt(4);
		System.out.println("Char at 4 is " + anyChar);

		int index = fname.indexOf('o');
		System.out.println("Index of first occ of o is " + index);

		int index1 = fname.indexOf('o', 4);
		System.out.println("Index of sec occ of o is " + index1);

		int index2 = fname.indexOf('x');
		System.out.println("Index of first occ of x is " + index2);

		String sName = fname.substring(0, 5);
		System.out.println("Starting name is " + sName);

		String nName = fname.replace('M', 'R');
		fname = nName;
		System.out.println("Name after replacing " + fname);

		fname = fname.replace("ho", "pq");
		System.out.println("Name after replacing " + fname);

		String address = "  Gyansetu Sec32  "; // 7890 --> 8907
		address = address.trim(); // 8907
		System.out.println("Address without whitespace" + address + "Done");

		if (address.startsWith("gyan")) {
			System.out.println("yes ");
		} else {
			System.out.println("No");
		}

		if (address.endsWith("32")) {
			System.out.println("yes ");
		} else {
			System.out.println("No");
		}

		address = address.toLowerCase();
		System.out.println("address in lower " + address);
		
		

	}

}
