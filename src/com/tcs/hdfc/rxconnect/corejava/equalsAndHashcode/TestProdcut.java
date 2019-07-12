package com.tcs.hdfc.rxconnect.corejava.equalsAndHashcode;

class Product {
	private int id;
	private String prodName;
	private double price;

	public Product(int id, String prodName, double price) {
		this.id = id;
		this.prodName = prodName;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isSame = false;
		if (obj instanceof Product) {
			Product prod = (Product) obj;
			if (this.id == prod.id && this.prodName.equals(prod.prodName) && this.price == prod.price) {
				isSame = true;
			} else {
				isSame = false;
			}
		}
		return isSame;
	}

}

public class TestProdcut {
	public static void main(String[] args) {
		Product product1 = new Product(1, "soap", 23.89);
		Product product2 = new Product(1, "soap", 23.89);

		if (product1.equals(product2)) {
			System.out.println("same");
		} else {
			System.out.println("not name");
		}
	}

}
