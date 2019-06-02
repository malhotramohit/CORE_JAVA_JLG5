package com.tcs.hdfc.rxconnect.test.p2;

public class Office {

	public static void main(String[] args) {
		
		// default : classes in the same package can access
		//protected : default plus + all classes in diff package can access if 
		//they inherit the class

		Manager manager1 = new Manager();
		manager1.setId(12);
		manager1.setName("Mohit");
		manager1.setSalary(33434);
		manager1.setTeamSize(23);

		System.out.println(manager1.getId());
		System.out.println(manager1.getName());
		System.out.println(manager1.getSalary());
		System.out.println(manager1.getTeamSize());

	}

}
