package com.tcs.hdfc.rxconnect.oopsmodelling;

import java.util.*;

class Account1 {
	private long accNo;
	private double balance;
	private int pin; // 32 bits : 2^31 -1

	public Account1(long accNo, double balance, int pin) {
		this.accNo = accNo;
		this.balance = balance;
		this.pin = pin;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Account1 [accNo=" + accNo + ", balance=" + balance + ", pin=" + pin + "]";
	}

}

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Long, Account1> accountsMap = new HashMap<Long, Account1>(5);
		Account1 account1 = new Account1(2423432, 343.4, 1234);
		Account1 account2 = new Account1(768768, 345453.4, 4323);
		Account1 account3 = new Account1(57576, 4545.4, 4555);

		accountsMap.put(2423432L, account1);
		accountsMap.put(768768L, account2);
		accountsMap.put(57576L, account3);

		Account1 acc = accountsMap.get(57576L);
		System.out.println(acc);

		accountsMap.put(57576L, account2);

		acc = accountsMap.get(57576L);
		System.out.println(acc);

		Set<Map.Entry<Long, Account1>> entries = accountsMap.entrySet();

		for (Map.Entry<Long, Account1> entry : entries) {
			System.out.println("key is " + entry.getKey());
			System.out.println("value  is " + entry.getValue());

		}

	}

}
