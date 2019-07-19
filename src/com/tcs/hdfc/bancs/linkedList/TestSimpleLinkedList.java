package com.tcs.hdfc.bancs.linkedList;

interface SimpleList {
	/* This will get the object at the given index */
	public Object get(int index);

	public void set(int index, Object element);

	public void add(int index, Object element);

	public Object remove(int index);

	public int size();
}

class SimpleLinkedList implements SimpleList {

	class Item {
		Object value;
		Item next;

		public Item(Object value, Item next) {
			this.value = value;
			this.next = next;
		}
	}

	private Item start;

	/* This will get the object at the given index */
	public Object get(int index) {
		return null;
	}

	public void set(int index, Object element) {

	}

	public void add(int index, Object element) {

	}

	public Object remove(int index) {
		return null;
	}

	public int size() {
		return 0;
	}
}

public class TestSimpleLinkedList {

	public static void main(String[] args) {
		SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
		simpleLinkedList.add(0, 12);
	}

}
