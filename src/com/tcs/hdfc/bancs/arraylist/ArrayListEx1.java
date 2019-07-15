package com.tcs.hdfc.bancs.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface MyComaparable<T> {

	public int myCompareTo(T obj);
}

// class User implements MyComaparable<User> {
// private int id;
// private String name;
// private int age;
//
// public User(int id, String name, int age) {
// this.id = id;
// this.name = name;
// this.age = age;
// }
//
// public int getId() {
// return id;
// }
//
// public void setId(int id) {
// this.id = id;
// }
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public int getAge() {
// return age;
// }
//
// public void setAge(int age) {
// this.age = age;
// }
//
// @Override
// public String toString() {
// return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
// }
//
// public boolean equals(Object obj) {
// boolean isSame = false;
// if (obj instanceof User) {
// User user = (User) obj;
// if (this.id == user.id && this.age == user.age &&
// this.name.equals(user.name)) {
// isSame = true;
// }
// }
// return isSame;
// }
//
// // public int myCompareTo(User obj) {
// //
// // if (this.getAge() < obj.getAge()) {
// // return 1; // +ve
// // } else if (this.getAge() == obj.getAge()) {
// //
// // if (this.getId() < obj.getId()) {
// // return 1;
// // } else if (this.getId() == obj.getId()) {
// // return 0;
// // } else {
// // return -1;
// // }
// //
// // } else {
// // return -1; // -ve
// // }
// // }
// public int myCompareTo(User obj) {
// return this.getAge() - obj.getAge() == 0 ? this.getId() - obj.getId() :
// this.getAge() - obj.getAge();
// }
//
// }

class User implements Comparable<User> {
	private int id;
	private String name;
	private int age;

	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		boolean isSame = false;
		if (obj instanceof User) {
			User user = (User) obj;
			if (this.id == user.id && this.age == user.age && this.name.equals(user.name)) {
				isSame = true;
			}
		}
		return isSame;
	}

	// public int myCompareTo(User obj) {
	//
	// if (this.getAge() < obj.getAge()) {
	// return 1; // +ve
	// } else if (this.getAge() == obj.getAge()) {
	//
	// if (this.getId() < obj.getId()) {
	// return 1;
	// } else if (this.getId() == obj.getId()) {
	// return 0;
	// } else {
	// return -1;
	// }
	//
	// } else {
	// return -1; // -ve
	// }
	// }
	public int compareTo(User o) {
		return this.getAge() - o.getAge();
	}
}

public class ArrayListEx1 {

//	public static void modifiedBubbleSort(List<User> users) {
//
//		for (int j = 0; j < users.size(); j++) {
//			for (int i = 0; i < users.size() - 1 - j; i++) {
//				if (users.get(i).myCompareTo(users.get(i + 1)) > 0) {
//					User temp = users.get(i);
//					users.set(i, users.get(i + 1));
//					users.set(i + 1, temp);
//				}
//			}
//
//		}
//	}

	public static void bubbleSort(List<User> users) {

		for (int j = 0; j < users.size(); j++) {
			for (int i = 0; i < users.size() - 1 - j; i++) {
				if (users.get(i).getAge() > users.get(i + 1).getAge()) {
					User temp = users.get(i);
					users.set(i, users.get(i + 1));
					users.set(i + 1, temp);
				}
			}

		}
	}

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		User user1 = new User(1, "abcd", 23);
		User user2 = new User(44, "abdd", 24);
		User user3 = new User(8, "name3", 23);
		User user4 = new User(78, "name4", 34);
		User user5 = new User(35, "name5", 67); // 1019

		users.add(user3);
		users.add(user2);
		users.add(user1);
		users.add(user4);
		users.add(user5);

		User user55 = new User(5, "name5", 67); // 10190

		System.out.println(users);

		// will this fun remove
		users.remove(user55);

		System.out.println(users);

		if (user5.equals(user55)) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}

		// modifiedBubbleSort(users);

		Collections.sort(users);

		System.out.println(users);

	}

}
