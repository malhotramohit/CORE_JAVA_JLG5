package com.tcs.hdfc.rxconnect.corejava.composition;

class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String toString() {
		return "Book[name=" + name + ", author =" + author.toString() + ", price = " + price + ",qty =" + qty + "]";
	}

}

class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

}

public class TestAuthor {
	public static void main(String[] args) {
		Author author = new Author("Josh Bloch", "ffgg@fsfsd.com", 'M');
		System.out.println(author.getEmail());
		System.out.println(author);

		Book book1 = new Book("Effective Java", author, 334.343);
		System.out.println(book1);
		book1.setQty(23);
		System.out.println(book1);

		// print author details from book
		System.out.println(book1.getAuthor());
		// print auhor name from book1
		System.out.println(book1.getAuthor().getName());
		System.out.println("Email of author of book1 is " + book1.getAuthor().getEmail());

		//
		Book sql = new Book("Complete SQL", new Author("Mohit", "fvfgb@ggf.com", 'M'), 46.4646, 56);
		System.out.println(sql.getAuthorName());
	}

}
