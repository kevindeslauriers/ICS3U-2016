/*
 * This example is to review escape sequences.
 */
package com.bayviewglen.daythree;

public class ExampleOne {
	public static void main(String[] args){
		// There are things that can go in the quotes that cause issues
		System.out.println("There is no issue!");
		
		// The following characters could cause an issue \, ", ',
		// So we can escape them using the backslash
		
		System.out.println("This \"is\" important!");
		
		System.out.println("This\nis\nimportant!");
		
		// System.out.println("This \g is important!");  /g is not an escape sequence
		
		
	}
}
