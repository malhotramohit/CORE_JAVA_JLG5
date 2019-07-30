package com.tcs.hdfc.rxconnect.corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2 {
	public static void main(String[] args) {

		try {
			checkFile();
		} catch (FileNotFoundException e) {
//			System.out.println("Exception caught");
//			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	private static void checkFile() throws FileNotFoundException {

		openFile();
	}

	private static void openFile() throws FileNotFoundException {

		readFile();
	}

	private static void readFile() throws FileNotFoundException {

		// handle or declare
		// handle : try and catch
		FileInputStream fileInputStream = null;
		fileInputStream = new FileInputStream("/Users/mohitmalhotra/JDFiles/test0/sample.txt");

		System.out.println("After reading  file");
		try {
			int b = fileInputStream.read();
			System.out.print((char) b);
			while (b != -1) {
				b = fileInputStream.read();
				System.out.print((char) b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
