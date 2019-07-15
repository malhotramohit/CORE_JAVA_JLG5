package com.tcs.hdfc.bancs.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Author implements Comparable<Author> {

	private int id;
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

	public Author(int id, String name, String email, char gender) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int compareTo(Author auth) {
		return auth.getId() - this.getId();
	}
}

public class ArrayListEx2 {
	public static void main(String[] args) {
		Author author1 = new Author(23, "Mohit", "sdsf@fg.com", 'M');
		Author author2 = new Author(78, "Rohit", "sdsfdgh@fg.com", 'M');
		Author author3 = new Author(34, "Neeti", "neeti@fg.com", 'F');
		Author author4 = new Author(12, "Mohit", "sdsf@fg.com", 'M');
		Author author5 = new Author(90, "Rohit", "sdsfdgh@fg.com", 'M');
		Author author6 = new Author(87, "Neeti", "neeti@fg.com", 'F');

		List<Author> authors = new ArrayList<>(6);
		authors.add(author1);
		authors.add(author2);
		authors.add(author3);
		authors.add(author4);
		authors.add(author5);
		authors.add(author6);

		System.out.println(authors);

		// way 1 using comaprable
		// 1) Authhor : implement Compamparable
		// 2) override compareto and give some def
		// 3) Collections.sort(list)

		// Collections.sort(authors);
		System.out.println(authors);

		// Way 2 Java 8
		Collections.sort(authors, Comparator.comparing(Author::getEmail).reversed());

		authors.sort(Comparator.comparing(Author::getId));

		System.out.println(authors);

	}

}
