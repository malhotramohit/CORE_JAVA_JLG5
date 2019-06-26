package com.tcs.hdfc.rxconnect.corejava.composition;

import java.util.Arrays;

class Author {

	private String name;
	private String email;
	private char gender;

	public Author() {
	}

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

}

class Book {
	private String name;
	private double price;
	private int qty;
	// private int[]
	// private double[]
	// private String[]
	private Author[] authors;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
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

	
	
//	public String toString() {
//		String authorsToString = authors[0].toString();
//		for (int i = 1; i < authors.length; i++) {
//			authorsToString = authorsToString + authors[i].toString();
//		}
//
//		return "Book[name=" + name + ",authors=" + "{ " + authorsToString + " }" + ",price=" + price + ",qty=" + qty
//				+ "]";
//	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", authors=" + Arrays.toString(authors)
				+ "]";
	}

	public String getAuthorNames() {
		// mohit , fsff@#dfdf.com,23
		// rohit , fsff@#dfdf.com,23
		// sumit , fsff@#dfdf.com,23
		String nameString = authors[0].getName(); // Mohit, rohit , Sumit
		for (int i = 1; i < authors.length; i++) {
			// nameString = Mohit
			// Mohit+","+authors[i].getName()
			nameString = nameString + "," + authors[i].getName();
		}
		return nameString;
	}

}

public class TestAuthor {

	public static void main(String[] args) {
		Author[] authors = new Author[3];

		Author author1 = new Author("Mohit", "sdsf@fg.com", 'M');
		Author author2 = new Author("Rohit", "sdsfdgh@fg.com", 'M');
		Author author3 = new Author("Neeti", "neeti@fg.com", 'F');

		authors[0] = author1;
		authors[1] = author2;
		authors[2] = author3;

		Book book = new Book("Effective java", authors, 323.23, 34);
		System.out.println(book);
		System.out.println(book.getAuthorNames());
		// book, authorName ->> return index , -1
		int index = checkIfAuthorExists(book, "Neeti");
		if (index > -1) {
			System.out.println("It is present at index " + index);
		} else {
			System.out.println("Not present");
		}

	}

	public static int checkIfAuthorExists(Book book, String nameOfAuthor) {
		int index = -1;
		Author[] authors = book.getAuthors();
		for (int i = 0; i < authors.length; i++) {
			if (authors[i].getName().equals(nameOfAuthor)) {
				index = i;
				break;
			}
		}

		return index;
	}

}

// class Book {
// private String name;
// private Author author;
// private double price;
// private int qty;
//
// public Book(String name, Author author, double price) {
// this.name = name;
// this.author = author;
// this.price = price;
// }
//
// public Book(String name, Author author, double price, int qty) {
// this.name = name;
// this.author = author;
// this.price = price;
// this.qty = qty;
// }
//
// public String getName() {
// return name;
// }
//
// public Author getAuthor() {
// return author;
// }
//
// public double getPrice() {
// return price;
// }
//
// public void setPrice(double price) {
// this.price = price;
// }
//
// public int getQty() {
// return qty;
// }
//
// public void setQty(int qty) {
// this.qty = qty;
// }
//
// public String getAuthorName() {
// return author.getName();
// }
//
// public String toString() {
// return "Book[name=" + name + ", author =" + author.toString() + ", price = "
// + price + ",qty =" + qty + "]";
// }
//
// }
//
// class Author {
// private String name;
// private String email;
// private char gender;
//
// public Author(String name, String email, char gender) {
// this.name = name;
// this.email = email;
// this.gender = gender;
// }
//
// public String getName() {
// return name;
// }
//
// public String getEmail() {
// return email;
// }
//
// public void setEmail(String email) {
// this.email = email;
// }
//
// public char getGender() {
// return gender;
// }
//
// public String toString() {
// return "Author [name=" + name + ", email=" + email + ", gender=" + gender +
// "]";
// }
//
// }
//
// public class TestAuthor {
// public static void main(String[] args) {
// Author author = new Author("Josh Bloch", "ffgg@fsfsd.com", 'M');
// System.out.println(author.getEmail());
// System.out.println(author);
//
// Book book1 = new Book("Effective Java", author, 334.343);
// System.out.println(book1);
// book1.setQty(23);
// System.out.println(book1);
//
// // print author details from book
// System.out.println(book1.getAuthor());
// // print auhor name from book1
// System.out.println(book1.getAuthor().getName());
// System.out.println("Email of author of book1 is " +
// book1.getAuthor().getEmail());
//
// //
// Book sql = new Book("Complete SQL", new Author("Mohit", "fvfgb@ggf.com",
// 'M'), 46.4646, 56);
// System.out.println(sql.getAuthorName());
// }
