package com.tcs.hdfc.rxconnect.corejava.oopsmodelling;

import java.util.Date;

/**
 * This is class for discount rates
 */
class DiscountRate {

	// These are constants
	public static String TYPE_GOLD = "GOLD";
	public static String TYPE_PREMIUM = "PREMIUM";
	public static String TYPE_SILVER = "SILVER";

	public static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
	public static final double SERVICE_DISCOUNT_GOLD = 0.15;
	public static final double SERVICE_DISCOUNT_SILVER = 0.1;

	// These can change future
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;

	public static double getProductDiscountRate(String type) {
		double productDiscountRate = 0.0;
		if (type.equals(TYPE_GOLD)) {
			productDiscountRate = productDiscountGold;
		} else if (type.equals(TYPE_PREMIUM)) {
			productDiscountRate = productDiscountPremium;

		} else if (type.equals(TYPE_SILVER)) {
			productDiscountRate = productDiscountSilver;

		}
		return productDiscountRate;
	}

}

class Customer {
	private String name;
	private boolean member;
	private String memberType;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberType() {
		return memberType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}

}

class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
		if (customer.isMember()) {
			serviceExpense = 1000;
			productExpense = 2000;
		} else {
			serviceExpense = 1500;
			productExpense = 2500;
		}
	}

	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public double getTotalExpense() {
		if (customer.isMember()) {
			// both serv and prodcut
			if (customer.getMemberType().equals(DiscountRate.TYPE_PREMIUM)) {
				double serviceExpenseDiscount = serviceExpense * DiscountRate.SERVICE_DISCOUNT_PREMIUM;
				serviceExpense = serviceExpense - serviceExpenseDiscount;
			} else if (customer.getMemberType().equals(DiscountRate.TYPE_GOLD)) {
				double serviceExpenseDiscount = serviceExpense * DiscountRate.SERVICE_DISCOUNT_GOLD;
				serviceExpense = serviceExpense - serviceExpenseDiscount;
			} else if (customer.getMemberType().equals(DiscountRate.TYPE_SILVER)) {
				double serviceExpenseDiscount = serviceExpense * DiscountRate.SERVICE_DISCOUNT_SILVER;
				serviceExpense = serviceExpense - serviceExpenseDiscount;
			}
			double productDiscount = productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
			productExpense = productExpense - productDiscount;

		} else {
			// product
			double productDiscount = productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
			productExpense = productExpense - productDiscount;
		}

		return serviceExpense + productExpense;
	}

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}

}

public class TestSalonApp {

	public static void main(String[] args) {

		Customer customer1 = new Customer("Shohom");
		customer1.setMember(false);
		customer1.setMemberType(DiscountRate.TYPE_GOLD);

		Visit visit1 = new Visit(customer1, new Date());

		double totalExp = visit1.getTotalExpense();
		System.out.println("Total expenses are " + totalExp);

	}

}
