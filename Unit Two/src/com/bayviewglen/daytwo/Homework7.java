/*
 * 7.	Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 */
package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = input.nextLine();
		
		int middle = word.length()/2;
		
		String firstHalf = word.substring(0, middle);
		String secondHalf = word.substring(middle);
		
		System.out.println(secondHalf + firstHalf);
		
		input.close();

	}

}
