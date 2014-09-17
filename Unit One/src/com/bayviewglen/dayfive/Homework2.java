/*
 * Create a program that obtains two integers, one for the amount a test is out of and another indicating 
 * what a student received. Display what percentage the student received on the test.
 */

package com.bayviewglen.dayfive;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter what the maximum score for the test: ");
		int maxScore = keyboard.nextInt();
		
		System.out.print("Please enter what the score that the student obtained out of " + maxScore + ": ");
		int studentScore = keyboard.nextInt();
		
		double percent = ((double) studentScore / maxScore) * 100;
		
		System.out.println("The student received " + studentScore + " / " + maxScore + " which equates to a " + percent + "%");
		
		keyboard.close();

	}

}
