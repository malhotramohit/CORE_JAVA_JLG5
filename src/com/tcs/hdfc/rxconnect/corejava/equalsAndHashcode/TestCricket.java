package com.tcs.hdfc.rxconnect.corejava.equalsAndHashcode;

// always override equals method from object class
class Player {
	private int age;
	private String name;

	public Player(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [age=" + age + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// this and obj
		Player player = (Player) obj;
		if (this.age == player.age && this.name.equals(player.name)) {
			return true;
		} else {
			return false;
		}
	}

}

public class TestCricket {

	public static void main(String[] args) {
		Player player1 = new Player(25, "Dhoni"); // 1020
		Player player2 = new Player(25, "Dhoni"); // 1030

		if (player1 == player2) {
			System.out.println("They are same");
		} else {
			System.out.println("Not same");
		}
		System.out.println("using .equals");

		if (player1.equals(player2)) {
			System.out.println("They are same");
		} else {
			System.out.println("Not same");
		}

	}

}
