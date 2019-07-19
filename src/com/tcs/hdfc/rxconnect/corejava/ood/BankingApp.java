package com.tcs.hdfc.rxconnect.corejava.ood;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private long custID;
	private String customerName;
	private int age;
	private List<Account> accounts;

	public Customer(long custID, String customerName, int age) {
		this.custID = custID;
		this.customerName = customerName;
		this.age = age;
	}

	public Customer(long custID, String customerName, int age, List<Account> accounts) {
		this.custID = custID;
		this.customerName = customerName;
		this.age = age;
		this.accounts = accounts;
	}

	public long getCustID() {
		return custID;
	}

	public void setCustID(long custID) {
		this.custID = custID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
		return "Customer [custID=" + custID + ", customerName=" + customerName + ", age=" + age + ", accounts="
				+ accounts + "]";
	}

}

enum AccountType {
	SAVINGS, CURRENT
}

abstract class Account {
	protected long accNo;
	protected AccountType accountType;
	protected Customer customer;

	public Account(AccountType accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public abstract String toString();

}

class SavingsAccount extends Account {

	private double minBalance;
	private double totalSavings;

	public SavingsAccount(AccountType accountType, Customer customer, double minBalance, double totalSavings) {
		super(accountType, customer);
		this.minBalance = minBalance;
		this.totalSavings = totalSavings;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", totalSavings=" + totalSavings + ", accNo=" + accNo
				+ ", accountType=" + accountType + "]";
	}

}

class CurrentAccount extends Account {
	private double balance;

	public CurrentAccount(AccountType accountType, Customer customer, double balance) {
		super(accountType, customer);
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CurrentAccount [balance=" + balance + ", accNo=" + accNo + ", accountType=" + accountType + "]";
	}

}

class Bank {

	private static Bank instance = new Bank();

	public static Bank getInstance() {
		return instance;
	}

	private Bank() {
		Customer customer1 = new Customer(13, "Neeti", 24);
		Account account1 = new SavingsAccount(AccountType.SAVINGS, customer1, 1000.0, 23445.988);
		Account account2 = new CurrentAccount(AccountType.CURRENT, customer1, 100);
		account1.setAccNo(1);
		account2.setAccNo(2);

		accounts = new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);

		customer1.setAccounts(accounts);

		customers = new ArrayList<>();
		customers.add(customer1);
	}

	private static List<Account> accounts;
	private static List<Customer> customers;

	public Bank(List<Account> accounts, List<Customer> customers) {
		Bank.accounts = accounts;
		Bank.customers = customers;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		Bank.accounts = accounts;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		Bank.customers = customers;
	}

}

interface AccountManagementService {

	public List<Customer> getAllCustomers();

	public List<Account> getCustomerAccountByType(AccountType accountType, Customer customer);

	public boolean createAccount(Account account, Customer customer);

	public boolean deleteAccount(Account account, Customer customer);

	public boolean updateAccountDetails(Account account, Customer customer);

	public double getTotolBalanceOfBank();

	public boolean transfer(Account account1, Account account2, double amount);

}

@SuppressWarnings({ "unchecked", "rawtypes" })
abstract class BaseServiceImpl {
	public void add(List list, Object element) {
		list.add(element);
	}

	public long getAccountNextAccountNo() {
		Bank bank = Bank.getInstance();
		List<Account> accounts = bank.getAccounts();
		long max = -1;
		for (Account acc : accounts) {
			if (max < acc.getAccNo()) {
				max = acc.getAccNo();
			}
		}
		return max + 1;
	}
}

class AccountManagementOnlineImpl extends BaseServiceImpl implements AccountManagementService {

	private static AccountManagementOnlineImpl accountManagementOnlineImpl = new AccountManagementOnlineImpl();

	public static AccountManagementOnlineImpl getInstance() {
		return accountManagementOnlineImpl;
	}

	private AccountManagementOnlineImpl() {
		System.out.println("Creating instance of AccountManagementOnlineImpl");
	}

	Bank bank = Bank.getInstance();

	@Override
	public List<Account> getCustomerAccountByType(AccountType accountType, Customer customer) {
		return null;
	}

	@Override
	public boolean createAccount(Account account, Customer customer) {
		account.setAccNo(getAccountNextAccountNo());
		add(bank.getAccounts(), customer);
		return true;
	}

	@Override
	public boolean deleteAccount(Account account, Customer customer) {
		return false;
	}

	@Override
	public boolean updateAccountDetails(Account account, Customer customer) {
		return false;
	}

	@Override
	public double getTotolBalanceOfBank() {
		return 0;
	}

	@Override
	public boolean transfer(Account account1, Account account2, double amount) {
		return false;
	}

	@Override
	public List<Customer> getAllCustomers() {

		return bank.getCustomers();
	}

}

public class BankingApp {
	public static void main(String[] args) {
		AccountManagementService accountManagementService = AccountManagementOnlineImpl.getInstance();
		List<Customer> customers = accountManagementService.getAllCustomers();
		System.out.println(customers);
	}

}
