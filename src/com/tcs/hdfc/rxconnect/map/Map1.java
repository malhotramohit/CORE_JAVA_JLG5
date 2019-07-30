package com.tcs.hdfc.rxconnect.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>(10);

		map1.put("One", 1);
		map1.put("two", 2);
		map1.put("three", 3);

		System.out.println("before--" + map1.get("two"));
		map1.put("two", 22);
		System.out.println("after--" + map1.get("two"));

		map1.remove("three");
		System.out.println(map1.get("three"));
		if (map1.isEmpty()) {
			System.out.println("map is empty");
		} else {
			System.out.println("map is not empty is of size" + map1.size());
		}
		map1.put("four", 4);
		map1.put("five", 5);
		map1.put("six", 6);

		// map : node1 : {K,V}, node2 : {K,V}, node 3
		// array
		// {node1,node2,node3 ...} ; set of entries
		// entrySet();

		Set<Entry<String, Integer>> entries = map1.entrySet();

		for (Entry<String, Integer> entry : entries) {
			System.out.println("key is " + entry.getKey());
			System.out.println("value is " + entry.getValue());
		}

		if (map1.containsKey("five3")) {
			System.out.println(map1.get("five"));
		} else {
			System.out.println("key not present");
		}
		
		

	}
}
