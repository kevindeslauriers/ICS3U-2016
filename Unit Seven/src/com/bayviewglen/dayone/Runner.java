package com.bayviewglen.dayone;

public class Runner {
	private String firstName;
	private String lastName;
	private Time[] times;
	
	public static final int MILE_ONE = 0;
	public static final int SPLIT_ONE = 0;
	public static final int SPLIT_TWO = 1;
	public static final int SPLIT_THREE = 2;
	public static final int FINAL = 3;
	public static final int MILE_TWO = 4;
	
	public Runner(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		times = new Time[5];
	}
	
	private Runner() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.firstName = name.split(" ")[0];
		this.lastName = name.split(" ")[1];	
	}

	public void setTime(int index, Time time) {
		times[index] = time;		
	}
	
	

	
	
	
	
	
}
