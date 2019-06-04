package com.tcs.hdfc.rxconnect.corejava.constructors;

public class Account {

	long accNo;
	long chequeBookNo;
	// java compiler
	/*
	 * Account(){
	 * 
	 * }
	 */

	 Account(long accP, long chequeBookNoP) {
		System.out.println("I am two args cons");
		accNo = accP;
		chequeBookNo = chequeBookNoP;
	}

	public static void main(String[] args) {

		Account mohitSAcc = new Account(123, 345435);

		System.out.println("Acc no is " + mohitSAcc.accNo);
		System.out.println("Cheque no is " + mohitSAcc.chequeBookNo);

		Account rohitSAcc = new Account(8786, 9080808);

		System.out.println("Acc no is " + rohitSAcc.accNo);
		System.out.println("Cheque no is " + rohitSAcc.chequeBookNo);

	}

}
