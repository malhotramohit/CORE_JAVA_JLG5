package com.tcs.hdfc.bancs.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Comparator;

class Product {
	private int id;
	private String name;
	private int qty;
	private double price;

	public Product(int id, String name, int qty, double price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}

}

public class ArrayListEx3 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		Random random = new Random(100);

		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				products.add(new Product(i, "name" + i, 34, random.nextDouble()));
			} else {
				products.add(new Product(i, "name" + i, random.nextInt(100), random.nextDouble()));
			}
		}
		System.out.println(products);

		// Collections.sort(products, Comparator.comparing(Product::getId).reversed());

		Collections.sort(products, Comparator.comparing(Product::getQty).thenComparing(Product::getId).reversed());

		Product product = Collections.max(products, Comparator.comparing(Product::getQty));
		System.out.println("max prod " + product);

		Product minProd = Collections.min(products, Comparator.comparing(Product::getPrice));
		System.out.println("min prod " + product);

		System.out.println(products);

	}

}
