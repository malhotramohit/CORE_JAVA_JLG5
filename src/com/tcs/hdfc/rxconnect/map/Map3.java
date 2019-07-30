package com.tcs.hdfc.rxconnect.map;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
	public static void main(String[] args) {
		Map<String, Double> employeeSalary = new HashMap<>();
		employeeSalary.put("David", 76000.00);
		employeeSalary.put("John", 120000.00);
		employeeSalary.put("Mark", 95000.00);
		employeeSalary.put("Steven", 134000.00);

		// java 7 for each
		System.out.println("java 7 for each");
		for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
			System.out.println("Emp name is " + entry.getKey());
			System.out.println("Emp sal is " + entry.getValue());
		}

		// java 8 for each lamda exp
		System.out.println("java 8 for each lamda exp");
		employeeSalary.forEach((empName, empSalary) -> {
			System.out.println("emp name " + empName);
			System.out.println("emp sal " + empSalary);
		});

		// java 8 for each on entryset
		System.out.println("java 8 for each on entryset");
		employeeSalary.entrySet().forEach(emp -> {
			System.out.println("name is " + emp.getKey());
			System.out.println("sale is " + emp.getValue());

		});

		// java 8 for each on key set
		System.out.println("java 8 for each on key set");
		employeeSalary.keySet().forEach(empKey -> {
			System.out.println("emp name is " + empKey);
			System.out.println("emp sal is " + employeeSalary.get(empKey));
		});

	}
}