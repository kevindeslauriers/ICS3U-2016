/*
 * Display a random upper case character
 */
package com.bayviewglen.dayfour;

public class ExampleOne {

	public static void main(String[] args) {
		final int NUM_OF_LETTERS = 26;
		final int UPPER_CASE_A = 65;
		
		char letter = (char)((int)(Math.random()*NUM_OF_LETTERS)+UPPER_CASE_A);
		
		System.out.print("The random letter is: " + letter);
		letter = (char)((int)(Math.random()*NUM_OF_LETTERS)+UPPER_CASE_A);
				
		System.out.print(letter);

	}

}
