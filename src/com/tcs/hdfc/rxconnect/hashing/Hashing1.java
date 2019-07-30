package com.tcs.hdfc.rxconnect.hashing;

import java.util.Objects;

class MyHashMap {

	private int size;
	private Node[] table;

	public MyHashMap(int size) {
		this.size = size;
		table = new Node[size];
	}

	class Node {
		private Object ele;
		private Object key;
		private int hash;
		private Node next;

		public Node(Object ele, Object key, int hash) {
			this.ele = ele;
			this.key = key;
			this.hash = hash;
		}

	}

	public void put(Object key, Object value) {
		int hash;
		int index;
		if (key != null) {
			hash = hash(key);
			index = hash & size - 1;
			if (null != table[index]) {
				// traverse linked list
				Node ptr = table[index];
				boolean isKeyAlreadyPresent = false;
				for (Node pptr = ptr; pptr != null; pptr = pptr.next) {
					ptr = pptr;
					if (ptr.key.equals(key)) {
						// replace old value
						ptr.ele = value;
						isKeyAlreadyPresent = true;
						break;
					}
				}
				if (!isKeyAlreadyPresent) {
					Node node = new Node(value, key, hash);
					ptr.next = node;
				}

			} else {
				table[index] = new Node(value, key, hash);
			}
		}

	}

	public Object get(Object key) {
		int hash;
		int index;
		Object value = null;
		if (key != null) {
			hash = hash(key);
			index = hash & size - 1;
			if (table[index] != null) {
				for (Node pptr = table[index]; pptr != null; pptr = pptr.next) {
					if (pptr.key.equals(key)) {
						value = pptr.ele;
						break;
					}
				}
			}
		}
		return value;
	}

	private int hash(Object val) {
		return val.hashCode();
	}
}

class FullName {
	String fname;
	String lname;

	public FullName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "FullName [fname=" + fname + ", lname=" + lname + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname, lname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FullName other = (FullName) obj;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}

}

public class Hashing1 {
	public static void main(String[] args) {
		// MyHashMap hashMap = new MyHashMap(8);
		// hashMap.put("Mohit", "test");
		// hashMap.put("Rohit", "test");
		// hashMap.put("Sumit", "test");
		// hashMap.put("Mohit", "test1");
		//
		// System.out.println(hashMap.get("Mohit"));
		//
		// System.out.println("testing without hash impact");

		MyHashMap myHashMap = new MyHashMap(5);
		// FullName fullName1 = new FullName("Mohit", "Malhotra");
		// FullName fullName2 = new FullName("Rohit", "Malhotra");
		FullName fullName3 = new FullName("Malhotra", "Mohit");
		// FullName fullName4 = new FullName("Sumit", "Malhotra");
		// FullName fullName5 = new FullName("Amit", "Malhotra");
		FullName fullName33 = new FullName("Malhotra", "Mohit");

		// myHashMap.put(fullName1, "fullName1");
		// myHashMap.put(fullName2, "fullName2");
		// myHashMap.put(fullName4, "fullName4");
		// myHashMap.put(fullName5, "fullName5");
		//
		myHashMap.put(fullName3, "fullName3");
		myHashMap.put(fullName33, "fullName3 hacked");

		System.out.println(myHashMap.get(fullName3));
		System.out.println(myHashMap.get(fullName33));

	}

}
