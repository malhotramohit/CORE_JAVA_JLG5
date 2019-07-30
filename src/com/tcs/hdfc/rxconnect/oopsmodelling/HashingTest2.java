package com.tcs.hdfc.rxconnect.oopsmodelling;

import java.util.Objects;

class Address extends Object {
	private int pincode;
	private String addLine1;

	public Address(int pincode, String addLine1) {
		this.pincode = pincode;
		this.addLine1 = addLine1;
	}

	public boolean equals(Object obj) {
		boolean isSame = false;
		Address addObj = (Address) obj;

		if ((addObj.pincode == this.pincode) && (addObj.addLine1.equals(this.addLine1))) {
			isSame = true;
		}

		return isSame;

	}
	
	public int hashCode() {
		return Objects.hash(pincode,addLine1);
	}

	

}

public class HashingTest2 {

	public static void main(String[] args) {
		Address address1 = new Address(22323, "gyansetu");
		Address address2 = new Address(22323, "gyansetu");
		if (address1.equals(address2)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		System.out.println(address1.hashCode());
		System.out.println(address2.hashCode());

	}

}
