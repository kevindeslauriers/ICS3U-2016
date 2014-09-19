/*
 * Given a positive number, print its square and square root.
 */
package com.bayviewglen.daysix;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		double number = keyboard.nextDouble();
		
		double square = number * number;
		double squareRoot = Math.sqrt(number);
		
		System.out.println("The number " + number + " squared is " + square);
		System.out.println("The number " + number + " square rooted is " + squareRoot);
		
		keyboard.close();
	}

}
