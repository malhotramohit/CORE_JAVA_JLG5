package com.tcs.hdfc.rxconnect.corejava.exceptionhandling;


// runtime excep: unchecked ex: : extends RuntimeException
// compile time : checked exception : extends Exception
class Parcel {

	private int id;
	private Object obj;
	public static String type = "AClass"; // class not with object

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}

public class Exception1 {
	public static void main(String[] args) {

		System.out.println("Before Exception");

		try {
			int num = 90;
			int div = 0;
			if (div != 0) {

				System.out.println(num / div); // arithmetic exception
			}

			Parcel parcel = null;
			if (null != parcel) {
				System.out.println(parcel.type);
				parcel.getId(); // null.something : nullpointerexcption
			}

			int[] numbers = { 1, 2, 3 };
			int index = 8;
			if (index < numbers.length) {
				System.out.println(numbers[index]);

			}

		} catch (ArithmeticException e) {
			System.out.println("arithmetic caught");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
		} finally {
			System.out.println("I will always execute");
		}

		// try catch finally throw throws

		System.out.println("After exception");
	}

}
