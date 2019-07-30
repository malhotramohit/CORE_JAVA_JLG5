package com.tcs.hdfc.bancs.arraylist;

import java.util.Arrays;

import com.tcs.hdfc.rxconnect.corejava.exceptionhandling.ValueNotPresentException;

interface SimpleList {
	/* This will get the object at the given index */
	public Object get(int index) throws ValueNotPresentException;

	public void set(int index, Object element);

	public void add(int index, Object element);

	public void add(Object element);

	public Object remove(int index);

	public Object remove(Object obj);

	public int size();

	public void clear();

}

class SimpleArrayList implements SimpleList {

	private Object[] array;

	SimpleArrayList(Object[] originalArray) {
		if (null != originalArray) {
			array = new Object[originalArray.length];
			for (int i = 0; i < originalArray.length; i++) {
				array[i] = originalArray[i];
			}
		}
	}

	/* This will get the object at the given index */
	public Object get(int index) throws ValueNotPresentException {
		// if index is invalid then return null : -ve or can out of range
		// else return array[index]
		if (index < 0 || index > array.length - 1) {
			throw new ValueNotPresentException("The value is not present at the index " + index);
		} else {
			return array[index];

		}
	}

	/**
	 * This function will set the value at the given index Hint : kind of replacing
	 * the value
	 */
	public void set(int index, Object element) {

	}

	/**
	 * This add will add the value at the given index and shift the other elements
	 */
	public void add(int index, Object element) {
		// since you are increasing the number of elements
		// you need to resize your array
		// { 12, 34, 18, 19 };
		int prevArraySize = array.length;
		Object[] newArray = new Object[prevArraySize + 1];
		// {null,null,null,null,null}
		// copy old to new
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		// {12 ,34,18,19,null}
		// shift : start shifting from given index
		for (int i = newArray.length - 1; i > index; i--) {
			newArray[i] = newArray[i - 1];
			// {12 ,34,18,19,null}
			// i=4
			// {12 ,34,18,19,19}
			// i=3
			// {12 ,34,18,18,19}
			// i=2
		}
		// {12, 34, 18 , 18, 19}
		// replace the given element with the element at given index
		newArray[index] = element;
		array = newArray;

	}

	/**
	 * This add will add the value at the end;
	 */
	public void add(Object element) {
		// add value at the end
		// index = array.length // 4: last index
		add(array.length, element);
	}

	/**
	 * This function will remove the value at the given index and also will return
	 * the same. Object valueToReturn = array[index] [12, 34, 100, 18, 19] index = 3
	 * Copy values from 0-index-1 (inclusive) and index (Exclusive) - length into
	 * new array array = newArray return valueToReturn
	 *
	 */
	public Object remove(int index) {
		return null;
	}

	/**
	 * This function will remove the value based on the object value passed
	 */
	public Object remove(Object obj) {
		return null;
	}

	/**
	 * This function will remove all the elements
	 */
	public void clear() {

	}

	public int size() {
		return array.length;
	}

	public String toString() {
		return Arrays.toString(array);
	}

}

public class TestSimpleArrayList {

	public static void main(String[] args) {

		try {
			// way 1
			Integer[] ageArray = { 12, 34, 18, 19 };
			SimpleArrayList simpleArrayList = new SimpleArrayList(ageArray);

			Integer integer = (Integer) simpleArrayList.get(2);
			Object age2 = simpleArrayList.get(3);
			System.out.println(integer);
			System.out.println(age2);

			// test case for invalid index
			System.out.println(simpleArrayList.get(9));
			// java.lang.ArrayIndexOutOfBoundsException: 9

			System.out.println(simpleArrayList.get(-1));
			System.out.println(simpleArrayList.get(4));

			System.out.println(simpleArrayList);
			simpleArrayList.add(2, 100);
			// 12 34 100 18 19
			System.out.println(simpleArrayList);

			simpleArrayList.add(90);
			System.out.println(simpleArrayList);

			System.out.println(simpleArrayList.get(-90));
		} catch (ValueNotPresentException e) {
			e.printStackTrace();
		}
		System.out.println("Good bye it was great learning exception handling");

	}

}
