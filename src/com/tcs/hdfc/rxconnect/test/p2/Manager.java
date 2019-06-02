package com.tcs.hdfc.rxconnect.test.p2;

import com.tcs.hdfc.rxconnect.corejava.inheritance.Employee;

public class Manager extends Employee {

	private int teamSize;

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void handleTeam() {
		System.out.println("I am handling team");
	}

	public void canISeePotectedVars() {
		System.out.println("Able to acsess  public attr2" + attr2);
		System.out.println("Able to acsess  public attr1" + attr1);

	}

}
