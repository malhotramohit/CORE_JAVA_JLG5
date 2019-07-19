package com.tcs.hdfc.rxconnect.oopsmodelling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Banking Application Customers will go to bank to : 1) New Customer then you
 * will open/create account 2) Bank will create customer 3) name address email
 * adhar type : Sav Salary? 4) Deposit something 5) Update/delete customer
 * details 6) Update/delete customer details 7) Transfer acc1->acc2
 * 
 * @author mohitmalhotra
 *
 *         Solution: 1) Identify all the nouns : Customer Account Bank 2) Bank :
 *         List of customers and list of accounts 3) Some of the functions can
 *         work in offline mode
 *
 */

class Customer {
	private long custId;
	private String custName;
	private String adharNum;
	private int age;

	private List<Account> accounts;

	public Customer() {
		System.out.println("Going to create customer");
	}

	public Customer(String custName, String adharNum, int age) {
		this.custName = custName;
		this.adharNum = adharNum;
		this.age = age;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(String adharNum) {
		this.adharNum = adharNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", adharNum=" + adharNum + ", age=" + age
				+ "]";
	}

}

enum AccountType {
	SAVINGS, SALARY
}

abstract class Account {
	protected long accNum;
	protected AccountType accountType;
	protected double balance;

	public Account(AccountType accountType, double balance) {
		this.accountType = accountType;
		this.balance = balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract String toString();
}

class SavingsAccount extends Account {

	private double minBalance;
	private double interest;

	SavingsAccount(AccountType accountType, double balance, double minBalance, double interest) {
		super(accountType, balance);
		this.minBalance = minBalance;
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", interest=" + interest + ", accNum=" + accNum
				+ ", accountType=" + accountType + ", balance=" + balance + "]";
	}

}

class SalaryAccount extends Account {
	private double lastAmountCredited;

	public SalaryAccount(AccountType accountType, double balance, double lastAmountCredited) {
		super(accountType, balance);
		this.lastAmountCredited = lastAmountCredited;
	}

	@Override
	public String toString() {
		return "SalaryAccount [lastAmountCredited=" + lastAmountCredited + ", accNum=" + accNum + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}

}

class Bank {
	private static List<Customer> customers;
	private static List<Account> accounts;
	public static final double savingsInterestRate = 8.5;
	public static final double savingsMinimumBalance = 500;

	Bank() {
		customers = new ArrayList<Customer>();
		accounts = new ArrayList<Account>();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		Bank.customers = customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		Bank.accounts = accounts;
	}

}

interface BankManagementService {

	public Customer createCustomer();

	public void displayCustomer(Customer customer);

	public Account openAccount(Customer customer, AccountType accountType);

	public void displayCustomerAccountDetails(Customer customer1);

	public void displayAllCustomersByIncAge();

}

class BankManagementOfflineServiceImpl implements BankManagementService {

	@Override
	public Customer createCustomer() {
		System.out.println("Create customer facility is not availbale in offline mode");
		return null;
	}

	@Override
	public void displayCustomer(Customer customer) {
		System.out.println(customer);
	}

	@Override
	public Account openAccount(Customer customer, AccountType accountType) {
		System.out.println("Create customer facility is not availbale in offline mode");
		return null;
	}

	@Override
	public void displayCustomerAccountDetails(Customer customer1) {

	}

	@Override
	public void displayAllCustomersByIncAge() {
		// TODO Auto-generated method stub

	}

}

class BankManagementServiceImpl implements BankManagementService {

	private static Scanner scanner = new Scanner(System.in);
	private Bank bank = new Bank();

	@Override
	public Customer createCustomer() {

		Customer customer1 = new Customer();

		System.out.println("enter customer name");
		String custName = scanner.next();
		customer1.setCustName(custName);
		System.out.println("enter customer adharno");
		String adharnum = scanner.next();
		customer1.setAdharNum(adharnum);
		System.out.println("enter customer age");
		int age = scanner.nextInt();
		customer1.setAge(age);

		if (customer1.getCustId() == 0) {
			long seq = getNextCustomerSeq();
			customer1.setCustId(seq);
		}

		bank.getCustomers().add(customer1);
		return customer1;
	}

	private long getNextCustomerSeq() {
		List<Customer> customers = bank.getCustomers();
		long max = 0;
		for (Customer customer : customers) {
			if (customer.getCustId() > max) {
				max = customer.getCustId();
			}
		}

		return max + 1;
	}

	@Override
	public void displayCustomer(Customer customer) {
		System.out.println(customer);

	}

	@Override
	public Account openAccount(Customer customer, AccountType accountType) {

		Account account = createAccount(accountType);
		List<Account> accounts = customer.getAccounts();
		if (accounts == null) {
			accounts = new ArrayList<Account>();
		}
		accounts.add(account);
		customer.setAccounts(accounts);

		return account;
	}

	private Account createAccount(AccountType accountType) {
		Account account = null;
		if (accountType.equals(AccountType.SAVINGS)) {
			System.out.println("Give the amount to deposit");
			double amount = scanner.nextDouble();
			if (amount < Bank.savingsMinimumBalance) {
				throw new RuntimeException("Minimum balance should be " + Bank.savingsMinimumBalance);
			}
			account = new SavingsAccount(AccountType.SAVINGS, amount, Bank.savingsMinimumBalance,
					Bank.savingsInterestRate);
		} else if (accountType.equals(AccountType.SALARY)) {
			account = new SalaryAccount(AccountType.SALARY, 0, 10000);

		}

		long accNumSeq = getNextAccountNumSeq();
		account.setAccNum(accNumSeq);

		bank.getAccounts().add(account);

		return account;
	}

	private long getNextAccountNumSeq() {
		List<Account> accounts = bank.getAccounts();
		long max = 0;
		for (Account acc : accounts) {
			if (acc.getAccNum() > max) {
				max = acc.getAccNum();
			}
		}
		return max + 1;
	}

	@Override
	public void displayCustomerAccountDetails(Customer customer1) {
		List<Account> accounts = customer1.getAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}

	}

	@Override
	public void displayAllCustomersByIncAge() {
		List<Customer> customers = bank.getCustomers();
		Collections.sort(customers, Comparator.comparing(Customer::getAge));
		customers.stream().forEach(System.out::println);

	}

}

public class BankingApp1 {

	public static void main(String[] args) {
		System.out.println("Welcome to HDFC");
		boolean isAppOnline = true;
		BankManagementService bankManagementService;
		if (isAppOnline) {
			bankManagementService = new BankManagementServiceImpl();
		} else {
			bankManagementService = new BankManagementOfflineServiceImpl();

		}

		for (int i = 0; i < 3; i++) {
			Customer customer1 = bankManagementService.createCustomer();
			bankManagementService.displayCustomer(customer1);
			// to create account
			Account account = bankManagementService.openAccount(customer1, AccountType.SAVINGS);
			bankManagementService.displayCustomerAccountDetails(customer1);
		}

		// displayDetails of all the customers sorted by increasing balance
		bankManagementService.displayAllCustomersByIncAge();

	}

}
