package com.bayviewglen.dayone;

import java.util.Scanner;

public class CrossCountry {

	public static void main(String[] args) {
		Runner[] runners = new Runner[5];
		Scanner scanner = new Scanner(System.in);
		for (Runner r : runners){
			r = Runner.createRunner(scanner);
			display(r);
		}
		
		display(runners);

	}

	private static void display(Runner[] runners) {
		for (Runner r : runners){
			display(r);
		}
		
	}

	private static void display(Runner r) {
		System.out.println(r);
	}

	
}