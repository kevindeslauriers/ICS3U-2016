/*
 * The Golden Sales Company pays its salespeople $0.27 for each item they sell.
 * Given the number of items sold by a salesperson, print the amount of pay due.
 */
package com.bayviewglen.daysix;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the number of items sold: ");
		int numberSold = keyboard.nextInt();
		
		double commisionPerUnit = 0.27;
		double commision = commisionPerUnit * numberSold;
		
		double commisionFormatted = (int)(commision * 100)/100.0;
		
		System.out.println("The total commision for selling " + numberSold + " units is $" + commisionFormatted);
		
		keyboard.close();
	}

}
 