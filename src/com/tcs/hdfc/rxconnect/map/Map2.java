package com.tcs.hdfc.rxconnect.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

/**
 * HashMap stores value in key,value pair hus,wife Key: chris, value: linda
 * put(K,V) key : chris, Lisa // linda will be replaced with lisa
 * 
 */
public class Map2 {
	public static void main(String[] args) {

		Map<String, String> husWifeMap = new HashMap<String, String>(10);

		husWifeMap.put("Chris", "Linda");
		husWifeMap.put("Louis", "Montana");
		husWifeMap.put("Jared", "Michael");
		husWifeMap.put("Dinesh", "Deepika");
		husWifeMap.put("Sumit", "Anita");
		husWifeMap.put("Deepak", "Charu");

		System.out.println(husWifeMap);

		System.out.println("Wife of Chris is " + husWifeMap.get("Chris"));

		System.out.println("Chris got divorced");
		// husWifeMap.put("Chris", null);
		husWifeMap.remove("Chris");

		System.out.println(husWifeMap);

		System.out.println("Jared married some other girl");
		husWifeMap.put("Jared", "Julie");
		System.out.println(husWifeMap);

		// print all the key and value pairs where husband is having name
		// starting with D

		// java 7 for each
		// set of entries or set of nodes
		// entry: key, value
		Set<Map.Entry<String, String>> entries = husWifeMap.entrySet();

		for (Map.Entry<String, String> entry : entries) {
			if (entry.getKey().startsWith("D")) {
				System.out.println("Hus is " + entry.getKey());
				System.out.println("Wife is " + entry.getValue());
			}
		}

		// java 8 for each
		// ()-> lamda expression
		System.out.println("Using java 8 for each");
		husWifeMap.forEach((k, v) -> {
			if (k.startsWith("D")) {
				System.out.println("Hus is " + k);
				System.out.println("Wife is " + v);
			}

		});

		// convert hashmap values (wife) to arraylist
		List<String> husbandStartingWithDList = new ArrayList<String>(husWifeMap.size());

		for (Map.Entry<String, String> entry : husWifeMap.entrySet()) {
			if (entry.getKey().startsWith("D")) {
				husbandStartingWithDList.add(entry.getValue());
			}
		}
		System.out.println(husbandStartingWithDList);

	}
}