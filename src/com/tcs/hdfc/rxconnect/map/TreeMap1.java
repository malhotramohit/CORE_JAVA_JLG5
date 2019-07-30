package com.tcs.hdfc.rxconnect.map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMap1 {

	public static void main(String[] args) {
		Map<String, String> fileExtMap = new TreeMap<String, String>();
		fileExtMap.put("Python", ".py");
		fileExtMap.put("Java", ".java");
		fileExtMap.put("C++", ".cpp");
		fileExtMap.put("Unix", ".sh");
		fileExtMap.put("Basic", ".b");


		System.out.println(fileExtMap);

	}

}
