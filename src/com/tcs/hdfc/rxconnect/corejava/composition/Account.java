package com.tcs.hdfc.rxconnect.corejava.composition;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account() {
		id = "a";
		name = "Arv";
		balance = 10000;
	}

	public Account(String Id, String Name, int Balance) {
		this.id = Id;
		this.name = Name;
		this.balance = Balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNmae() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int Credit(int amount) {
		return amount + balance;
	}

	public int Debit(int amount) {
		if (amount <= balance) {
			// System.out.println("subtract amount from balance");

			balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;

	}

	public int Transfer(int amount) {
		if (amount <= balance) {
			// System.out.println("transfer amount to the given account");
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public String toString() {
		return "Account[Id = " + id + "Name =" + name + ", Balance=" + balance + ",]";
	}

	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.getId());
		System.out.println(a.getNmae());
		System.out.println(a.getalance());
		System.out.println(a.Credit(10000));
		System.out.println(a.Debit(5000));
		System.out.println(a.Transfer(20000));
	}

}
