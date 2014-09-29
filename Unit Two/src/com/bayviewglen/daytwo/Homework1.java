/*
 * 1.	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!". Read in the name from the keyboard.
 */

package com.bayviewglen.daytwo;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a name: ");
		String name = input.nextLine();
		
		System.out.println("Hello " + name + "!");
		
		input.close();

	}

}
