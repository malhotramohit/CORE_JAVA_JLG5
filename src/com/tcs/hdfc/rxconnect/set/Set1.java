package com.tcs.hdfc.rxconnect.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Computer {

	private int cid;
	private double price;
	private String brand;

	public Computer(int cid, double price, String brand) {
		this.cid = cid;
		this.price = price;
		this.brand = brand;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", price=" + price + ", brand=" + brand + "]";
	}

	public boolean equals(Object obj) {
		Computer compObj = (Computer) obj;
		boolean isSame = false;
		if (this.brand.equals(compObj.brand) && this.cid == compObj.cid && this.price == compObj.price) {
			isSame = true;
		}
		return isSame;

	}

	public int hashCode() {
		return Objects.hash(cid, brand, price);
	}

}

public class Set1 {
	public static void main(String[] args) {

		Set<String> cityNames = new HashSet<String>();
		cityNames.add("Delhi"); // 1000 : 2 : array[2]: delhi
		cityNames.add("Mumbai");// 1200 : 3 : array[3] : mumbai
		cityNames.add("Dubai"); // 1000 : 2 : array[2]-> linked list {delhi,dubai}
		cityNames.add("Delhi");
		cityNames.add("Agra");

		// get: delhi : 1000 : 2

		System.out.println(cityNames);

		Computer computer1 = new Computer(2, 2424.4, "HCL"); // 1000 : 2
		Computer computer2 = new Computer(4, 2424424.4, "HP"); // 12000
		Computer computer3 = new Computer(5, 4545435.4, "DELL"); // 1900
		Computer computer4 = new Computer(9, 34543545.4, "Apple"); // 123000

		Set<Computer> computers = new HashSet<Computer>();
		computers.add(computer1);
		computers.add(computer2);
		computers.add(computer3);
		computers.add(computer4);

		Computer computer33 = new Computer(5, 4545435.4, "DELL"); // 1298000 : 4
		computers.add(computer33);

		System.out.println(computers);

	}
}
