package com.bayviewglen.dayone;

import java.util.Scanner;

public class CrossCountry {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Runner[] runners = new Runner[5];
		
		for (Runner r : runners){
			getData(r);
			processData(r);
			displaySummary(r);
		}
		
		displaySummary(runners);

	}

	private static void displaySummary(Runner[] runners) {
		// TODO Auto-generated method stub
		
	}

	private static void displaySummary(Runner r) {
		// TODO Auto-generated method stub
		
	}

	private static void processData(Runner r) {
		// TODO Auto-generated method stub
		
	}

	private static void getData(Runner r) {
		System.out.println("Please enter runner's name (first last): ");
		String name = scanner.nextLine();
		r.setName(name);
		
		System.out.println("Please enter runner's mile one time (mm:ss.sss): ");
		r.setTime(Runner.MILE_ONE, new Time(scanner.nextLine()));
		
		System.out.println("Please enter runner's mile two time (mm:ss.sss): ");
		r.setTime(Runner.MILE_TWO, new Time(scanner.nextLine()));
		
		System.out.println("Please enter runner's finish time (mm:ss.sss): ");
		r.setTime(Runner.FINAL, new Time(scanner.nextLine()));
	}

}
