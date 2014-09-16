/*

 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading integer data.
 * 
 * Prompt the user for three different integers and display the average of the three numbers.
 */
package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int x, y, z;
		System.out.print("Please enter three integers: ");
		
		x = keyboard.nextInt(); // Grabs the next integer
		y = keyboard.nextInt(); // Grabs the next integer
		z = keyboard.nextInt(); // Grabs the next integer
		
		double average = (x + y + z) / 3.0;
		
		System.out.println("The average of the numbers: " + x + ", " + y + " and " + z + " is " + average);
		
		keyboard.close();
		
	}

}
