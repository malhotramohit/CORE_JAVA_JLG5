package com.tcs.hdfc.rxconnect.corejava.Strings;

public class StringTest2 {

	public static void main(String[] args) {

		String fname = "Mohit";
		String lname = "Malhotra";
		String fname1 = "MohitM";

		// concat
		// "+"

		System.out.println(fname + " " + lname);

		String fname2 = new String("Mohit");

		if (fname == fname2) {
			System.out.println("They are same");
		} else {
			System.out.println("They are not same");
		}
		if (fname.equals(fname1)) {
			System.out.println("They are same");
		} else {
			System.out.println("They are  not same");
		}

		// len
		int size = fname.length();
		System.out.println("len of fname is " + size);

		// charAt(index)

		System.out.println("Char at 2 is " + fname.charAt(2));

		// indexOf('i')
		System.out.println("Index of first occ a is " + lname.indexOf('a'));
		System.out.println("Index of sec occ a is " + lname.indexOf('a', 2));
		System.out.println("Index of hi  is " + fname.indexOf("hi"));

		// replace(a,b)
		fname1 = fname1.replace('M', 'R'); // MohitM
		System.out.println("After replacing " + fname1);

		// substring()
		fname1 =fname1.substring(2, 5);
		System.out.println("After substring " + fname1);

	}

}
