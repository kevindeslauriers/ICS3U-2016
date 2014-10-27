/*
 * Write a program that accepts a numerical grade (int) and displays a letter grade 
 */
package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a numerical grade: ");
		int grade = scanner.nextInt();

		if (grade >= 80) {
			System.out.println('A');
		} else if (grade >= 70) {
			System.out.println('B');
		} else if (grade >= 60) {
			System.out.println('C');
		} else if (grade >= 50) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}

		System.out.println("---Done---");
	}

}
