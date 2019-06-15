package com.tcs.hdfc.rxconnect.corejava.constructors;

class Dog {
	private String breed;
	private String size;
	private int age;
	private String color;

	//
	Dog() {

	}

	Dog(String breed, String size, int age, String color) {
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.color = color;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "[breed=" + breed + ",size=" + size + ",age=" + age + ",color=" + color + "]";
	}

}

public class TestDog {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Labra", "Medium", 10, "Black");
		System.out.println(dog1.toString());

	}

}
