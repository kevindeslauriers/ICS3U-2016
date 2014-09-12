/*
 * Write a program that given the number of pennies, nickels, dimes, quarters, loonies and toonies
 * calculates how much money the user has.
 */

package com.bayviewglen.daythree;

public class Homework5 {

	public static void main(String[] args) {
		int pennies, nickels, dimes, quarters, loonies, toonies;
		double totalMoney = 0;
		
		
		pennies = 56;
		nickels = 7;
		dimes = 3;
		quarters = 3;
		loonies = 7;
		toonies = 1;
		
		totalMoney = 0.01 * pennies + 0.05 * nickels + 0.10 * dimes + 0.25 * quarters + 1 * loonies + 2 * toonies;
		
		System.out.println("There is $" + totalMoney + " in total.");
		
		
		

	}

}
