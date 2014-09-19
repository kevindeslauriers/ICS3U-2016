/*
 * Susan purchases a computer for $985. The sales tax on the purchase is 5.5 percent. Compute and print the total purchase price.
 */
package com.bayviewglen.daysix;

public class Homework1 {

	public static void main(String[] args) {
		double tax = 0.05;
		double price = 985;
		
		double total = price + price * tax;
		
		System.out.println("The price is: $" + total);

	}

}
