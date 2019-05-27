
public class MyFIrstClass {

	public static void main(String args[]) {

		System.out.println("Hello, World");

		// 8421
		// 1111
		// 2bits : 0, 1;:
		// 00 0
		// 01 1
		// 10 2
		// 11 3
		// Number :
		// -128 - 127
		// 256 128 64 32 16 8 4 2 1
		// 0 1 0 0 0 0 0 0 1 + 129
		// 1 0 1 1 1 1 1 1 0 1's compl
		// + 1
		// 1 0 1 1 1 1 1 1 1 : -129
		byte age = (byte) -129; // 1Byte : 8bits : 7bits + 1 sign bit
		short s = 1234; // 2 bytes : 16 bits
		int i = 176765; // 4 bytes : 32 bit
		long l = 878686869; // 8 bytes : 64 bits
		System.out.println(age);

		float yearOfExp = 3.5f;
		double distanceBwSunAndMoon = 7868766.876868698696;
		System.out.println("Distance is " + distanceBwSunAndMoon);

		char gender = 'M';
		char smallA = 99;
		System.out.println(smallA);

		boolean flag = true;

		//
		String name = "Mohit Malhotra";
		System.out.println("Name is " + name);

		int some = 0;

		System.out.println("Default value of some is " + some);

		// 256 64 8 1
		int k = 0012; // Octal : 0-7 : 8^1*1 +8^0*2
		int k1 = 0b111; // Binary : 0-1 : 7
		int k2 = 0x1A; // Hexa : 0-9 A-F : 16^1*1 +16^0*10

		System.out.println(k);
		System.out.println(k1);
		System.out.println(k2);

		// % : remainder

		int num2 = 2;
		int num3 = 2;
		System.out.println("Rem is " + num2 % num3);

		// > < >= <= != ==
		if (num2 >= num3) {
			System.out.println("Num2 is bigger");
		} else if (num2 != num3) {
			System.out.println("they are same");
		} else {
			System.out.println("NOB");
		}

		// && || !

		int num4 = 99;
		if (num2 >= num3 && num2 > num4) {
			System.out.println("Num2 is bigger");
		} else if (num2 != num3) {
			System.out.println("they are same");
		} else {
			System.out.println("NOB");
		}

		// ?: ternary

		boolean ans = num2 == num3 ? true : false;
		String ansString = num2 >= num3 ? "They are same" : "They are not same";

		System.out.println("ans is " + ansString);

		int count = 4;
		count += 1; // count = count+1
		// count++
		System.out.println("Now count " + count);

		//
		int post = 4;
		int res1 = post++;
		System.out.println("post is " + res1 + "Post is " + post);

		int post1 = 4;
		int res12 = ++post1;
		System.out.println("post is " + res12 + "Post is " + post1);
	}

}
